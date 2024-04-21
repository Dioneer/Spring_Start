package Pegas.seminar2.task2.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class BigCar {
    private String model = "X1";
    private String made = "BMW";
    private final Engine carEngine;

    public void show(){
        System.out.println(carEngine.getTypeEngine());
    }
}
