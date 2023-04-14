package service.example.numbers_random.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "random_numbers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Numbers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "number")
    private Integer number;

    @Column(name = "time")
    private LocalDateTime time;

    public LocalDateTime getTime() {
        return time;
    }
}
