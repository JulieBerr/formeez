import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    H h = new H(0,5,3);
    int [] n = h.hasard();
    for (int i=0; i<h.getNombre(); i++){
      System.out.print(n[i]+ " ");}
   	Test.TestH();
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

public class Test {

  public static void TestH(){
  	H h = new H(0,5,3);
    int [] n = h.hasard();
    for (int i=0; i<h.getNombre(); i++){
      if (n[i]<h.getMin() & n[i]>h.getMax()){
      	 System.out.print("Test faux!");
      }
    }   
  }
  
}
