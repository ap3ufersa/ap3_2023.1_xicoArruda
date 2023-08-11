# Exercício 2

## Exercício - 1,0 ponto se o commit no github for até 23:59h do dia 03/08/2023

## Exercício - 0,5 ponto se o commit no github for até 23:59h do dia 20/08/2023

### Configuração do ambiente

1. Crie sua conta no GitHub (escolha um nome profissional - delicinhaCremosa123 é um mal exemplo). _Sign-up_ em github.com
2. Baixe o [GitHub Desktop](https://desktop.github.com).
3. Configure o GitHub Desktop com a conta criada.
4. Crie o repositório no formato **ap3_2023.1_primeironomeSegundonome** (ex.: ap3_2023.1_xicoArruda). Decida se ele ficará público ou privado.
5. Altere o README.md com informações relevantes sobre o repositório (dicas [aqui](https://gist.github.com/lohhans/f8da0b147550df3f96914d3797e9fb89)).
6. Coloque a pasta do projeto Java feito na aula 2 dentro da pasta do repositório local.
7. Faça _commit_ das alterações no repositório local.
8. Faça _push_ do repositório local para o GitHub.
9. Adicione a conta **ap3ufersa** como colaborador do repositório.
10. Faça os exercícios a seguir. Após concluir cada questão, faça _commit_ do projeto localmente e sincronize-o (_push_) com o seu repositório remoto no GitHub.

### Exercícios

1. Crie uma classe chamada "Pessoa" que tenha os atributos nome, idade e altura. Implemente os seguintes métodos:

   - Substitua o método `toString()` padrão da classe Object. O método `toString()` deve retornar uma string contendo as informações completas da pessoa, incluindo nome, idade e altura. Certifique-se de anotar o método com a anotação `@Override`.
   - Crie um método chamado `fazerAniversario()` que não recebe nenhum parâmetro e não retorna nenhum valor. Esse método deve incrementar a idade da pessoa em 1 e exibir a mensagem "Feliz aniversário! Agora você tem X anos.", onde X é a nova idade da pessoa.
   - Crie um método chamado `ehMaiorDeIdade()` que não recebe nenhum parâmetro e retorna um valor booleano. Esse método deve verificar se a pessoa é maior de idade (idade maior ou igual a 18) e retornar `true` se for maior de idade ou `false` caso contrário.

2. Crie uma classe chamada "Produto" que tenha os atributos nome, preço e quantidade em estoque. Implemente métodos para adicionar e remover produtos do estoque, além de exibir as informações completas do produto. Implemente getters, setters e toString. Crie a classe TestaProduto, com 258 produtos. Utilize uma coleção do tipo "ArrayList" para armazenar os produtos em estoque.

3. Crie uma classe chamada "Funcionario" que tenha os atributos nome, cargo e salário. Implemente um método para exibir as informações completas do funcionário. Utilize uma coleção do tipo "HashMap" para armazenar os funcionários, utilizando o nome como chave. Faça uma classe TestaFuncionario com 14 funcionários, sendo 2 gerentes.

4. Crie uma classe chamada "Banco" que tenha o atributo nome e uma lista de contas bancárias. Utilize a ContaBancaria criada na aula anterior. Implemente métodos para adicionar e remover contas do banco, além de exibir as informações completas de todas as contas. Utilize uma coleção do tipo "LinkedList" para armazenar as contas bancárias de 30 pessoas, na classe TestaBanco.

5. Em todas as classes coloque o seu código secreto em um comentário. Ele foi enviado para seu e-mail institucional. Também não esqueça de ajustar o _fully qualified name_.
