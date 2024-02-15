import java.util.Random;
import java.util.Scanner;

public class PrincipalCandidatos {
    public static void main(String[] args) {
        Random random = new Random();
        int tamanhoArray = random.nextInt(100) + 1;

        Candidato[] candidatos = new Candidato[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            String nome = gerarNomeAleatorio();
            String partido = gerarPartidoAleatorio();
            int intencoesVotos = random.nextInt(1000);

            candidatos[i] = new Candidato(nome, partido, intencoesVotos);
        }

        // Ordena o array de candidatos por nome
        ordenaCandidatosPorNome(candidatos);

        // Exibir os candidatos ordenados por nome com suas posições
        System.out.println("Candidatos ordenados por nome:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Posicao " + i + ": " + candidatos[i]);
        }

        // Teste o método de pesquisa binária
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do candidato a ser pesquisado: ");
        String nomePesquisa = scanner.next();
        int posicao = pesquisaBinariaCandidatos(candidatos, nomePesquisa);

        if (posicao != -1) {
            System.out.println("Candidato encontrado na posicao " + posicao + ":");
            System.out.println(candidatos[posicao]);
        } else {
            System.out.println("Candidato nao encontrado.");
        }
    }

    // Gera nomes aleatórios a partir de um array de nomes
    private static String gerarNomeAleatorio() {
        String[] nomes = {"Lucas", "Marta", "Pedro", "Ana", "Carlos", "Maria", "Leonardo", "Joao", "Leandro", "Alana", "Luis", "Luisa", "Aristides", "Argimiro", "Gumercindo", "Hercules", "Kaleb", "Zaira"};
        Random random = new Random();
        return nomes[random.nextInt(nomes.length)];
    }

    // Gera partidos aleatórios a partir de um array de partidos
    private static String gerarPartidoAleatorio() {
        String[] partidos = {"Naruteiros", "Coloridos", "Pirata", "Lusiadas", "Pragmatico"};
        Random random = new Random();
        return partidos[random.nextInt(partidos.length)];
    }

    // Ordena o array de candidatos por nome usando o método de Seleção Direta
    public static void ordenaCandidatosPorNome(Candidato[] candidatos) {
        for (int i = 0; i < candidatos.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < candidatos.length; j++) {
                // Compara os nomes dos candidatos para encontrar o menor nome
                if (candidatos[j].getNome().compareTo(candidatos[indiceMenor].getNome()) < 0) {
                    indiceMenor = j;
                }
            }
            // Troca os candidatos para ordenar por nome
            Candidato temp = candidatos[i];
            candidatos[i] = candidatos[indiceMenor];
            candidatos[indiceMenor] = temp;
        }
    }

    // Realiza uma pesquisa binária por nome em um array de candidatos
    public static int pesquisaBinariaCandidatos(Candidato[] candidatos, String nome) {
        int inicio = 0;
        int fim = candidatos.length - 1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            // Compara o nome do candidato no meio do array com o nome de pesquisa
            if (candidatos[meio].getNome().equals(nome)) {
                resultado = meio;  // Atualiza o resultado quando encontra um candidato com o nome
                fim = meio - 1;     // Continua a busca na metade esquerda para encontrar o primeiro
            } else if (candidatos[meio].getNome().compareTo(nome) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return resultado;
    }
}
