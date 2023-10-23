package sistem;

import classes.Carro;
import classes.Locador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaLocacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID do Carro: ");
        int carroId = scanner.nextInt();
        scanner.nextLine();  // Para consumir a quebra de linha deixada pelo nextInt()

        System.out.print("Modelo do Carro: ");
        String carroModelo = scanner.nextLine();

        System.out.print("Cor do Carro: ");
        String carroCor = scanner.nextLine();

        System.out.print("Nome do Locador: ");
        String locadorNome = scanner.nextLine();

        System.out.print("Possui CNH (true/false): ");
        boolean locadorCNH = scanner.nextBoolean();

        System.out.print("Possui Crédito (true/false): ");
        boolean locadorCredito = scanner.nextBoolean();


        Carro carro = new Carro(carroId, carroModelo, carroCor);
        carro.setCondicoesDeUso(true);
        carro.setDisponibilidade(true);


        Locador locador = new Locador(locadorNome, locadorCNH, locadorCredito);

        if (carro.isDisponibilidade() && locador.isCredito()) {
            System.out.println("O carro pode ser alugado por " + locador.getNome());
        } else {
            System.out.println("O carro não pode ser alugado por " + locador.getNome());
        }
    }

    public static boolean podeSerAlugado(Carro disponilibilidade, Locador credito) {

        return false;
    }
}

