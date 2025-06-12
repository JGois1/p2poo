package Model;

import java.util.List;

public class Minicurso extends Evento {
    private List<Instrutor> instrutores;
    private List<String> materiaisApoio;

    public Minicurso(String titulo, String data, int duracaoHoras, double orcamento, Local local, List<Instrutor> instrutores, List<String> materiaisApoio) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.instrutores = instrutores;
        this.materiaisApoio = materiaisApoio;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public List<String> getMateriaisApoio() {
        return materiaisApoio;
    }

    public void setMateriaisApoio(List<String> materiaisApoio) {
        this.materiaisApoio = materiaisApoio;
    }
}
