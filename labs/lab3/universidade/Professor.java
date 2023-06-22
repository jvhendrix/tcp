package universidade;
public class Professor {
    private int id;
    private String departamento;

    public Professor() {
        this.setId(0);
        this.setDepartamento(null);
    }

    public Professor(int id, String departamento) {
        this.setId(id);
        this.setDepartamento(departamento);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
