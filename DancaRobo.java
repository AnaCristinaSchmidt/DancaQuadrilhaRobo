import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class DancaRobo {
    public static void main(String[] args) {

        int n = 7; //robos
        int[] receita = {5, 6, 0, 4, 2, 3, 1}; //Receita inciada.
        int[] posicoes = {2,6,4,5,3,0,1}; //Comecam os movimentos.
        Set<String> composicao= new HashSet<>();
        int rodada =0;
        composicao.add(Arrays.toString(posicoes)); 
        while (true){
            posicoes = mostraReceita(posicoes,receita);
            rodada++;
            String composicaoAtual=Arrays.toString(posicoes);
            if(composicao.contains(composicaoAtual)){
                break; // composicao repetida, fim da dança
            }
            composicao.add(composicaoAtual);
        }
        System.out.println("A dança durou " + rodada + "rodadas antes de repetir.");
    }
    
    public static int [] mostraReceita(int[] posicoes, int [] receita) {
        int n = 7;
        int [] novaOrdem = new int[n];

        for (int i = 0; i < n; i++) {
            int pos = receita[i];
            novaOrdem[i] = posicoes[pos];
            System.out.print(novaOrdem[i]);

        }
        System.out.print("\n");
        return novaOrdem;
    }

}

