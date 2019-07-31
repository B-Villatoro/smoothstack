package com.company.interfaceShapes;

public class Rectangle implements iShapes {
    private double width;
    private double length;
    private boolean isDisplayed;

    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
        this.isDisplayed = false;
    }


    @Override
    public double calculateArea(){
        double area = width*length;
        System.out.println(area);
        return area;
    }
    @Override
    public boolean display(){
        if(isDisplayed) {
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
