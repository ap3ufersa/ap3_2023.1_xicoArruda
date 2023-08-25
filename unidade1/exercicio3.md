# Exercício 3

## Exercício - máximo 4,0 pontos se o commit no github for até 23:59h do dia 20/08/2023

### Exercícios

1. (0,5) Crie uma classe chamada Pessoa com um atributo nome (private). Forneça métodos públicos getNome e setNome para acessar e modificar o atributo. Altere o toString para exibir o nome completo em letras maiúsculas.

2. (0,5) Crie uma classe chamada Produto com um atributo descricao de visibilidade private. Crie um construtor público para a classe Produto que aceite um parâmetro descricao para inicializar o atributo. Forneça um método público chamado exibirDescricao para exibir a descrição do produto.

3. (1,0) Crie uma classe BibliotecaPequena com atributos nome (private) e livros[6] (protected). A classe Biblioteca deve conter um método listarLivros de visibilidade public que exibe os nomes dos livros cadastrados. Faça uma classe TestaBibliotecaPequena com o cadastro de 6 livros. Armazene o nome dos livros no array e use a classe Scanner para ler o nome de cada livro.

4. (2,0) Exercício de cadastro de carros:

   - Crie uma classe chamada Carro com os seguintes atributos privados: marca, modelo e ano.

   - Crie um construtor com os três atributos, crie os métodos get e set para cada atributo.

   - Crie a Classe TestaCarro. Utilize a classe Scanner para receber entradas do usuário e criar objetos Carro com base nas informações fornecidas. Faça o cadastro de 4 carros, armazenando em um ArrayList<Carro>.

   - Ao final, exiba os carros cadastrados.

5. (3,0) Exercício de cadastro de times de jogadores:

   - Crie uma classe chamada Jogador com os seguintes atributos privados: codigo, nome, idade, altura.

   - Crie um construtor público na classe Jogador que aceite três valores como parâmetros e inicialize os atributos. O código deve ser randômico até 99999 e deve ser gerenciado pela classe.

   - Crie uma classe chamada Time com os atributos privados: nomeTime, jogadores (um ArrayList<Jogador>).

   - Crie um construtor público na classe Time que aceite o nome do time como parâmetro e inicialize o atributo nomeTime. Inicialize também a lista de jogadores com um tamanho de 11.

   - Crie um método público cadastrarJogador na classe Time, que use a classe Scanner para receber informações sobre um jogador (nome, idade e altura) e crie um objeto Jogador. Adicione o jogador ao vetor de jogadores.

   - Crie um método público listarJogadores na classe Time, que exiba as informações de cada jogador do time, incluindo codigo, nome, idade e altura.

   - Crie a classe TestaTime. Use a classe Scanner e permita que o usuário cadastre informações sobre 2 times e seus 11 jogadores.

   - Após cadastrar todos os times e jogadores, exiba todas as informações cadastradas.
