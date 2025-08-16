package principal;

import models.ConsultaMoeda;
import models.Conversao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();

        System.out.println("************************************************");
        System.out.println("Bem-vindo ao Conversor de Moedas!");

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\n************************************************");
            System.out.println("Escolha uma das opções para conversão:");
            System.out.println("1) Dólar Americano (USD) =>> Real Brasileiro (BRL)");
            System.out.println("2) Real Brasileiro (BRL) =>> Dólar Americano (USD)");
            System.out.println("3) Dólar Americano (USD) =>> Peso Argentino (ARS)");
            System.out.println("4) Peso Argentino (ARS) =>> Dólar Americano (USD)");
            System.out.println("5) Dólar Americano (USD) =>> Euro (EUR)");
            System.out.println("6) Euro (EUR) =>> Dólar Americano (USD)");
            System.out.println("7) Sair");
            System.out.println("************************************************");
            System.out.print("Opção: ");

            try {
                opcao = in.nextInt();

                if (opcao == 7) {
                    System.out.println("\nFinalizando a aplicação. Até mais!");
                    continue;
                }

                if (opcao < 1 || opcao > 7) {
                    System.out.println("\nOpção inválida! Por favor, escolha um número entre 1 e 7.");
                    continue;
                }

                String moedaBase = "";
                String moedaDestino = "";

                switch (opcao) {
                    case 1:
                        moedaBase = "USD";
                        moedaDestino = "BRL";
                        break;
                    case 2:
                        moedaBase = "BRL";
                        moedaDestino = "USD";
                        break;
                    case 3:
                        moedaBase = "USD";
                        moedaDestino = "ARS";
                        break;
                    case 4:
                        moedaBase = "ARS";
                        moedaDestino = "USD";
                        break;
                    case 5:
                        moedaBase = "USD";
                        moedaDestino = "EUR";
                        break;
                    case 6:
                        moedaBase = "EUR";
                        moedaDestino = "USD";
                        break;
                }

                System.out.printf("Digite o valor em %s que deseja converter para %s: ", moedaBase, moedaDestino);
                double valorParaConverter = in.nextDouble();

                Conversao conversao = consulta.buscaTaxas(moedaBase);
                Double taxaDeConversao = conversao.conversion_rates().get(moedaDestino);

                if (taxaDeConversao == null) {
                    System.out.println("Não foi encontrada a taxa de conversão para a moeda de destino.");
                } else {
                    double valorConvertido = valorParaConverter * taxaDeConversao;
                    System.out.println("\n--- RESULTADO ---");
                    System.out.printf("O valor de %.2f [%s] corresponde ao valor final de %.2f [%s]%n",
                            valorParaConverter, moedaBase, valorConvertido, moedaDestino);
                }

            } catch (InputMismatchException e) {
                System.out.println("\nErro: Entrada inválida. Por favor, digite um número.");
                in.next();
            } catch (RuntimeException e) {
                System.out.println("\n--- ERRO ---");
                System.out.println(e.getMessage());
            }
        }
    }
}

