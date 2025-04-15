import java.util.*;

public class DancaRoboHash {
    public static void main(String[] args) {
        int n = 79;

        int[] receita = {56, 74, 6, 30, 63, 32, 70, 8, 78, 52, 11, 67, 35, 
                         39, 44, 9, 46, 40, 69, 31, 54, 50, 64, 20, 7, 14, 
                         58, 23, 37, 26, 71, 49, 41, 75, 57, 27, 43, 10, 21, 
                         16, 19, 17, 29, 53, 5, 48, 62, 15, 72, 22, 42, 55, 
                         2, 61, 36, 65, 73, 12, 0, 18, 68, 4, 45, 13, 25, 76, 
                         34, 38, 59, 60, 51, 3, 66, 33, 77, 28, 47, 24, 1};

        int[] posicoes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                         15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 
                         28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
                         41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 
                         54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 
                         67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78};

        Set<Integer> composicoes = new HashSet<>();
        int rodada = 0;
        composicoes.add(Arrays.hashCode(posicoes));

        while (true) {
            posicoes = mostraReceita(posicoes, receita);
            rodada++;
            int hashAtual = Arrays.hashCode(posicoes);
            if (composicoes.contains(hashAtual)) {
                break;
            }
            composicoes.add(hashAtual);
        }

        System.out.println("A dança durou " + rodada + " rodadas.");
    }

    public static int[] mostraReceita(int[] posicoes, int[] receita) {
        int n = posicoes.length;
        int[] novaOrdem = new int[n];
        for (int i = 0; i < n; i++) {
            novaOrdem[i] = posicoes[receita[i]];
        }
        return novaOrdem;
    }
}