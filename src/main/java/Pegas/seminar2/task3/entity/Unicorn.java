package Pegas.seminar2.task3.entity;

import Pegas.seminar2.task3.intefaces.iHorn;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Unicorn {
    private String model = "Horse";
    private String made = "Dream";
    private final iHorn iHorn;

    public void start(){
        iHorn.startMagic();
    }
}
