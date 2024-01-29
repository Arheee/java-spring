package fr.arheee.demospringcontroller.exercices.temperatures;

import lombok.Data;

@Data
public class ConversionRequest {
        private double value;
        private String unit;
}
