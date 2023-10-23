package sistem;

import classes.Carro;
import classes.Locador;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Carro> carros;
    private List<Locador> locadores;

    public Cadastro() {
        carros = new ArrayList<>();
        locadores = new ArrayList<>();
    }

    public void cadastrarCarro(Carro carro) {
        carros.add(carro);
    }

    public void cadastrarLocador(Locador locador) {
        locadores.add(locador);
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public List<Locador> getLocadores() {
        return locadores;
    }
}
