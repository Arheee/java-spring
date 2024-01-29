package fr.arheee.demospringcontroller.exercices.temperatures;
import lombok.Getter;

@Getter
public class TemperatureType{
    private final double celsius;
    private final double fahrenheit;
    private final double kelvin;

    public TemperatureType(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = celsius * 1.8 + 32;
        this.kelvin = celsius + 273.15;
    }

}
