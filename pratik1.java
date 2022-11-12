import java.util.Scanner;

public class pratik1 {
    public static void main(String[] args) {
        double tutar, kdvOrani1= 0.18, kdvOrani2= 0.8 ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz:  ");
        tutar = inp.nextDouble();

        double kdvTutari = (tutar >= 0 && tutar <= 1000) ? (tutar*kdvOrani1) : (tutar*kdvOrani2);
        double kdvliFiyat = (tutar >= 0 && tutar <= 1000) ? (tutar*kdvOrani1) + tutar
                : (tutar*kdvOrani2) + tutar;

        String kdvOrani3  = (tutar >= 0 && tutar<=1000) ? "KDV Orani - 18%" : "KDV Orani - 8%";
        System.out.println(kdvOrani3);
        System.out.println("kdvsiz Tutar: "+ tutar);
        System.out.println("kdv tutarı: "+ kdvTutari);
        System.out.println("kdvli tutar: "+ kdvliFiyat);

    }
}
