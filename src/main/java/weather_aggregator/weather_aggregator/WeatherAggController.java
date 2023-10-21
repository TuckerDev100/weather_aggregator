package weather_aggregator.weather_aggregator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherAggController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
    
}
