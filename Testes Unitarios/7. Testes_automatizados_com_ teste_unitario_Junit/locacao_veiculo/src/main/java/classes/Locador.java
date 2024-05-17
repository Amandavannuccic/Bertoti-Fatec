package classes;

public class Locador {
    private String nome;
    private boolean CNH;
    private boolean credito;

    public Locador(String nome, boolean CNH, boolean credito) {
        this.nome = nome;
        this.CNH = CNH;
        this.credito = credito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCNH() {
        return CNH;
    }

    public void setCNH(boolean CNH) {
        this.CNH = CNH;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }


}