import model.Personagem;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Personagem guerreiro = new Personagem();
        guerreiro.setNome("Guerreiro");
        guerreiro.setVida(100);
        guerreiro.setMana(50);
        guerreiro.setForca(80);
        guerreiro.setDefesa(90);

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(guerreiro);

        for (int i = 2; i <= 21; i++) {
            Personagem clone = guerreiro.clone();
            clone.setNome("Guerreiro " + i);
            clone.randomizarAtributos();
            personagens.add(clone);
        }

        for (Personagem personagem : personagens) {
            System.out.println("=== " + personagem.getNome() + " ===");
            System.out.println("Vida: " + personagem.getVida());
            System.out.println("Mana: " + personagem.getMana());
            System.out.println("Força: " + personagem.getForca());
            System.out.println("Defesa: " + personagem.getDefesa());
            System.out.println("Velocidade: " + personagem.getVelocidade());
            System.out.println("Inteligência: " + personagem.getInteligencia());
            System.out.println("Agilidade: " + personagem.getAgilidade());
            System.out.println("Resistência: " + personagem.getResistencia());
            System.out.println();
        }
    }
}