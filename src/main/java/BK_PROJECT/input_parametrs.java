package BK_PROJECT;

import java.util.Scanner;

public class input_parametrs {
    public static void main(String[]args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Введите первый коэффициент: ");
        Double kf1 = SC.nextDouble();
        System.out.println("Введите сумму ставки на первый матч($): ");
        double sum1 = SC.nextDouble();
        System.out.println("Введите второй коэффициент: ");
        double kf2 = SC.nextDouble();
        System.out.println("Введите сумму ставки на второй матч($): ");
        double sum2 = SC.nextDouble();
        System.out.println("Коэффициент №1 сыграл? (да / нет)");
        String pari1 = SC.next();
        System.out.println("Коэффициент №2 сыграл? (да / нет)");
        String pari2 = SC.next();



        calculation calculation = new calculation(kf1, sum1, kf2, sum2, pari1, pari2);


    }
}
