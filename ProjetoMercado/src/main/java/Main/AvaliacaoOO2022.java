package Main;

import java.io.Serializable;

public class AvaliacaoOO2022 implements Serializable {
    private String nome;
    private int matricula;
    private double nota;
    
    public AvaliacaoOO2022(String nome, int matricula, double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}