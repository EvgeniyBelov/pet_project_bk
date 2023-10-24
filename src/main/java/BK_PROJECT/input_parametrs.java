package BK_PROJECT;

import java.util.Scanner;

public class input_parametrs {
    public static void main(String[]args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Введите первый коэффициент: ");
        Double kf1 = SC.nextDouble();
        System.out.println("Введите сумму ставки на первый матч: ");
        double sum1 = SC.nextDouble();
        System.out.println("Введите второй коэффициент: ");
        double kf2 = SC.nextDouble();
        System.out.println("Введите сумму ставки на второй матч: ");
        double sum2 = SC.nextDouble();
        System.out.println("Коэффициент №1 сыграл? (true / false)");
        boolean pari1 = SC.nextBoolean();
        System.out.println("Коэффициент №2 сыграл? (true / false)");
        boolean pari2 = SC.nextBoolean();



        calculation calculation = new calculation(kf1, sum1, kf2, sum2, pari1, pari2);


    }
}
