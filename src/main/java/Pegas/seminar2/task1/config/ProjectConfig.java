package Pegas.seminar2.task1.config;

import Pegas.seminar2.task1.entity.EntityCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ProjectConfig {

    @Bean(name="car1")
    public EntityCar create1(){
        return EntityCar.builder()
                .model("CRV")
                .made("Honda")
                .build();
    }
    @Bean(name="car2")
    @Lazy
    public EntityCar create2(){
        return EntityCar.builder()
                .model("Vesta")
                .made("Lada")
                .build();
    }
}
