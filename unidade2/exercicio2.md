# Exercício 1

## Exercício - máximo 2,0 pontos se o commit no github for até 23:59h do dia 25/09/2023

### Exercício em Sala: Sistema de Reservas de Viagens de Ônibus + Herança e Polimorfismo

Imagine que você está desenvolvendo um sistema para uma empresa de transporte rodoviário que deseja gerenciar as reservas de viagens de ônibus para diferentes destinos. O sistema deve permitir que os usuários reservem assentos em viagens específicas. O sistema deve conter, com os respectivos construtores, toString e métodos acessores:

1. Classe Passageiro, obedecendo o contrato da interface Cliente:

   - Atributos: nome, documento e dataNascimento

2. Classe Assento:

   - Permite reservar(), isDisponivel().

3. Classe AssentoJanela:

   - Atributos: tipo (use o enum como janela), toString() pertinente.

4. Classe AssentoCorredor:

   - Atributos: tipo (use o enum como janela), toString() pertinente.

5. Classe Local:

   - Atributos: origem e destino.

6. Classe Viagem:

   - Atributos: numeroViagem, Local, dataHoraPartida, dataHoraChegada e uma lista de Assento com no máximo 40 vagas disponíveis.

7. Classe Reserva:
   - Atributos: Passageiro, Viagem e Assento

O que deve ser feito:

1. Crie as classes Passageiro, Assento, Viagem e Reserva com os atributos e métodos mencionados.
2. Implemente a lógica para que um Assento possa ser marcado como disponível ou não disponível.
3. Implemente um método na classe Viagem que permita listar os assentos disponíveis para reserva.
4. Crie um método na classe Viagem para realizar uma reserva, marcando o assento como não disponível.
5. Implemente um método na classe Reserva para exibir as informações da reserva, incluindo os dados do passageiro, detalhes da viagem e número do assento.
6. Considere 20 assentos para janela e 20 assentos para corredor.
7. Os assentos devem ser com numeração igual ao mapa de um ônibus real.
8. Crie a classe base Assento, da qual as classes AssentoJanela e AssentoCorredor herdam
9. Crie a classe Local, que encapsula origem e destino. Ela é usada na classe Viagem.
10. Use para data e hora a classe LocalDate ou LocalDateTime.

NOVO Gabarito [aqui](https://github.com/ap3ufersa/ap3_2023.1_xicoArruda/tree/main/ap3_xico/src/br/com/xico/aula6/gabaritoExercicioOnibus).

### Exercícios

1. (1,0) Crie uma hierarquia de classes para representar veículos. A classe base deve ser chamada de Veiculo e ter os atributos comuns a todos os veículos, como marca, modelo, e ano. Em seguida, crie duas subclasses, Carro e Moto, que herdam de Veiculo. Cada uma dessas subclasses deve adicionar atributos específicos, como numeroPortas para carros e cilindrada para motos.

- Implemente um método na classe base Veiculo chamado descrever() que retorna uma descrição genérica do veículo. Em seguida, nas subclasses Carro e Moto, sobrescreva esse método para fornecer uma descrição mais específica, incluindo os atributos exclusivos desses tipos de veículos.

2. (1,0) Crie uma hierarquia de classes para representar animais. A classe base deve ser chamada de Animal e ter atributos como nome e idade. Em seguida, crie duas subclasses, Cachorro e Gato, que herdam de Animal. Cada uma dessas subclasses deve adicionar métodos e atributos específicos, como o método latir() para cachorros e o método miar() para gatos.

- Implemente um método na classe base Animal chamado emitirSom() que retorna uma representação do som genérico que um animal faz. Em seguida, nas subclasses Cachorro e Gato, sobrescreva esse método para retornar os sons específicos desses animais.
