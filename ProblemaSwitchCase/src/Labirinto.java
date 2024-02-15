
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Labirinto {
    public static void main(String[] args) {
        String nomeArquivo = "seuarquivo.txt"; // Substitua pelo nome do seu arquivo
        char[][] labirinto;

        try {
            BufferedReader rd = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            int linhas = 0;
            int colunas = 0;

            // Conta o número de linhas e a maior quantidade de colunas no arquivo
            while ((linha = rd.readLine()) != null) {
                linhas++;
                if (linha.length() > colunas) {
                    colunas = linha.length();
                }
            }

            labirinto = new char[linhas][colunas];

            // Reinicializa o leitor para ler o arquivo novamente
            rd.close();
            rd = new BufferedReader(new FileReader(nomeArquivo));

            int i = 0;

            // Preenche a matriz com os caracteres do arquivo
            while ((linha = rd.readLine()) != null) {
                for (int j = 0; j < linha.length(); j++) {
                    labirinto[i][j] = linha.charAt(j);
                }
                i++;
            }

            rd.close();

            // Agora você tem os dados armazenados na matriz
            // Você pode acessá-los conforme necessário
            for (int row = 0; row < labirinto.length; row++) {
                for (int col = 0; col < labirinto[row].length; col++) {
                    char character = labirinto[row][col];
                    System.out.print(character + " ");
                }
                System.out.println(); // Pule para a próxima linha
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
