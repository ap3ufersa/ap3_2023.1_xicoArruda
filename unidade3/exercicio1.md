# Exercício 3

## Exercício - máximo 307,5 pontos se o commit no github for até 23:59h do dia 20/10/2023

### Exercício em Sala: Threads e Exceptions

Exceptions [aqui](https://github.com/ap3ufersa/ap3_2023.1_xicoArruda/tree/main/unidade3/exceptions/).

Threads [aqui](https://github.com/ap3ufersa/ap3_2023.1_xicoArruda/tree/main/unidade3/threads/).

### Exercícios
(7,0) Exceptions em Java - faça as seguintes classes:

1. Classe `ContaBancaria`:
   - Atributo `saldo`.
   - Método `sacar(valor)` lança `SaldoInsuficienteException` se saldo < valor.
   - Método `depositar(valor)` lança `IllegalArgumentException` se valor negativo.

2. Classe `TransacaoBancaria`:
   - Método estático `realizarTransacao(conta, valor)` saca valor da conta.
   - Captura (catch) `SaldoInsuficienteException`, imprime "Saldo insuficiente."
   - Captura (catch) `IllegalArgumentException`, imprime "Valor inválido." e imprime a stack de erro.

3. Classe `TestaBanco`:
   - Ponto de entrada (`main`), testa as classes feitas, realizando transações, capturando e imprimindo as mensagens de erro quando ocorrerem.


(7,0) Threads em Java - faça as seguintes classes:

1. Classe `ContadorComThreads`:
    - Implemente a interface Runnable.
    - No método run(), use um loop para contar de 1 a 10.
    - Coloque atraso com Thread.sleep(random) após cada contagem.

2. Classe `ContadorComThreads`:
    - Crie duas instâncias de ContadorComThreads.
    - Inicie as threads (`start()`).
    - Exiba a execução das Threads.

Opcional: use o pacote `java.util.concurrent` ao invés da classe `Thread`