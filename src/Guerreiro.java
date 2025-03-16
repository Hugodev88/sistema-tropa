// Subclasse Guerreiro
public class Guerreiro extends Personagem {
    private int defesa;
    private String arma;

    public Guerreiro(String nome, int vida, int nivel, int dano, int defesa, String arma) {
        super(nome, vida, nivel, dano);
        this.defesa = defesa;
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca com " + arma + " causando " + dano + " de dano!");
    }

    public void defender() {
        System.out.println(nome + " se defende e reduz " + defesa + " de dano!");
    }
}
