package com.company;

public abstract  class BaseSlider {
    int index = 0;

   abstract void setInterval(); // Implementacja automatycznej zmiany slajdów

    abstract void changeSlide(); // Metoda zmiany slajdu

    abstract void changeSlideByIndicator(); // Zmiana slajdu po kliknięciu  w indikator
}
