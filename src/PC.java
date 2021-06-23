public class PC{
    private char letra;
    Mapa mapa;

    public PC(Mapa mapa) {
        this.letra = 'O';
        this.mapa = mapa;
    }

    public boolean jogar() {
        int linha, coluna;
        //Sortear Jogada PC
        do {
            linha = mapa.sortear(0, 3);
            coluna = mapa.sortear(0, 3);

        } while (!mapa.jogar(linha, coluna, letra));

        if (mapa.verificarGanhador(letra)) {
            System.out.println("PC Ganhou");
            return true;

        }

        return false;

    }
}
