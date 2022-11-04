package patika_pratik;

import java.util.Scanner;

public class Manav_kasa_programi {
    public static void main(String[] args) {
        double Armut = 2.14; double Elma=3.67; double Domates=1.11; double Muz=0.95; double Patlıcan=5;
        double Toplamucret;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut kac kilo alacaksınız:");
        Armut =scanner.nextDouble();

        System.out.println("Elma kac kilo alacaksınız:");
        Elma =scanner.nextDouble();

        System.out.println("Domates kac kilo alacaksınız:");
        Domates =scanner.nextDouble();

        System.out.println("Muz kac kilo alacaksınız:");
        Muz =scanner.nextDouble();

        System.out.println("Patlıcan kac kilo alacaksınız:");
        Patlıcan =scanner.nextDouble();
        Toplamucret= (Armut*2.14 + Elma*3.67 + Domates*1.11 + Muz*0.95 + Patlıcan*5);

        System.out.println("ÖDEMENİZ GEREKEN TOPLAM UCRET:"+Toplamucret);




    }
}
