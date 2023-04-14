package service.example.numbers_random.entity.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class Response {
    private Integer id;
    private Integer number;
    private LocalDateTime time;
}
