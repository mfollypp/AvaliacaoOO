package Main;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {
    private int cadastro;
    private String tipoFuncionario;
    private AvaliacaoOO2022 avaliacao;

    public Funcionario(String nome, int idade, int cadastro, String tipoFuncionario) { //construtor da classe Funcionario
        super(nome, idade);
        this.cadastro = cadastro;
        this.tipoFuncionario = tipoFuncionario;
    }
    
    //gets e sets dos atributos da classe

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public int getCadastro() {
        return cadastro;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }
    
    public AvaliacaoOO2022 getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(AvaliacaoOO2022 avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    //Arthur & Folly
    @Override
    public String toString() { //para printa os funcionarios sem formatar na hora
	return "Nome: " + this.getNome() + 
                "\nCadastro: " + this.cadastro + 
                "\nTipo Funcionario: " + this.tipoFuncionario + 
                "\nNome Avaliacao: " + this.avaliacao.getNome() +
                "\nMatricula: " + this.avaliacao.getMatricula() +
                "\nNota: " + this.avaliacao.getNota() + "\n";
    }
    
}