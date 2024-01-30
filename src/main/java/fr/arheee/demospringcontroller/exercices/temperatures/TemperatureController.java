package fr.arheee.demospringcontroller.exercices.temperatures;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    private final TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping
    public TemperatureType getDefaultTemperature() {
        return new TemperatureType(0);
    }

    @GetMapping(params = "celsius") ///temperature?celsius=0
    public TemperatureType getTemperature(@RequestParam double celsius) {

        return new TemperatureType(celsius);
    }

    @PostMapping("/convert")
    public TemperatureType convertTemperature(@RequestBody ConversionRequest request) {
        return temperatureService.convertTemperature(request.getValue(), request.getUnit());
    }
}
