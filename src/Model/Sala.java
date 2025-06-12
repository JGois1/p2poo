package Model;

public class Sala extends Local {
    private int numeroSala;
    private boolean temEquipamentoMultimidia;

    public Sala(String nome, int capacidade, String bloco, int numeroSala, boolean temEquipamentoMultimidia) {
        super(nome, capacidade, bloco);
        this.numeroSala = numeroSala;
        this.temEquipamentoMultimidia = temEquipamentoMultimidia;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isTemEquipamentoMultimidia() {
        return temEquipamentoMultimidia;
    }

    public void setTemEquipamentoMultimidia(boolean temEquipamentoMultimidia) {
        this.temEquipamentoMultimidia = temEquipamentoMultimidia;
    }
}
