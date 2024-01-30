package fr.arheee.demospringcontroller.exercices.temperaturesCorrection;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    public Thermometre getDefaultTemperature(Double temperature) {
        Thermometre thermometre = new Thermometre();
        thermometre.setCelsius(temperature);
        return thermometre;
    }

    public Thermometre getDefaultTemperature() {
       return this.getDefaultTemperature(0.0);
    }

    public Thermometre getTemperature(String unit, double value) {
       Thermometre temperature = this.getDefaultTemperature(0.0);

        if(unit.equals("fahrenheit")){
            temperature.setFahrenheit(value);
        }
        return temperature;
    }
}
