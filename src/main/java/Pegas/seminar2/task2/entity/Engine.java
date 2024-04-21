package Pegas.seminar2.task2.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Engine {
    private String typeEngine = "petrol";

    public Engine() {
        System.out.println("Bean engine was created");
    }
}
