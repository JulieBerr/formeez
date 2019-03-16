package CarreTriangleRond;

public class Cercle extends Forme {

    private int rayon;
    public int x;
    public int y;
    
    public Cercle(int rayon, int x, int y){
        super(x,y);
        this.rayon=rayon;
    }
    
    public double getX(){ return this.x; }
    public double getY(){ return this.y; }
    public double getR(){ return this.rayon; }    
    
    public void setX(int x){ this.x=x; }
    public void setY(int y){this.y=y; }
    public void setR(int r){ this.rayon=r; }    
 
    public String toString(){
        String s = "Cercle de rayon "+this.rayon+" de centre ( "+this.x+" "+this.y+" )";
        return s;
    }
}
