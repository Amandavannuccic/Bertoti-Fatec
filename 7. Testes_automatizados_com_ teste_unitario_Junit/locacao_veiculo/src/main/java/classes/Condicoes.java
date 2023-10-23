package classes;

public class Condicoes {
    private boolean limpo;
    private boolean combustivel;

    public Condicoes(boolean limpo, boolean combustivel) {
        this.limpo = limpo;
        this.combustivel = combustivel;
    }

    public boolean isLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }

    public boolean isCombustivel() {
        return combustivel;
    }

    public void setCombustivel(boolean combustivel) {
        this.combustivel = combustivel;
    }

}