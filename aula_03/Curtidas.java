import java.util.Scanner;

public class Curtidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de Publicações que você deseja analisar: ");
        int numeroPublicacoes = entrada.nextInt();

        int totalCurtidas = 0; // acumuladora

        for (int i = 1; i <= numeroPublicacoes; i++) {
            System.out.printf("Quantas curtidas você recebeu #%d: ", i);
            int numeroCurtidas = entrada.nextInt();

            totalCurtidas = totalCurtidas + numeroCurtidas;

            if (numeroCurtidas >= 100) {
                System.out.println("Publicação popular!");
            }
            else{
                System.out.println("Publicação com poucas curtidas!");
            }
        }
        double mediaCurtidas = (double) totalCurtidas / numeroPublicacoes;

        System.out.printf("Média de Curtidas = %.1f\n", mediaCurtidas);
        System.out.printf("Número de Publicações = %d\n", numeroPublicacoes);

        entrada.close();
    }
}