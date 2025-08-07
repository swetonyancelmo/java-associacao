package dominio;

public class Participante {
    private String nome;
    private int idade;
    private Evento evento;

    public Participante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Participante(String nome, int idade, Evento evento) {
        this.nome = nome;
        this.idade = idade;
        this.evento = evento;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
