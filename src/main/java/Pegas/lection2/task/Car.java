package Pegas.lection2.task;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("web&prod")
public class Car {
    private Engine engine;
    public void start(){
        System.out.println("GO!");
    }
}
