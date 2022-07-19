# Avaliação sobre o [ProjetoMercado](https://github.com/mfollypp/ProjetoMercado)
- [x] Crie uma classe chamada AvaliacaoOO2022 em seu trabalho com os atributos nome, matrícula e nota, do tipo que achar mais adequado.
  - Foi criada a classe com seus atributos sendo eles respectivamente do tipo String, int e double (também foi criado o construtor e seus getters e setters).
- [x] Adicione um atributo do tipo AvaliacaoOO2022 na classe de modelo do seu projeto que julgar mais importante.
  - Foi adicionado um atributo do tipo AvaliacaoOO2022 na classe Funcionario pois os objetos da classe Funcionario serão salvos em arquivo.
- [x] Altere para que esse atributo também seja salvo em arquivo.
  - Implementado o atributo do tipo AvaliacaoOO2022 na classe Funcionario, sendo salvo um objeto do tipo Funcionario, é salvo também seu atributo avaliacao.
- [x] Ao salvar um objeto dessa classe, caso o atributo não tenha sido informado, lance a exceção AvaliacaoOO2022NaoInformadaException.
  - Ao escrever os objetos da classe Funcionario no arquivo, se o funcionario em questão não tiver o atributo avaliação informado, é lançada a exceção AvaliacaoOO2022NaoInformadaException.
- [x] Essa exceção deverá ser tratada nas classes que interagem com o usuário em que deverão ser exibidas ao usuário mensagens correspondentes às exceções lançadas
  - A exceção está sendo tratada na classe que origina o lançamento das exceções (Mercado), que foi implementada na classe Testador (main), e também está sendo realisado o tratamento da exceção solicitada em métodos static na main (Testador).

### Classes Alteradas:
- AvaliacaoOO2022 (implementada)
- AvaliacaoOO2022NaoInformadaException (implementada)
- Funcionario
- Mercado
- Testador (main)

### Observações:
#### Achei um pouco vago alguns dos requisitos que deveriam ser cumpridos para completar a avaliação, então a lógica que segui foi:
- Criar uma classe instanciável AvaliacaoOO2022 e uma classe para exceção AvaliacaoOO2022NaoInformadaException
- Adicionar um atributo do tipo AvaliacaoOO2022 em uma classe importante/funcional que faz sentido a existência e/ou que tenha maior funcionalidade
- Fazer com que esse atributo consiga também ser salvo em arquivo, de maneira que o objeto que possui aquele atributo seja adicionado ao arquivo e trate suas exceções para tal
- Lançar a exceção criada caso esteja tentando adicionar ao arquivo um objeto cujo atributo AvaliacaoOO2022 seja nulo/não foi informado
- Tratar as exceções na classe que há interação com o usuário direta ou indiretamente, lançando um print da mensagem da exceção para informar o usuário
