package com.company.interfaceShapes;

public class Circle implements iShapes {
    private double radius;
    private boolean isDisplayed;

    public Circle (double radius){
        this.radius = radius;
        this.isDisplayed = false;
    }

    @Override
    public double calculateArea(){
        double area = Math.PI*(radius*radius);
        System.out.println("Area is "+area);
        return area;
    }
    @Override
    public boolean display(){
        if(!isDisplayed) {
            System.out.println("Shape is now displayed!");
        }
        else{
            System.out.println("Shape is no longer displayed");
        }
        isDisplayed = !isDisplayed;
        System.out.println("display is "+isDisplayed);
        return isDisplayed;
    }
}
