package chaptertwo;

import java.util.Scanner;

public class EstruturasControle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Verificar idade (if/else)");
            System.out.println("2 - Verificar cargo (switch)");
            System.out.println("3 - Loop for");
            System.out.println("4 - Loop while");
            System.out.println("5 - Loop do while");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    verificarIdade(scanner);
                    break;
                case 2:
                    verificarCargo(scanner);
                    break;
                case 3:
                    executarFor(scanner);
                    break;
                case 4:
                    executarWhile(scanner);
                    break;
                case 5:
                    executarDoWhile(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void verificarIdade(Scanner scanner) {
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 13) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
    }

    public static void verificarCargo(Scanner scanner) {
        System.out.print("Digite seu cargo (user, moderator, admin): ");
        String cargo = scanner.nextLine();

        switch (cargo) {
            case "user":
                System.out.println("Acesso limitado");
                break;
            case "moderator":
                System.out.println("Acesso intermediário");
                break;
            case "admin":
                System.out.println("Acesso total");
                break;
            default:
                System.out.println("Cargo desconhecido");
        }
    }

    public static void executarFor(Scanner scanner) {
        System.out.print("Quantas vezes repetir? ");
        int vezes = scanner.nextInt();

        for (int i = 1; i <= vezes; i++) {
            System.out.println("Repetição " + i);
        }
    }

    public static void executarWhile(Scanner scanner) {
        System.out.print("Digite um número (0 para sair): ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            System.out.println("Você digitou: " + numero);
            System.out.print("Digite outro número (0 para sair): ");
            numero = scanner.nextInt();
        }
    }

    public static void executarDoWhile(Scanner scanner) {
        int numero;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
            System.out.println("Você digitou: " + numero);
        } while (numero != 0);
    }
}
