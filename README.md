*FOCO NO EX 3*

2. Criar um teste de mesa que demonstre a u�lização de uma pilha de inteiros para realizar a operação de cálculo de
fatorial de um dado número.
Para o teste, deve se usar um número de 0 a 10.
U�lizando as operações possíveis em uma pilha, apresentar o teste de mesa que receba um número de entrada e,
u�lizando uma pilha vazia e operações, chegar no valor do fatorial do número de entrada.
3. Baseado na lógica do Exercício 2, criar uma aplicação Java, baseada na biblioteca de pilha de int, que faça:
1) Criar uma classe view (Principal.java) que, na main:
a. Peça ao usuário um valor inteiro de 0 a 10 (Caso o usuário digite um valor fora desses limites, pedir
novamente, até que o valor atenda à solicitação);
2) Criar uma classe controller chamada FatController, que tenha um método fatorial(int valor): int e faça:
a. Inicialize uma pilha
b. Usando a pilha como suporte, calcule o fatorial do valor de entrada
c. O método deve retornar esse valor
3) O método main da classe Principal.java deve chamar o método fatorial(int valor): long e exibir em console o
valor do fatorial.
O método fatorial(int valor): long deve estar baseado nas operações da pilha de inteiros (push(), pop(), size(), top(),
isEmpty())
