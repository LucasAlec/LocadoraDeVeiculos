package utils;

public class AvaliacaoUtils {
    public static String exibirEstrelas(int avaliacao) {
        StringBuilder estrelas = new StringBuilder();
        for (int i = 0; i < avaliacao; i++) {
            estrelas.append("★");  // Adiciona uma estrela cheia
        }
        for (int i = avaliacao; i < 3; i++) {
            estrelas.append("☆");  // Adiciona uma estrela vazia
        }
        return estrelas.toString();
    }
}

