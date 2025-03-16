public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int nivel;
    protected int dano;

    public Personagem(String nome, int vida, int nivel, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.dano = dano;
    }

    public abstract void atacar();
    
    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) this.vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }

    public void subirNivel() {
        this.nivel++;
        System.out.println(nome + " subiu para o nível " + nivel + "!");
    }
}