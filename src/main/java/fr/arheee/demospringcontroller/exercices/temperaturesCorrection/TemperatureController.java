package fr.arheee.demospringcontroller.exercices.temperaturesCorrection;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {
    private final TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping
    public Thermometre getDefaultTemperatureFromCelsius(@RequestParam(defaultValue = "0") double celsius){
        return  temperatureService.getDefaultTemperature(celsius);
    }

    @PostMapping("/convert")
    public Thermometre convertTemperature(@RequestBody ThermometreDto convert){
        return null;
        }
    
}
