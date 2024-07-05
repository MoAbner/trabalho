
/**
 * Escreva uma descrição da classe Infocliente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;

public class CalculadoraProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a área da parede em metros quadrados: ");
        double areaParede = scanner.nextDouble();

        System.out.print("Digite a área do chão em metros quadrados: ");
        double areaChao = scanner.nextDouble();

        Produto tijolo = new Tijolo();
        Produto porcelanato = new Porcelanato();
        Produto tinta = new Tinta();
        Produto cimento = new Cimento();

        System.out.println("Total de tijolos necessários: " + tijolo.calcularQuantidade(areaParede));
        System.out.println("Custo total dos tijolos: R$ " + CalculadoraCusto.calcularCusto(tijolo, areaParede));

        System.out.println("Total de latas de tinta necessárias: " + tinta.calcularQuantidade(areaParede));
        System.out.println("Custo total das latas de tinta: R$ " + CalculadoraCusto.calcularCusto(tinta, areaParede));

        System.out.println("Total de sacos de cimento necessários: " + cimento.calcularQuantidade(areaParede));
        System.out.println("Custo total dos sacos de cimento: R$ " + CalculadoraCusto.calcularCusto(cimento, areaParede));

        System.out.println("Total de peças de porcelanato necessárias: " + porcelanato.calcularQuantidade(areaChao));
        System.out.println("Custo total das peças de porcelanato: R$ " + CalculadoraCusto.calcularCusto(porcelanato, areaChao));

    }
}


