import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DancaRoboV4 {
    public static void main(String[] args) {
        
        int n = 7;

        int[] receita = {5, 6, 0, 4, 2, 3, 1};

        int[] posicoes = new int[n];
        for (int i = 0; i < n; i++) {
            posicoes[i] = i;
        }

        Set<Integer> listaRodadas = new HashSet<>();
        int rodada = 0;
        listaRodadas.add(Arrays.hashCode(posicoes));

        while (true) {
            posicoes = fazDanca(posicoes, receita);
            rodada++;
            int hashAtual = Arrays.hashCode(posicoes);
            if (listaRodadas.contains(hashAtual)) {
                break;
            }
            listaRodadas.add(hashAtual);
        }

        System.out.println("A dança durou " + rodada + " rodadas.");
    }

    public static int[] fazDanca(int[] posicoes, int[] receita) {
        int n = posicoes.length;
        int[] novasPosicoes = new int[n];
        for (int i = 0; i < n; i++) {
            novasPosicoes[i] = posicoes[receita[i]];
        }
        return novasPosicoes;
    }
}