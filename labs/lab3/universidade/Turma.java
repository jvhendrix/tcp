package universidade;
import java.util.ArrayList;

public class Turma{
    
    private int MAX_ALUNOS = 35;
    private int MIN_ALUNOS = 5;
    private int MAX_MONITORES = 3;
    private int MIN_MONITORES = 0;

    private int numAlunos;
    private int numMonitores;
    private Professor professor;
    
    private ArrayList<Monitor> monitores;
    private ArrayList<Aluno> alunos;
    
    public Turma() {
        setNumAlunos(0);
        setNumMonitores(0);
        setMonitores(null);
        setAlunos(null);
        setProfessor(null);
    }
    
    public Turma(Professor professor, ArrayList<Monitor> monitores, ArrayList<Aluno> alunos) {
        if (!setMonitores(monitores)) {
            System.out.println("Numero de monitores fora do limite estabelecido!");
        };
        if (!setAlunos(alunos)) {
            System.out.println("Numero de alunos fora do limite estabelecido!");
        };
        setProfessor(professor);
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public int getNumAlunos() {
        return numAlunos;
    }
    private void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }
    public int getNumMonitores() {
        return numMonitores;
    }
    private void setNumMonitores(int numMonitores) {
        this.numMonitores = numMonitores;
    }
    public ArrayList<Monitor> getMonitores() {
        return monitores;
    }
    public boolean setMonitores(ArrayList<Monitor> monitores) {
        boolean isNumMonitoresOk = false;
        if (monitores != null) {
            this.monitores = monitores;
            setNumMonitores(monitores.size());
            if (monitores.size() >= MIN_MONITORES && monitores.size() <= MAX_MONITORES) {
                isNumMonitoresOk = true;
            }
        }
        return isNumMonitoresOk;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public boolean setAlunos(ArrayList<Aluno> alunos) {
        boolean isNumAlunosOk = false;
        if (alunos != null) {
            this.alunos = alunos;
            numAlunos = alunos.size();
            if (alunos.size() >= MIN_ALUNOS && alunos.size() <= MAX_ALUNOS) {
                isNumAlunosOk =  true;
            }
        }

        return isNumAlunosOk;
    }

    public boolean adicionaAluno(Aluno aluno) {
        boolean isNumAlunosOk = false;
        this.alunos.add(aluno);
        setNumAlunos(this.alunos.size());
        if (alunos.size() < MAX_ALUNOS) {
            isNumAlunosOk = true;
        }

        return isNumAlunosOk;
    }

    public boolean removeAluno() {
        boolean isNumAlunosOk = false;
        if (this.alunos.size() > MIN_ALUNOS) {
            this.alunos.remove(this.alunos.size()-1);
            setNumAlunos(this.alunos.size());
            isNumAlunosOk = true;
        }

        return isNumAlunosOk;
    }

    public void imprimeAlunos() {
        for (int i = 0; i < this.alunos.size(); i++){
            System.out.println("Aluno " + i);
            this.alunos.get(i).imprime();
        }
    }

}