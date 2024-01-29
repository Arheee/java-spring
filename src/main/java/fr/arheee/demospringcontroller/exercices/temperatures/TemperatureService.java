package fr.arheee.demospringcontroller.exercices.temperatures;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    public TemperatureType convertTemperature(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "celsius":
                return new TemperatureType(value);
            case "fahrenheit":
                return new TemperatureType((value - 32) / 1.8);
            case "kelvin":
                return new TemperatureType(value - 273.15);
            default:
                throw new IllegalArgumentException("Unit not supported: " + unit);
        }
    }
}
