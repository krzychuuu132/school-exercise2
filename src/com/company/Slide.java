package com.company;

public class Slide extends Slider{
    String render() {
        System.out.println("renderuje indicatory na stronie");
        return "render";
    }
}
