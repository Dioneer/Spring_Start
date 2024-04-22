package Pegas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunnerHw {
    public static void main(String[] args) {
        var context = SpringApplication.run(ApplicationRunnerHw.class, args);
        /**
         * lection2
         */
//        Car car = context.getBean(Car.class);
//        car.start();
        /**
         * seminar2 task1
         */
//        EntityCar entityCar1 = context.getBean("car1", EntityCar.class);
//        System.out.println(entityCar1);
//        EntityCar entityCar2 = context.getBean("car2", EntityCar.class);
//        System.out.println(entityCar2);
        /**
         * seminar2 task2
         */
//        BigCar bigCar = context.getBean(BigCar.class);
//        bigCar.show();
        /**
         * seminar2 task3
         */
//        Unicorn unicorn = context.getBean(Unicorn.class);
//        System.out.println(unicorn);

    }
}
