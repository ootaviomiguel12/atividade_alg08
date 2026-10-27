import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    maiorMenorMedia();

    buscaEFrequencia();

    int [] resultado = inversaoDoVetor();

    for (int numero : resultado){
        System.out.println(numero + " ");
    }

    vetoresParesEImpares();
}


//Maior, Menor e Media
    public static void maiorMenorMedia () {
        var scanner = new Scanner(System.in);

        int [] vetor = new int[10];
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite o valor a ser inserido no vetor:");
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Posicao [" + i + "]:");
            vetor[i] = scanner.nextInt();

            soma += vetor[i];
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
        double media = (double) soma / vetor.length;

        System.out.println("\nO maior valor armazenado é: " + maior);
        System.out.println("O menor valor armazenado é: " + menor);
        System.out.println("A media dos elementos é: " + media);
    }

    //Busca e Frequencia
    public static void buscaEFrequencia () {
    var scanner = new Scanner(System.in);

    int alvo;
    int frequencia = 0;
    String posicoes = "";

    int[] vetor = new int[8];
        System.out.println("Digite o numero a ser inserido no vetor:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posicao [" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }
            System.out.println("Digite o numero a ser buscado no vetor:");
            alvo = scanner.nextInt();

            for (int i = 0; i < vetor.length; i++) {
                if (alvo == vetor[i]) {
                    frequencia++;
                    posicoes += i + " ";
                }
            }
        System.out.println();
                if (frequencia > 0) {
                    System.out.println("O numero: " + alvo + " está presente no vetor " + frequencia + " vez(es) ");
                    System.out.println("Encontrado nas posicoes: " + posicoes);
                }
                else {
                    System.out.println("O numero buscado não está presente no vetor");
                }
            }

//Inversão de Vetor
    public static int[] inversaoDoVetor () {
        var scanner = new Scanner(System.in);
        int[] vetorOriginal = new int[6];
        int[] vetorAuxiliar = new int[6];

        System.out.println("Digite o valor a ser inserido no vetor:");
        for (int i = 0; i < vetorOriginal.length; i++) {
            System.out.println("Posicao [" + i + "]: ");
            vetorOriginal[i] = scanner.nextInt();
        }

        int tamanho = vetorOriginal.length;
        for (int i = 0; i < tamanho; i++){
            vetorAuxiliar[tamanho - 1 - i] = vetorOriginal[i];
        }

        System.out.println("Vetor invertido: ");
        return vetorAuxiliar;
    }

    //Separação de Pares e Ímpares
    public static void vetoresParesEImpares(){
    var scanner = new Scanner(System.in);
    int [] vetorPrincipal = new int[10];
    int qtdPares = 0;
    int qtdImpares = 0;

        System.out.println("Digite os valores a serem inseridos no vetor:");
        for (int i = 0; i < vetorPrincipal.length; i++){
            System.out.println("Posicao [" + i + "]: ");
            vetorPrincipal[i] = scanner.nextInt();

            if (vetorPrincipal[i] % 2 == 0){
                qtdPares++;
            }
            else {
                qtdImpares++;
            }
        }
        int [] vetorPares = new int[qtdPares];
        int [] vetorImpares = new int[qtdImpares];

        int indicePar = 0;
        int indiceImpar = 0;

        for (int i = 0; i < vetorPrincipal.length; i++) {
            if (vetorPrincipal[i] % 2 == 0) {
                vetorPares[indicePar] = vetorPrincipal[i];
                indicePar++;
            } else {
                vetorImpares[indiceImpar] = vetorPrincipal[i];
                indiceImpar++;
            }
        }
            System.out.println("Numeros pares: " + qtdPares);

            for (int num : vetorPares) {
                System.out.println(num + " ");
            }

            System.out.println("Numeros impares: " + qtdImpares);
            for (int num : vetorImpares) {
                System.out.println(num + " ");
            }
    }
}
