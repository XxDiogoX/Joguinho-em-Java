package jogo.Entities;

public class Inimigo extends Jogador {
    
    public Inimigo(String nome, int hp, int def, int atq){
        super(nome,hp,def,atq);
        
    }

    public void atacaroJogador(Jogador j1) {
        int dano = this.ataque - j1.getDefesa();
        j1.setHp(j1.getHp() - dano);
        System.out.println("O jogador " + j1.getName() + " recebeu " + dano + " de dano do inimigo " + this.name + ".");
        System.out.println(j1.getName() + " HP: " + j1.getHp());

    }
}
