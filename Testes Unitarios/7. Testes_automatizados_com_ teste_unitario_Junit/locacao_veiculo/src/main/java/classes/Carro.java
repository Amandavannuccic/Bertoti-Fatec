package classes;

public class Carro {
    private int id; //>0
    private String modelo; // Passeio ou Carga
    private String cor; // Cinza ou Preto
    private boolean condicoesDeUso; // Propio ou Impropio
    private boolean disponibilidade; // Disponível ou Indisponivel

    public Carro(int id, String modelo, String cor) {
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
        this.condicoesDeUso = false;
        this.disponibilidade = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCondicoesDeUso() {
        return condicoesDeUso;
    }

    public void setCondicoesDeUso(boolean condicoesDeUso) {
        this.condicoesDeUso = condicoesDeUso;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}




