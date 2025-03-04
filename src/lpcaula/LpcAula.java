public class LpcAula {

    // Função para verificar se "SELECT" aparece na string de forma insensível a maiúsculas e minúsculas
    public static boolean verificaSelect(String texto) {
        // A palavra "SELECT" tem 6 caracteres
        String palavra = "SELECT";
        
        // Verifica se a string tem pelo menos o tamanho da palavra "SELECT"
        if (texto.length() < palavra.length()) {
            return false;
        }
        
        // Percorre a string e compara letra por letra
        for (int i = 0; i < palavra.length(); i++) {
            char letraEsperada = palavra.charAt(i);
            char letraTexto = texto.charAt(i);

            // Verifica se o caractere no texto é a mesma letra da palavra ou sua versão minúscula
            if (letraTexto != letraEsperada && letraTexto != Character.toLowerCase(letraEsperada)) {
                return false;
            }
        }
        
        // Se passar todas as comparações, encontramos "SELECT"
        return true;
    }
} 