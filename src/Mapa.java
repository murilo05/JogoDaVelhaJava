import jdk.javadoc.internal.doclets.toolkit.taglets.SummaryTaglet;

public class Mapa {
    //Vetor do Mapa
    private char[][] mapa = new char[3][3];
    //Sortear
    public int sortear(int inicio, int fim) {
        return (int) ((Math.random() * fim) - inicio);
    }
    //Limpar Mapa
    public void limpar() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa.length; j++) {
                mapa[i][j] = ' ';
            }
        }

    }

    PC pc;
    // Desenho do Mapa
    public void desenhar(int jogada) {
        System.out.println("------------- .. jogada: " + jogada);
        System.out.println("| " + this.mapa[0][0] + " | " + this.mapa[0][1] + " | " + this.mapa[0][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + this.mapa[1][0] + " | " + this.mapa[1][1] + " | " + this.mapa[1][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + this.mapa[2][0] + " | " + this.mapa[2][1] + " | " + this.mapa[2][2] + " |");
        System.out.println("----------------------------");
    }
    //Jogada
    public boolean jogar(int l, int c, char jogador) {
        if (mapa[l][c] == ' ') {
            mapa[l][c] = jogador;
            return true;
        }
        return false;

    }
    // Verificação do Ganhador (Validações)
    public boolean verificarGanhador(char jogador) { 
        int c;
        for (c = 0; c < 3; ++c) {
            if (this.mapa[c][0] == jogador && this.mapa[c][1] == jogador && this.mapa[c][2] == jogador) {
                return true;
            }
        }

        for (c = 0; c < 3; ++c) {
            if (this.mapa[0][c] == jogador && this.mapa[1][c] == jogador && this.mapa[2][c] == jogador) {
                return true;
            }
        }

        if (this.mapa[0][0] == jogador && this.mapa[1][1] == jogador && this.mapa[2][2] == jogador) {
            return true;
        } else if (this.mapa[0][2] == jogador && this.mapa[1][1] == jogador && this.mapa[2][0] == jogador) {
            return true;
        } else {
            return false;
        }
    }
}
