
package aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    Random random = new Random();
    
    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2) {
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
            System.out.println("Luta Aprovada");
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Luta Reprovada");
        }
        System.out.println("==================================");
    }
    
    public void lutar(){
        if (isAprovada() == true) {
            desafiado.status();
            System.out.println("==================================");
            desafiante.status();
            System.out.println("==================================");
            int vencedor = random.nextInt(3);
            switch (vencedor) {
                case 0:
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    System.out.println("A luta empatou!");
                    break;
                case 1:
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    System.out.println("Ganhador: " + desafiado.getNome());
                    break;
                case 2:
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    System.out.println("Ganhador: " + desafiante.getNome());
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
        System.out.println("==================================");
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
