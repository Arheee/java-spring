package fr.arheee.demospringcontroller.exercices.temperaturesCorrection;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Thermometre {
    private double Kelvin;

    public double getCelsius(){
        return this.Kelvin - 273.15;
    }

    public double getFahrenheit(){
        return this.Kelvin * 9/ 5 - 459.67;
    }

    public void setCelsius(double celsius){
        this.Kelvin = celsius + 273.15;
    }
    public void setFahrenheit(double fahrenheit){
        this.Kelvin = (fahrenheit+ 459.67) * 5 / 9;
    }
}
