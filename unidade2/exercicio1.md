# Exercício 1

## Exercício - máximo 4,5 pontos se o commit no github for até 23:59h do dia 04/09/2023

### Exercício em Sala: Sistema de Reservas de Viagens de Ônibus

Imagine que você está desenvolvendo um sistema para uma empresa de transporte rodoviário que deseja gerenciar as reservas de viagens de ônibus para diferentes destinos. O sistema deve permitir que os usuários reservem assentos em viagens específicas. O sistema deve conter, com os respectivos construtores, toString e métodos acessores:

1. Classe Passageiro:
   - Atributos: nome, documento e dataNascimento

2. Classe Assento:
   - Atributos: numeroAssento, tipo (enum de janela ou corredor) e disponivel.

3. Classe Viagem:
   - Atributos: numeroViagem, origem, destino, dataHoraPartida, dataHoraChegada e uma lista de Assento com no máximo 40 vagas disponíveis.

4. Classe Reserva:
   - Atributos: Passageiro, Viagem e Assento

O que deve ser feito:
1. Crie as classes Passageiro, Assento, Viagem e Reserva com os atributos e métodos mencionados.
2. Implemente a lógica para que um Assento possa ser marcado como disponível ou não disponível.
3. Implemente um método na classe Viagem que permita listar os assentos disponíveis para reserva.
4. Crie um método na classe Viagem para realizar uma reserva, marcando o assento como não disponível.
5. Implemente um método na classe Reserva para exibir as informações da reserva, incluindo os dados do passageiro, detalhes da viagem e número do assento.
6. Considere 20 assentos para janela e 20 assentos para corredor.

Gabarito [aqui](https://github.com/ap3ufersa/ap3_2023.1_xicoArruda/tree/main/ap3_xico/src/br/com/xico/aula6/gabaritoExercicioOnibus).

### Exercícios

1. (1,0) Crie uma classe Disciplina com os atributos nomeDisciplina e cargaHoraria. Encapsule corretamente os atributos. A classe Curso deve conter um nome e uma lista de Disciplina como parte de sua composição. No método toString() exiba todas as informações do Curso e das Disciplinas. Implemente corretamente a visibilidade de cada método e cada atributo. Opcionalmente, trate como "IllegalArgumentException" se a carga horária for menor que 0.

2. (1,0) Crie uma classe Empresa que contenha atributos como nomeEmpresa e uma lista de funcionarios. Encapsule adequadamente esses atributos. Implemente um método adicionarFuncionario(Funcionario funcionario) para adicionar um funcionário à empresa. Além disso, crie um método calcularTotalSalarios() que calcula e retorna o total de salários de todos os funcionários na empresa.

3. (1,0) Crie uma classe SistemaUniversidades que organize informações sobre várias universidades. A classe SistemaUniversidades deve conter uma lista de Universidade como parte de sua composição. Adicione um método encontrarUniversidadeComMaisAlunos() que retorna o nome da universidade que possui mais alunos matriculados em todos os cursos. Utilize a classe Curso do exercício 1.

4. (1,5) Crie uma classe Escola com os atributos nomeEscola, endereco (do tipo Endereco com atributos logradouro, cidade e cep) e um array de Professor (cada um com atributos nome, data de nascimento e disciplina). Certifique-se de encapsular corretamente esses atributos. Utilize a classe Disciplina do exercício 1, usando-a via importação de um pacote externo. Implemente um método contratarProfessor(Professor professor, Disciplina disciplina) para adicionar um professor à escola e associá-lo a uma disciplina. Crie também um método listarProfessores() para exibir os dados da escola e os nomes dos professores e suas disciplinas.
