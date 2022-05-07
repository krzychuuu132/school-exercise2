package com.company;

public class Slider extends BaseSlider{
    String[] slides;
    public void setInterval() {
        this.changeSlide();
    }

    public void changeSlide() {
        this.index++;
    }

    public void changeSlideByIndicator() {
        this.index++;
    }
}
