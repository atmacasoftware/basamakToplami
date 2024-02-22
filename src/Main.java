import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi, basamak = 0, val, sonuc=0, geciciSayi;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();
        geciciSayi = sayi;
        while (geciciSayi != 0){
            val = geciciSayi % 10;
            geciciSayi /= 10;

            sonuc += val;

        }
        System.out.println(sayi + " sayısının basamakları toplamı : " + sonuc);

    }
}