package KafkaDTO;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private String name;
    private String type;
    private Integer wheels;
}
