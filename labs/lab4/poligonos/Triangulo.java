package lab4.poligonos;
import java.util.ArrayList;
import java.lang.Math;

public abstract class Triangulo implements Poligono {

    private float base;
    private float height;
    private ArrayList<Float> side = new ArrayList<Float>();

    
    public Triangulo (float s1, float s2, float s3) {
        side.add(s1);
        side.add(s2);
        side.add(s3);
    }
    
    public Triangulo (int base, int height) {
        this.base = base;
        this.height = height;
        
        // pitagoras
        float hipotenuse = (float) Math.sqrt(Math.pow(height,2) + Math.pow(base, 2));
        
        side.set(0, (float)base);
        side.set(1, (float)height);
        side.set(2, (float)hipotenuse);
    }

    public static float calculaArea(float base, float height) {
        return (base)*(height)/2;
    }
    
    @Override
    public float calculaArea() {
        return (this.base)*(this.height)/2;
    }
    @Override
    public abstract void imprimeTipoPoligono();

    public float getBase() {
        return base;
    }
    
    public void setBase(float base) {
        this.base = base;
    }
    
    public float getHeight() {
        return height;
    }
    
    public void setHeight(float height) {
        this.height = height;
    }
    
    public ArrayList<Float> getSide() {
        return side;
    }
    
    public void setSide(ArrayList<Float> side) {
        this.side = side;
    }
}
