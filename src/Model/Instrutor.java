package Model;

public class Instrutor extends PessoaResponsavel {
    private String formacao;
    private String areaEspecializacao;

    public Instrutor(String nome, String email, String formacao, String areaEspecializacao) {
        super(nome, email);
        this.formacao = formacao;
        this.areaEspecializacao = areaEspecializacao;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }
}
