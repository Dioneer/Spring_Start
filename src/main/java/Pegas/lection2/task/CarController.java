package Pegas.lection2.task;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {
    private final Car car;

    @GetMapping("/car")
    public String startCar(){
        car.start();
        return "Start driving";
    }
}
