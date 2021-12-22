package jogo.Entities;

public class Jogador {

    String name;
    int hp;
    int defesa;
    int ataque; 
    
    public Jogador(String nome, int hp, int def, int atq){
        this.name = nome;
        this.hp = hp;
        this.defesa = def;
        this.ataque = atq;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void atacarInimigo(Inimigo p1) {
        int dano = this.ataque - p1.getDefesa();
        p1.setHp(p1.getHp()-  dano);
        System.out.println("O inimigo " + p1.getName() + " recebeu " + dano + " de dano do jogador " + this.name + ".");
        System.out.println(p1.getName()+ " HP: " + p1.getHp());
    }

    @Override
    public String toString() {
        System.out.println("--------- Status ---------");
        return "Nome: " + this.name + "\nHP: " + this.hp + "\nAtaque: " + this.ataque + "\nDefesa: " + this.defesa;
    }

}
