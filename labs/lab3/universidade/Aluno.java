package universidade;
public class Aluno {
    private int numeroMatricula;
    private float indiceDesempenho;

    public Aluno() {
        this.setNumeroMatricula(0);
        this.setIndiceDesempenho(0);
    }
    public Aluno(int numeroMatricula, float indiceDesempenho) {
        this.setNumeroMatricula(numeroMatricula);
        this.setIndiceDesempenho(indiceDesempenho);
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    public float getIndiceDesempenho() {
        return indiceDesempenho;
    }
    public void setIndiceDesempenho(float indiceDesempenho) {
        
        if (indiceDesempenho >= 0 && indiceDesempenho <= 10) {
            this.indiceDesempenho = indiceDesempenho;
        }
    }

    public void aumentaIndiceDesempenho(float value) {
        if (value > this.indiceDesempenho) {
            setIndiceDesempenho(value);
        }
    }

    public void diminuiIndiceDesempenho(float value) {
        if (value < this.indiceDesempenho) {
            setIndiceDesempenho(value);
        }
    }

    public void imprime() {
        System.out.println("Numero matricula: " + this.numeroMatricula);
        System.out.println("Indice desempenho: " + this.indiceDesempenho);
    }
}
