// Classe principal para testar o sistema
public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Aragorn", 100, 1, 20, 15, "Espada");
        Mago mago = new Mago("Gandalf", 80, 1, 25, 100, "Bola de Fogo");

        // Testando as funcionalidades
        guerreiro.atacar();
        guerreiro.defender();
        guerreiro.receberDano(30);
        guerreiro.subirNivel();

        System.out.println("\n-------------------\n");

        mago.atacar();
        mago.recuperarMana();
        mago.receberDano(20);
        mago.subirNivel();
    }
}
