package BK_PROJECT;

public class calculation extends input_parametrs {
    private double kf1;
    private double kf2;
    private double sum1;
    private double sum2;

    private String pari1;
    private String pari2;


    public calculation (Double kf1, Double sum1, Double kf2, Double sum2, String pari1, String pari2) {

        this.kf1 = kf1;
        this.kf2 = kf2;
        this.sum1 = sum1;
        this.sum2 = sum2;
        this.pari1 = pari1;
        this.pari2 = pari2;
        String result_pari_successfully = "да";
        String result_pari_fail = "нет";


        System.out.println("Результат пари №1: ");
        if (pari1.equals(result_pari_successfully)) {
            double V1 = kf1*sum1;
            double P1 = V1-sum1;
            System.out.println("Ваш выигрыш: " + V1 + " $");
            System.out.println("Ваша чистая прибыль: " + P1 + " $");
        } else  {
            System.out.println("Сегодня не Ваш день :( \n Убыток " + sum1 + " $");
        }


        System.out.println("Результат пари №2: ");
        if (pari2.equals(result_pari_successfully)) {
            double V2 = kf1*sum1;
            double P2 = V2-sum1;
            System.out.println("Ваш выигрыш: " + V2 + " $");
            System.out.println("Ваша чистая прибыль: " + P2 + " $");
        } else {
            System.out.println("Сегодня не Ваш день :( \n Убыток " + sum2 + " $");
        }
    }

}
