import java.util.Scanner;
public class JogoDaVelha {
    private Mapa Mapa;
    private PC PC;
    private Jogador Jogador;
    
    private JogoDaVelha(){
        Scanner teclado = new Scanner(System.in);
      this.Mapa = new Mapa();
      this.PC = new PC(this.Mapa);
      this.Jogador = new Jogador(this.Mapa);

      char opcao;
      do {
        System.out.println("\u001b[H\u001b[2J");
        this.jogar(teclado);
        System.out.println();
        System.out.println("________________________");
        System.out.println("Deseja jogar novamente (s/n)? ");
        opcao = teclado.next().charAt(0);
     } while(opcao == 's');

     System.out.println("--- FIM ---");
     teclado.close();
    }
    private void jogar(Scanner teclado) {
        this.Mapa.limpar();
      boolean alternar = false;
      if (this.Mapa.sortear(0, 2) == 0) {
         alternar = true;
      }

      boolean empate = true;
      int jogada = 0;
      this.Mapa.desenhar(jogada);

      for(; jogada < 9; this.Mapa.desenhar(jogada)) {
         ++jogada;
         if (alternar) {
            if (this.PC.jogar()) {
               empate = false;
               break;
            }

            alternar = false;
         } else {
            if (this.Jogador.jogar(teclado)) {
               empate = false;
               break;
            }

            alternar = true;
         }
      }
    }
    public static void main(String[] args) {
        new JogoDaVelha();
    }
}
