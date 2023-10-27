package BK_PROJECT;

import java.util.Scanner;

public class input_parametrs {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        boolean type_of_kf1 = true;
        Double kf1 = null;
        do {
            System.out.println("Введите первый коэффициент: ");
            String inputKf1 = SC.nextLine();
            try {
                kf1 = Double.parseDouble(inputKf1);
                System.out.println("Ваш коэффициент: " + kf1);
                type_of_kf1 = true;
            } catch (NumberFormatException e) {
                type_of_kf1 = false;
                System.out.println("Некорректный ввод");
            }
        }
        while (type_of_kf1 == false);


        boolean type_of_sum1 = true;
        Double sum1 = null;
        do {
            System.out.println("Введите сумму ставки: ");
            String inputSum1 = SC.nextLine();
            try {
                sum1 = Double.parseDouble(inputSum1);
                System.out.println("Сумма пари на коэффициент " + kf1 + " - " + sum1 + " $");
                type_of_sum1 = true;
            } catch (NumberFormatException e) {
                type_of_sum1 = false;
                System.out.println("Некорректный ввод");
            }
        }
        while (type_of_sum1 == false);

        boolean type_of_kf2 = true;
        Double kf2 = null;
        do {
            System.out.println("Введите второй коэффициент: ");
            String inputKf2 = SC.nextLine();
            try {
                kf2 = Double.parseDouble(inputKf2);
                System.out.println("Ваш коэффициент: " + kf2);
                type_of_kf2 = true;
            } catch (NumberFormatException e) {
                type_of_kf2 = false;
                System.out.println("Некорректный ввод");
            }
        }
        while (type_of_kf2 == false);

        boolean type_of_sum2 = true;
        Double sum2 = null;
        do {
            System.out.println("Введите сумму ставки: ");
            String inputSum2 = SC.nextLine();
            try {
                sum2 = Double.parseDouble(inputSum2);
                System.out.println("Сумма пари на коэффициент " + kf2 + " - " + sum2 + " $");
                type_of_sum2 = true;
            } catch (NumberFormatException e) {
                type_of_sum2 = false;
                System.out.println("Некорректный ввод");
            }

        }
        while (type_of_sum2 == false);


        boolean result_pari_1;
        String pari1;
        do {
            System.out.println("Коэффициент №1 сыграл? (да / нет)");
            pari1 = SC.next();
            if (pari1.equalsIgnoreCase("да")) {
                result_pari_1 = true;
            } else if (pari1.equalsIgnoreCase("нет")) {
                result_pari_1 = true;
            } else {
                System.out.println("Введите 'да' или 'нет'");
                result_pari_1 = false;
            }
        }


        while (result_pari_1 == false);


        boolean result_pari_2;
        String pari2;
        do {
            System.out.println("Коэффициент №2 сыграл? (да / нет)");
            pari2 = SC.next();
            if (pari2.equalsIgnoreCase("да")) {
                result_pari_2 = true;
            } else if (pari2.equalsIgnoreCase("нет")) {
                result_pari_2 = true;
            } else {
                System.out.println("Введите 'да' или 'нет'");
                result_pari_2 = false;
            }
        }


        while (result_pari_2 == false);


        calculation calculation = new calculation(kf1, sum1, kf2, sum2, pari1, pari2);


    }
}