# Aula 4

## Exercício - 4,0 pontos se entregar até 23:59h do dia ??/08/2023

### Exercícios

1. 0,5 Exercício 1:
Crie uma classe chamada Pessoa com um atributo nome (private). Forneça métodos públicos getNome e setNome para acessar e modificar o atributo. Altere o toString para exibir o nome completo em letras maiúsculas.

2. 0,5 Exercício 2: Acesso Privado em Construtores
Crie uma classe chamada Produto com um atributo descricao de visibilidade private. Crie um construtor público para a classe Produto que aceite um parâmetro descricao para inicializar o atributo. Forneça um método público chamado exibirDescricao para exibir a descrição do produto.

3. 1,0 Exercício 3: 
Crie uma classe BibliotecaPequena com atributos nome (private) e livros[6] (protected). A classe Biblioteca deve conter um método listarLivros de visibilidade public que exibe os nomes dos livros cadastrados. Faça uma classe TestaBibliotecaPequena com o cadastro de 6 livros. Armazene o nome dos livros no array e use a classe Scanner para ler o nome de cada livro.

4. 2,0 Exercício 4: 
Exercício: Cadastro de Carros

    Crie uma classe chamada Carro com os seguintes atributos privados:
        marca (String)
        modelo (String)
        ano (int)

    Crie um construtor público na classe Carro que aceite os três valores como parâmetros e inicialize os atributos.

    Crie métodos públicos getMarca, getModelo e getAno para recuperar os valores dos atributos.

    Crie uma classe chamada CadastroCarros que conterá o método main.

    Na classe CadastroCarros, utilize a classe Scanner para receber entradas do usuário e criar objetos Carro com base nas informações fornecidas. Use um loop para permitir o cadastro de 4 carros.

    A cada iteração do loop, peça ao usuário para digitar a marca, modelo e ano do carro. Crie um novo objeto Carro com essas informações e adicione-o a um ArrayList de carros cadastrados.

    Depois que o loop for concluído, percorra o ArrayList de carros cadastrados e exiba suas informações usando os métodos get da classe Carro.


5. 3,0 - Exercício: Sistema Avançado de Cadastro de Times e Jogadores

    Crie uma classe chamada Jogador com os seguintes atributos privados:
        nome (String)
        idade (int)
        posicao (String)

    Crie um construtor público na classe Jogador que aceite os três valores como parâmetros e inicialize os atributos.

    Crie uma classe chamada Time com os atributos privados:
        nomeTime (String)
        jogadores (um vetor de objetos Jogador)

    Crie um construtor público na classe Time que aceite o nome do time como parâmetro e inicialize o atributo nomeTime. Inicialize também o vetor de jogadores com um tamanho de 11.

    Crie um método público cadastrarJogador na classe Time, que use a classe Scanner para receber informações sobre um jogador (nome, idade e posição) e crie um objeto Jogador. Adicione o jogador ao vetor de jogadores.

    Crie um método público listarJogadores na classe Time, que exiba as informações de cada jogador do time, incluindo nome, idade e posição.

    Crie uma classe chamada CadastroTimes com o método main. Nesse método, utilize a classe Scanner para criar um sistema de cadastro de times e jogadores, permitindo que o usuário cadastre informações sobre vários times e seus jogadores.

    No CadastroTimes, peça ao usuário para digitar o nome de um time. Crie um objeto Time com esse nome.

    Use um loop para permitir que o usuário cadastre até 11 jogadores para o time. Utilize o método cadastrarJogador para realizar o cadastro de cada jogador.

    Após cadastrar todos os jogadores, utilize o método listarJogadores para exibir as informações de todos os jogadores do time.



