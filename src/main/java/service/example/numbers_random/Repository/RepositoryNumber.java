package service.example.numbers_random.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import service.example.numbers_random.entity.Numbers;

public interface RepositoryNumber extends JpaRepository<Numbers, Integer> {

}
