package CarreTriangleRond;

public class Triangle extends Forme{
        
    private int x;
    private int y;
    
    public Triangle(int x, int y){
        super(x,y);
    }
    
    public double getX(){ return this.x; }
    public double getY(){ return this.y; }

    public void setX(int x){ this.x=x; }
    public void setY(int y){this.y=y; }

    public String toString(){
        String s = "Triangle de centre ( "+this.x+" "+this.y+" )";
        return s;
    }
}
