package lab4.poligonos;
import java.lang.Math;

public class TrianguloEquilatero extends Triangulo{

    public TrianguloEquilatero (float s1, float s2, float s3) {
        super(s1, s2, s3);
    }

    @Override
    public float calculaArea () {
        // L^2 * (3^1/2) / 4
        return (float) (Math.pow(getSide().get(0), 2) * Math.sqrt(3) / 4);
    }

    @Override
    public void imprimeTipoPoligono() {
        System.out.println("Esse eh um triangulo equilatero!");
    }
    
}
