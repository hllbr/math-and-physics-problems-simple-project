
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        System.out.println("****************************************");
        System.out.println("Matemetik ve Fizik Problemleri programına Hoşgeldiniz ....");

        String islemler = "islemler ...\n"
                + "1. islem Daire Alanı Hesaplama\n"
                + "2. Üçgen Çevresi Hesaplama\n"
                + "3. 2 adet vektörün iç çarpımını hesaplama\n"
                + "q çıkış için q'ya basınız";
        System.out.println("****************************************");
        while (true) {

             System.out.println(islemler);
             System.out.println("***************************************");
             System.out.println("İşleminizi seçiniz :");
             String islem = scn.nextLine();
             if(islem.equals("q")){
                 System.out.println("islemler sonlandırılıyor.");
                 Thread.sleep(3000);
                 System.out.println("Matemetik ve Fizik Problemleri programından çıkıldı.İyi günler dileriz.");
                 break;
                 
             }else if(islem.equals("1")){
                 System.out.println("bir yarı çap giriniz =");
                 int yarıcap = scn.nextInt();
                 scn.nextLine();
                 Problem.Matematik.daireAlan(yarıcap);
             }else if(islem.equals("2")){
                System.out.println("Kenar 1'i giriniz :");
                int kenar1 = scn.nextInt();
                System.out.println("Kenar 2'i giriniz :");
                int kenar2 = scn.nextInt();
                System.out.println("Kenar 3'i giriniz :");
                int kenar3 = scn.nextInt();
                scn.nextLine();
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
             }else if(islem.equals("3")){
                 Vector vector1 = new Vector("vektor1");
                 Vector vector2 = new Vector("vEktor2");
                 Problem.Fizik.icCarpım(vector1, vector2);
             }else{
                 System.out.println("Geçersiz İşlem");
             }
        }
       
    }
    
}
