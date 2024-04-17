import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj znak:");
        char znak = scanner.next().charAt(0);

        System.out.println("Podaj liczbę wierszy:");
        int liczbaWierszy = scanner.nextInt();

        System.out.println("Podaj liczbę kolumn:");
        int liczbaKolumn = scanner.nextInt();

        // Generowanie macierzy
        char[][] macierz = new char[liczbaWierszy][liczbaKolumn];
        for (int i = 0; i < liczbaWierszy; i++) {
            for (int j = 0; j < liczbaKolumn; j++) {
                macierz[i][j] = znak;
            }
        }

        // Wyświetlanie macierzy
        System.out.println("Wygenerowana macierz:");
        for (int i = 0; i < liczbaWierszy; i++) {
            for (int j = 0; j < liczbaKolumn; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
