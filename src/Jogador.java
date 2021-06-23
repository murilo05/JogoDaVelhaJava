import java.util.Scanner;

public class Jogador {
    private char letra;
    Mapa mapa;

    public Jogador(Mapa mapa) {
        this.letra = 'X';
        this.mapa = mapa;

    }
    // Jogadas Jogador
    public boolean jogar(Scanner teclado) {
        while(true) {
            System.out.println("Jogador ..");
            System.out.print("  linha: ");
            int l = teclado.nextInt();
            System.out.print("  coluna: ");
            int c = teclado.nextInt();
            if (l >= 0 && l <= 2 && c >= 0 && c <= 2) {
               if (this.mapa.jogar(l, c, 'X')) {
                  if (this.mapa.verificarGanhador('X')) {
                     System.out.println(" ... Jogador GANHOU!");
                     return true;
                  }
   
                  return false;
               }
   
               System.out.println(" posição inválida!");
            }
         }
    }
}
