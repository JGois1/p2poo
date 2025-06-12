package Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
    private String titulo;
    private String data;
    private int duracaoHoras;
    private double orcamento;
    private Local local;
    private List<Participante> inscritos;

    public Evento(String titulo, String data, int duracaoHoras, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracaoHoras = duracaoHoras;
        this.orcamento = orcamento;
        this.local = local;
        this.inscritos = new ArrayList<>();
    }

    public void inscreverParticipante(Participante participante) {
        this.inscritos.add(participante);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Participante> getInscritos() {
        return inscritos;
    }
}
