package CarreTriangleRond;
import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    int i=Quizz.N();
    Quizz.q(i);
    
  }
}

// you can add other public classes to this editor in any order
public class Quizz
{
 
  public static void q(int i){
    String [] s = {" L'air d'un cercle ? ", " L'air d'un Carre ? ", " L'air d'un Triangle ? "," Quel est le rayon d'un cercle? ", " Thales ? ", " Pythagore ? ", " Combien de cotes a un triangle? ", "Combien de cotes a un carre ? " };
    System.out.print(s[i]);
   }
  
  public static int N(){
  
    H h = new H(0,7,1);
    int [] n = h.hasard();
    return n[0];
  }
  
}


public class H{
  
  private int min;
  private int max;
  private int nombre;
  
    public H(int min, int max, int nombre){
  	this.setMin(min);
    this.setMax(max);
    this.setNombre(nombre);
  }

  public void setNombre(int nombre){
  	this.nombre=nombre;
  }
  
  public void setMin(int min){
  	this.min=min;
  }

  public void setMax(int max){
  	this.max=max;
  }  
  
  public int getNombre(){
  	return this.nombre;
  }
  
  public int getMin(){
  	return this.min;
  }
  
  public int getMax(){
  	return this.max;
  }
  
  public int [] setTable(int taille){
    int[] t= new int[taille];
    return t;}
  
    public int [] hasard(){
    int[] t=setTable(this.getNombre());
    for(int i=0; i<this.getNombre(); i++){
 double n=Math.random() * (this.getMax())+this.getMin();
    int r = (int) n;
      t[i]=r;}
    return t;
  }

}
