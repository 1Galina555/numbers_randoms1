package service.example.numbers_random.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.example.numbers_random.entity.Numbers;
import service.example.numbers_random.entity.dto.Response;
import serviceNum.ServiceNum;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/number")
@RequiredArgsConstructor    //Спринг сам внедрит зависимость репозитория.
public class    GetController {
        private final ServiceNum postService;
        @PostMapping ("/number")
        public Numbers postNumber() {
                return postService.generateRandomNumber();
        }
        @GetMapping("/number/last")
        public List<Numbers> getListNumbers() {
                return postService.lastNumbers();
        }

}


