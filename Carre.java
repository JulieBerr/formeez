package CarreTriangleRond;

public class Carre extends Forme {
    
    private int x;
    private int y;
    private double cote;
    
    public Carre(int x, int y, double cote){
        super(x,y);
        this.cote=cote;
    }
    
    public int getX(){ return this.x; }
    public int getY(){ return this.y; }
    public double getR(){ return this.cote; }    
    
    public void setX(int x){ this.x=x; }
    public void setY(int y){this.y=y; }
    public void setR(double c){ this.cote=c; }    
 
    public String toString(){
        String s = "Carré de côté "+this.cote+" de centre ( "+this.x+" "+this.y+" )";
        return s;
    }
}
