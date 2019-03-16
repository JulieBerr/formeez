package CarreTriangleRond;

public class Main {
    public static void main(String[] args) {
        Cercle c=new Cercle(10, 0,0);
        String sc=c.toString(); 
        System.out.println(sc);
        
        Triangle t=new Triangle(0,0);
        String st=t.toString(); 
        System.out.println(st);
        
        Carre ca=new Carre(0,0,10);
        String sca=ca.toString(); 
        System.out.println(sca);
    }

}
