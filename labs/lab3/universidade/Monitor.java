package universidade;
public class Monitor {
    private int semestreAtual;
    private boolean temExperiencia;

    public Monitor() {
        this.setSemestreAtual(0);
        this.setTemExperiencia(false);
    }
    public Monitor(int semestreAtual, boolean temExperiencia) {
        this.setSemestreAtual(semestreAtual);
        this.setTemExperiencia(temExperiencia);
    }


    public int getSemestreAtual() {
        return semestreAtual;
    }
    public void setSemestreAtual(int semestreAtual) {
        this.semestreAtual = semestreAtual;
    }
    public boolean isTemExperiencia() {
        return temExperiencia;
    }
    public void setTemExperiencia(boolean temExperiencia) {
        this.temExperiencia = temExperiencia;
    }
}
