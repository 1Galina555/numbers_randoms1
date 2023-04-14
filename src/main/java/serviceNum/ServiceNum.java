package serviceNum;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import service.example.numbers_random.Repository.RepositoryNumber;
import service.example.numbers_random.entity.Numbers;
import service.example.numbers_random.entity.dto.Request;
import service.example.numbers_random.entity.dto.Response;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static org.aspectj.bridge.Version.getTime;


@RequiredArgsConstructor
@Service
public class ServiceNum {
   private final RepositoryNumber numberRepository;
   @Scheduled(fixedRate = 12000)
   public Numbers generateRandomNumber(){

      Random random = new Random();
      Integer id=random.nextInt();
      Integer num=random.nextInt();
      LocalDateTime time=LocalDateTime.now();
      Numbers number=new Numbers(id,num,time);
numberRepository.save(number);
   return number;
   }
public List<Numbers> lastNumbers(){
   LocalDateTime now=LocalDateTime.now().minusHours(1);
   List<Numbers> collect = numberRepository.findAll()
           .stream()
           .filter(n -> n.getTime().isAfter(now))
           .collect(Collectors.toList());
   return collect;
}
}
