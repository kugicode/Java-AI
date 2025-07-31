// DataPoint.java
// If you chose to put it in a package when creating the file in NetBeans, 
// the first line might look something like: package com.aimodule.week2;
// Otherwise, you can just paste the code starting from 'public class DataPoint'.

public class DataPoint {
    // Features of our data point
    private double sweetness;
    private double colorIntensity;

    // The actual class/label of this data point (e.g., "Apple", "Orange")
    // For now, we'll keep it as a string, but in ML, it's often an integer.
    private String label; 

    //parameterized constructor
    public DataPoint(double sweetness, double colorIntensity, String label){
    this.sweetness = sweetness;
    this.colorIntensity = colorIntensity;
    this.label = label;
    }
    
    //getter methdods
    public double getSweetness(){
        return sweetness;
    }
    
    public double getColorIntensity(){
        return colorIntensity;
    }
    
    public String getLabel(){
        return label;
    }
    
    //toString method to transfrom the object into a string
    @Override
    public String toString(){
    return "DataPoint: [sweetness = " + sweetness + ", colorIntensity = " + colorIntensity + ", label = " + label + "]";
    }
    
    public double calculateDistance(DataPoint otherPoint){
    
    double diffSweetness = this.sweetness - otherPoint.getSweetness();
    
    double diffColorIntensity = this.colorIntensity - otherPoint.getColorIntensity();
    
    double squaredDiffSweetness = diffSweetness * diffSweetness;
            
    double squaredDiffColorIntensity = diffColorIntensity * diffColorIntensity;
    
    return Math.sqrt(squaredDiffSweetness + squaredDiffColorIntensity);
    }
    
    

    // The main method serves as the entry point for this program.
    // We're using it here to demonstrate how to create and print DataPoint objects.
    public static void main (String[] args){
    DataPoint apple1 = new DataPoint(0.8, 0.7, "Apple");
    DataPoint orange1 = new DataPoint(0.6, 0.9, "Orange");
    DataPoint apple2 = new DataPoint(0.75, 0.68, "Apple");
    
    
    DataPoint unknownFruit = new DataPoint(0.7, 0.8, "Unknown");
      
    System.out.println(apple1);
    System.out.println(orange1);
    System.out.println(apple2);
    
    // Calculate distance between apple1 and orange1
    double distApple1Orange1 = apple1.calculateDistance(orange1);
    System.out.println("Distance between Apple1 and Orange1: " + String.format("%.4f", distApple1Orange1));
    // String.format("%.4f", ...) is used to print the double with 4 decimal places for neatness.
    
    
    }
    
    
}