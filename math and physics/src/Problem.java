
public class Problem {//Static Inner Class
    public static class Matematik{//Inner class
        public static void daireAlan(int yarı_cap){
            System.out.println("Dairenizin Alanı :"+(yarı_cap*yarı_cap*Math.PI));
        }
        public static void ucgenCevresi(int kenar1,int kenar2,int kenar3){
            System.out.println("Üçgenin Çevresi = "+(kenar1+kenar2+kenar3));
        }
    }
    public static class Fizik{//Inner class
        public static void icCarpım(Vector vector1,Vector vector2){
            int iccarpım = vector1.getI()*vector2.getI()+vector1.getJ()*vector2.getJ()+vector1.getK()*vector2.getK();
            System.out.println(vector1.getIsim() + " ile " + vector2.getIsim() + " in iç çarpımları = " + iccarpım);
            
        }
    }
    
    
}
