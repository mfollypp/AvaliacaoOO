package Main;

import Main.Excecoes.AvaliacaoOO2022NaoInformadaException;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.util.Calendar;
import java.util.Scanner;

public class Testador {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException, InvalidClassException, AvaliacaoOO2022NaoInformadaException {
        
        /*--------------------------------------------------------------------*/
        //Teste da escrita e leitura do arquivo de funcionarios:
        Mercado mercado = new Mercado("OOProducts");
        
        mercado.leArqFuncionarios();
        mercado.addFuncionario("Matheus", 24, 1111, "Coordenador");
        mercado.addFuncionario("Folly", 23, 2222, "Gerente");
        mercado.addFuncionario("Pilotto", 25, 3333, "CEO");
        mercado.escreveArqFuncionarios(); // vai triggar a AvaliacaoOO2022NaoInformadaException pela primeira vez
        mercado.printaFuncionarios(); // vai printar a primeira tela dos funcionarios
        funcionarioToString(mercado); // vai triggar a AvaliacaoOO2022NaoInformadaException pela segunda vez
        
        mercado.leArqFuncionarios();
        mercado.addFuncionario("Peixoto", 26, 4444, "CTO");
        setaAvaliacao(mercado); // agora quando chamar a seguir o metodo de escrever em arquivo nao vai lançar a exceçao AvaliacaoOO2022
        mercado.escreveArqFuncionarios(); // nao vai triggar a exception
        mercado.printaFuncionarios(); // vai printar a segunda tela dos funcionarios
        funcionarioToString(mercado); // nao vai triggar a exception
        
    }
    
    public static void setaAvaliacao(Mercado mercado){
        for(Funcionario func : mercado.getFuncionarios()){
            AvaliacaoOO2022 aval = new AvaliacaoOO2022("AvaliacaoOO", 620031, 8.0);
            func.setAvaliacao(aval);
        }
    }
    
    public static void funcionarioToString(Mercado mercado) throws AvaliacaoOO2022NaoInformadaException{
        try{
            funcionarioToStringLancaExcecao(mercado);
        }catch(AvaliacaoOO2022NaoInformadaException aniex){
            System.out.println(aniex.getMessage());
        }
    }
    
    public static void funcionarioToStringLancaExcecao(Mercado mercado) throws AvaliacaoOO2022NaoInformadaException {
        for(Funcionario func : mercado.getFuncionarios()){
            if(func.getAvaliacao() == null){
                throw new AvaliacaoOO2022NaoInformadaException();
            }
            System.out.println(func);
        }
    }
}