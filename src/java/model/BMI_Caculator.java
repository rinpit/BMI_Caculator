/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pham Thinh
 */
public class BMI_Caculator {

    public double weight;
    public double height;

    public BMI_Caculator() {
    }

    public BMI_Caculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double BMI_result() {
        return (double) weight / ((height * height)/10000);
    }

    public String BMI_status() {
        String result ="";
        
        if (BMI_result()< 19) {
            result = "Under-standard";
        }

        if (19 <= BMI_result() && BMI_result() <= 25) {
            result = "Standard";
        }

        if (25 < BMI_result() && BMI_result() <= 30) {
            result = "Overweight";
        }

        if (30 < BMI_result() && BMI_result() <= 40) {
            result = "Fat - should lose weight";
        }
        
        if (BMI_result() > 40) {
            result = "Very fat - should lose weight immediately";
        }
        
    return result;
    }
}
