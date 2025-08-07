import dominio.Evento;
import dominio.Local;
import dominio.Organizador;
import dominio.Participante;


public class Main {
    public static void main(String[] args) {
        Local local = new Local("Rua da Alegria");

        Participante participante = new Participante("Zoro", 25, null);
        Participante participante1 = new Participante("Luffy", 16, null);

        Participante[] participantes = {participante, participante1};

        Evento evento = new Evento("Zoada da madrugada", "11/11/2005", participantes, local);

        participante.setEvento(evento);

        Evento[] eventos = {evento};

        Organizador organizador = new Organizador("DevDojo", "Java", eventos);

        organizador.imprime();
    }
}