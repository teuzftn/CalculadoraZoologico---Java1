import java.util.Scanner;
import java.util.Locale;

public class CalculadoraZoologico {


    private static final int limite_maximo_ingresso = 5;
    private static final double preco_crianca = 10.00;
    private static final double preco_adulto = 30.00;
    private static final double preco_idoso = 15.00;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do visitante: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a quantidade de bilhetes a serem comprados: ");
        int quantidade = scanner.nextInt();

        if (quantidade > limite_maximo_ingresso || quantidade <= 0) {

            System.out.println("Erro: Quantidade de bilhetes inválida.");
            System.out.println("O máximo permitido é de " + limite_maximo_ingresso + " bilhetes por pessoa.");

        } else if (idade < 0) {

            System.out.println("Erro: A idade informada é inválida.");

        } else {


            double precoUnitario;

            if (idade <= 12) {
                precoUnitario = preco_crianca;
            } else if (idade >= 13 && idade <= 59) {
                precoUnitario = preco_adulto;
            } else {
                precoUnitario = preco_idoso;
            }

            double precoTotal = precoUnitario * quantidade;

            System.out.printf("O preço total para %d ingresso(s) é: R$ %.2f\n", quantidade, precoTotal);
        }

        scanner.close();
    }
}