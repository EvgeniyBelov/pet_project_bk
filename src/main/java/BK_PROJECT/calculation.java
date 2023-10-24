package BK_PROJECT;

import java.util.Scanner;

public class calculation extends input_parametrs {
    private double kf1;
    private double kf2;
    private double sum1;
    private double sum2;
    public calculation(Double kf1, double sum1, double kf2, double sum2, boolean pari1, boolean pari2) {

        this.kf1 = kf1;
        this.kf2 = kf2;
        this.sum1 = sum1;
        this.sum2 = sum2;



        if (pari1 = true) {
            double V1 = kf1*sum1;
            System.out.println("Ваш выигрыш: " + V1 + " $");
        } else if (pari1 = false){
            System.out.println("Сегодня не Ваш день :(");
        } else {
            System.out.println("Укажите результат пари");

        }

        if (pari2 = true) {
            double V2 = kf2*sum2;
            System.out.println("Ваш выигрыш: " + V2 + " $");
        } else {
            System.out.println("Сегодня не Ваш день :(");
        }
    }


}
