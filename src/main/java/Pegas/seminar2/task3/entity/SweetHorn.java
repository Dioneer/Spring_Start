package Pegas.seminar2.task3.entity;

import Pegas.seminar2.task3.intefaces.iHorn;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SweetHorn implements iHorn {
    @Override
    public void startMagic() {
        System.out.println("SweetHorn");
    }
}
