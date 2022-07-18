package Main.Excecoes;

public class AvaliacaoOO2022NaoInformadaException extends Exception {

    public AvaliacaoOO2022NaoInformadaException(){
       super("""
            -----------------------------------------------------------
                        AvaliacaoOO2022 nao foi informada
            -----------------------------------------------------------
            """);
    }
}