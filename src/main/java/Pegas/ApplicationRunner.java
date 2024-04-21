package Pegas;

import Pegas.lection2.task.Car;
import Pegas.seminar2.task1.entity.EntityCar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args) {
        var context = SpringApplication.run(ApplicationRunner.class, args);
        /**
         * lection2
         */
//        Car car = context.getBean(Car.class);
//        car.start();
        /**
         * seminar2
         */
        EntityCar entityCar1 = context.getBean("car1", EntityCar.class);
        System.out.println(entityCar1);
        EntityCar entityCar2 = context.getBean("car2", EntityCar.class);
        System.out.println(entityCar2);
    }
}
