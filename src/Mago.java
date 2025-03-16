// Subclasse Mago
public class Mago extends Personagem {
    private int mana;
    private String magia;

    public Mago(String nome, int vida, int nivel, int dano, int mana, String magia) {
        super(nome, vida, nivel, dano);
        this.mana = mana;
        this.magia = magia;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " lança " + magia + " causando " + dano + " de dano mágico!");
    }

    public void recuperarMana() {
        mana += 10;
        System.out.println(nome + " recuperou mana. Mana atual: " + mana);
    }
}
