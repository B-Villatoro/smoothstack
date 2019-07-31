package com.company.interfaceShapes;

public class Triangle implements iShapes {
    private double side1;
    private double side2;
    private double side3;
    private double semiPerimeter;
    private boolean isDisplayed;

    public Triangle(double one,double two, double three){
        this.side1 = one;
        this.side2 = two;
        this.side3 = three;
        this.semiPerimeter= (side1+side2+side3)/2;
        this.isDisplayed = false;
    }

    @Override
    public double calculateArea(){
        double area = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
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
