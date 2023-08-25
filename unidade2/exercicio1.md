# Exercício 1

## Exercício - máximo 4,5 pontos se o commit no github for até 23:59h do dia 03/09/2023

### Exercícios

1. (1,0) Crie uma classe Disciplina com os atributos nomeDisciplina e cargaHoraria. Encapsule corretamente os atributos. A classe Curso deve conter um nome e uma lista de Disciplina como parte de sua composição. No método toString() exiba todas as informações do Curso e das Disciplinas. Implemente corretamente a visibilidade de cada método e cada atributo. Opcionalmente, trate como "IllegalArgumentException" se a carga horária for menor que 0.

2. (1,0) Crie uma classe Empresa que contenha atributos como nomeEmpresa e uma lista de funcionarios. Encapsule adequadamente esses atributos. Implemente um método adicionarFuncionario(Funcionario funcionario) para adicionar um funcionário à empresa. Além disso, crie um método calcularTotalSalarios() que calcula e retorna o total de salários de todos os funcionários na empresa.

3. (1,0) Crie uma classe SistemaUniversidades que organize informações sobre várias universidades. A classe SistemaUniversidades deve conter uma lista de Universidade como parte de sua composição. Adicione um método encontrarUniversidadeComMaisAlunos() que retorna o nome da universidade que possui mais alunos matriculados em todos os cursos. Utilize a classe Curso do exercício 1.

4. (1,5) Crie uma classe Escola com os atributos nomeEscola, endereco (do tipo Endereco com atributos logradouro, cidade e cep) e um array de Professor (cada um com atributos nome, data de nascimento e disciplina). Certifique-se de encapsular corretamente esses atributos. Utilize a classe Disciplina do exercício 1, usando-a via importação de um pacote externo. Implemente um método contratarProfessor(Professor professor, Disciplina disciplina) para adicionar um professor à escola e associá-lo a uma disciplina. Crie também um método listarProfessores() para exibir os dados da escola e os nomes dos professores e suas disciplinas.
