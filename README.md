# Exercício: Associação de Classes em Java

Este exercício tem como objetivo praticar o conceito de associação entre classes em Java, onde objetos de uma classe são utilizados como atributos em outras, representando relações.

## Descrição

O projeto contém as seguintes classes principais:

- `Local`: representa um local físico, armazenando o endereço.
- `Participante`: representa uma pessoa que participa de um evento.
- `Evento`: representa um evento, associando participantes e um local.
- `Organizador`: representa quem organiza um ou mais eventos.

Essas classes se relacionam por meio de associação, demonstrando como objetos podem ser compostos por outros objetos.

## Exemplo de uso

```java
Local local = new Local("Rua da Alegria");
Participante participante = new Participante("Zoro", 25, null);
Participante participante1 = new Participante("Luffy", 16, null);
Participante[] participantes = {participante, participante1};
Evento evento = new Evento("Zoada da madrugada", "11/11/2005", participantes, local);
participante.setEvento(evento);
Evento[] eventos = {evento};
Organizador organizador = new Organizador("DevDojo", "Java", eventos);
organizador.imprime();
```
## Como executar

- Certifique-se de ter o Java instalado.
- Compile todas as classes do diretório src:
- javac src/dominio/*.java src/Main.java
- Execute a classe principal:
- java -cp src Main

## Objetivo

Exercício para aprender e praticar o conceito de Associação em Java.
