import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "src/Lab.txt"; // Nome do arquivo do labirinto

        // Crie uma instância da classe Labirinto
        Labirinto labirinto = new Labirinto();

        // Chame o método criaLabirinto passando o nome do arquivo como argumento
        labirinto.criaLabirinto(filename);
        labirinto.imprimeLabirinto();
        System.out.println();
        System.out.println("Labirinto Resolvido:");
        System.out.println();
 
        labirinto.percorreLabirinto();
    }
}