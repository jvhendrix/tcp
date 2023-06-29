package lab4.poligonos;
import java.lang.Math;
import java.util.ArrayList;

public class TrianguloIsosceles extends Triangulo {

    public TrianguloIsosceles(float s1, float s2, float s3) {
        super(s1, s2, s3);
    }

    public float calculaAltura() {
        ArrayList<Float> sides = getSide();
        float equalSide;

        if (sides.get(0) == sides.get(1)) {
            setBase(sides.get(2));
            equalSide = sides.get(0);
        }
        else if (sides.get(0) == sides.get(2)) {
            setBase(sides.get(1));
            equalSide = sides.get(0);
        }
        else {
            setBase(sides.get(0));
            equalSide = sides.get(1);
        }
        float height;

        height = (float) Math.sqrt(Math.pow(equalSide, 2) - Math.pow(getBase() / 2, 2));
        setHeight(height);
        return height;
    }

    @Override
    public void imprimeTipoPoligono() {
        System.out.println("Esse eh um triangulo isosceles!");
    }

    @Override
    public float calculaArea() {
        calculaAltura();
        return super.calculaArea();
    }
    
}
