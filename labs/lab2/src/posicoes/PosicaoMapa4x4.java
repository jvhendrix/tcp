package posicoes;
import java.text.MessageFormat;

public class PosicaoMapa4x4 {

    private int x;
    private int y;
    private static int numPosicoesOcupadas;

    public PosicaoMapa4x4(){
        this.reset();
        numPosicoesOcupadas++;
    }

    public PosicaoMapa4x4(int x, int y){
        this.setX(x);
        this.setY(y);
        numPosicoesOcupadas++;
    }

    public boolean setX(int x){

        boolean valid_x = false;

        if (x >= 0 && x < 4){
            this.x = x;
            valid_x = true;
        }
        else{
            this.reset();
        }

        return valid_x;
    }

    public boolean setY(int y){

        boolean valid_y = false;

        if (y >= 0 && y < 4){
            this.y = y;
            valid_y = true;
        }
        else{
            this.reset();
        }

        return valid_y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public static int getNumPosicoesOcupadas(){
        return numPosicoesOcupadas;
    }

    public PosicaoMapa4x4 copy(){
        PosicaoMapa4x4 pos_copy = new PosicaoMapa4x4(getX(), getY());
        return pos_copy;
    }

    public void imprime(){
        System.out.println(MessageFormat.format("({0}, {1})", this.getX(), this.getY()));
    }

    public int distancia(PosicaoMapa4x4 p){
        int x_distance = Math.abs(this.getX() - p.getX());
        int y_distance = Math.abs(this.getY() - p.getY());

        return x_distance + y_distance;
    }

    private void reset(){
        this.setX(0);
        this.setY(0);
    }

    public static boolean estaoMesmaPosicao(PosicaoMapa4x4 p1, PosicaoMapa4x4 p2){
        boolean same_pos = false;

        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()){
            same_pos = true;
        }

        return same_pos;
    }
}
