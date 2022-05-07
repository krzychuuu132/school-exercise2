package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Klasyfikacja :
        - obiekt Slider, Obiekt Slide, Obiekt Indicators
        - Chcemy utworzyć slider z podanych obiektów
        - Chcemy aby slidy zmieniały się automatycznie,
        - Chcemy aby slidy zmieniały się po kliknięciu w indicator
        */

         Slider slider = new Slider();

         Slide slide = new Slide();
         slide.render();

         Indicator indicator = new Indicator();

         indicator.render();

    }
}
