package dominio;

public class Organizador {
    private String nome;
    private String areaDeAtuacao;
    private Evento[] eventos;

    public Organizador(String nome, String areaDeAtuacao) {
        this.nome = nome;
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public Organizador(String nome, String areaDeAtuacao, Evento[] eventos) {
        this.nome = nome;
        this.areaDeAtuacao = areaDeAtuacao;
        this.eventos = eventos;
    }

    public void imprime(){
        System.out.println("----------------------------------");
        System.out.println("Organizador: " + this.nome);
        System.out.println("Area de atuação do organizador: " + this.areaDeAtuacao);
        if(eventos == null) return;
        System.out.println("----- EVENTO -----");
        for(Evento evento : eventos){
            System.out.println("Nome do evento: " + evento.getNome());
            System.out.println("Local do evento: " + evento.getLocal().getEndereco());
            if(evento.getParticipantes() == null || evento.getParticipantes().length == 0) continue;
            System.out.println("----- PARTICIPANTES -----");
            for(Participante participante : evento.getParticipantes()){
                System.out.println("Participante: " + participante.getNome());
            }
        }
    }

    public Evento[] getEventos() {
        return eventos;
    }

    public void setEventos(Evento[] eventos) {
        this.eventos = eventos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }
}
