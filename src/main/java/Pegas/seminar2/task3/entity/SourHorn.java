package Pegas.seminar2.task3.entity;

import Pegas.seminar2.task3.intefaces.iHorn;
import org.springframework.stereotype.Component;

@Component
public class SourHorn implements iHorn {
    @Override
    public void startMagic() {
        System.out.println("SourHorn");
    }
}
