import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do herói
        System.out.print("Digite o nome do Herói: ");
        String nomeHeroi = scanner.nextLine();

        // Solicita o número de vitórias
        System.out.print("Digite o número de vitórias: ");
        int vitorias = scanner.nextInt();

        // Solicita o número de derrotas
        System.out.print("Digite o número de derrotas: ");
        int derrotas = scanner.nextInt();

        // Chama a função para calcular o nível
        calcularNivel(nomeHeroi, vitorias, derrotas);

        scanner.close();
    }

    public static void calcularNivel(String nomeHeroi, int vitorias, int derrotas) {
        int saldoVitorias = vitorias - derrotas;
        String nivel;

        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias >= 11 && vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        // Saída
        System.out.println("O Invocador " + nomeHeroi + " tem um total de " + saldoVitorias + " e está no Elo " + nivel);
    }
}
