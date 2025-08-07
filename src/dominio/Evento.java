package dominio;

public class Evento {
    private String nome;
    private String data;
    private Participante[] participantes;
    private Local local;

    public Evento(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public Evento(String nome, String data, Participante[] participantes) {
        this.nome = nome;
        this.data = data;
        this.participantes = participantes;
    }

    public Evento(String nome, String data, Participante[] participantes, Local local) {
        this.nome = nome;
        this.data = data;
        this.participantes = participantes;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
