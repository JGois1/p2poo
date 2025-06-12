package Model;

public class Auditorio extends Local {
    private boolean temSistemaSom;
    private boolean temEstruturaTraducao;

    public Auditorio(String nome, int capacidade, String bloco, boolean temSistemaSom, boolean temEstruturaTraducao) {
        super(nome, capacidade, bloco);
        this.temSistemaSom = temSistemaSom;
        this.temEstruturaTraducao = temEstruturaTraducao;
    }

    public boolean isTemSistemaSom() {
        return temSistemaSom;
    }

    public void setTemSistemaSom(boolean temSistemaSom) {
        this.temSistemaSom = temSistemaSom;
    }

    public boolean isTemEstruturaTraducao() {
        return temEstruturaTraducao;
    }

    public void setTemEstruturaTraducao(boolean temEstruturaTraducao) {
        this.temEstruturaTraducao = temEstruturaTraducao;
    }
}
