package service.example.numbers_random.entity.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
public class Request {
    private Integer id;
    private Integer number;
    private LocalDateTime time;
}
