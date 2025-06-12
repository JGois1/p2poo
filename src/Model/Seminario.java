package Model;

public class Seminario extends Evento {
    private String tema;
    private String nomeAlunoApresentador;
    private String nomeOrientador;

    public Seminario(String titulo, String data, int duracaoHoras, double orcamento, Local local, String tema, String nomeAlunoApresentador, String nomeOrientador) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.tema = tema;
        this.nomeAlunoApresentador = nomeAlunoApresentador;
        this.nomeOrientador = nomeOrientador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNomeAlunoApresentador() {
        return nomeAlunoApresentador;
    }

    public void setNomeAlunoApresentador(String nomeAlunoApresentador) {
        this.nomeAlunoApresentador = nomeAlunoApresentador;
    }

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }
}
