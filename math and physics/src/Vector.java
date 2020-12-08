
import java.util.Scanner;


public class Vector {
    private String isim ;
    private int i ;
    private int j ;
    private int k ;
    //üç boyutlu vektor
    public Vector(String isim){
        this.isim = isim ;
        Scanner scn = new Scanner(System.in);
        System.out.println(isim+ " i ,j ,k değerlerini giriniz :");
        System.out.println("i =");
        this.i = scn.nextInt();
        System.out.println("j =");
        this.j = scn.nextInt();
        System.out.println("k =");
        this.k = scn.nextInt();
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
}
