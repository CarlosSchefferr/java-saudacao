public class Main {
    public static void main(String[] args) {
        // Criamos um array de inteiros
        int [] numeros = { 9, 10, 12, 25, 2};

        // Inicializamos as variáveis maior e menor com o primeiro número do array
        int maior = numeros [0];
        int menor = numeros [0];

        // Inicializamos a variável media com 0
        int media = 0;

        // Percorremos o array
        for (int i = 0; i < numeros.length; i++) {
            // Se o número atual for maior que a variável maior, atualizamos a variável maior
            if (numeros[i] > maior) {
                maior = numeros [i];
            }
            // Se o número atual for menor que a variável menor, atualizamos a variável menor
            if (numeros [i] < menor) {
                menor = numeros [i];
            }
            // Adicionamos o número atual à variável media
            media = media + numeros [i];
        }

        // Imprimimos o maior, o menor e a média
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/numeros.length);
    }
}
