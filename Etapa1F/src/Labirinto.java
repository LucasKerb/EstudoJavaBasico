import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Labirinto {
	private char[][] LabTxt;
	private int linhas;
	private int colunas;

	public void criaLabirinto(String nomeArquivo) throws IOException {
		try {
			BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
			String linha;
			linhas = 0;
			colunas = 0;

			// Conta o número de linhas e a maior quantidade de colunas no arquivo
			while ((linha = leitor.readLine()) != null) {
				linhas++;
				if (linha.length() > colunas) {
					colunas = linha.length();
				}
			}

			LabTxt = new char[linhas][colunas];

			// Reinicializa o leitor para ler o arquivo novamente
			leitor.close();
			leitor = new BufferedReader(new FileReader(nomeArquivo));

			int i = 0;

			// Preenche a matriz com os caracteres do arquivo
			while ((linha = leitor.readLine()) != null) {
				for (int j = 0; j < linha.length(); j++) {
					LabTxt[i][j] = linha.charAt(j);
				}
				i++;
			}

			leitor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean percorreLabirinto() throws IllegalArgumentException {
		if (LabTxt == null) {
			throw new IllegalArgumentException();
		}
		if (temSaida(LabTxt)) {
			Ponto inicio = encontraInicio(LabTxt);
			Set<Ponto> visitados = new HashSet<>();
			if (percorreLabirinto(LabTxt, inicio, visitados)) {
				imprimeLabirinto(LabTxt);
				return true;
			} else {
				System.out.println("Não há saída no labirinto.");
				return false;
			}
		} else {
			System.out.println("Não há saída no labirinto.");
			return false;
		}
	}

	public static boolean temSaida(char[][] labirinto) {
		for (int i = 0; i < labirinto.length; i++) {
			for (int j = 0; j < labirinto[i].length; j++) {
				if (labirinto[i][j] == 'D') {
					return true;
				}
			}
		}
		return false;
	}

	public static class Ponto {
		int linha;
		int coluna;

		public Ponto(int linha, int coluna) {
			this.linha = linha;
			this.coluna = coluna;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null || getClass() != obj.getClass()) {
				return false;
			}
			Ponto ponto = (Ponto) obj;
			return linha == ponto.linha && coluna == ponto.coluna;
		}

		@Override
		public int hashCode() {
			return Objects.hash(linha, coluna);
		}
	}

	public static Ponto encontraInicio(char[][] labirinto) {
		for (int i = 0; i < labirinto.length; i++) {
			for (int j = 0; j < labirinto[i].length; j++) {
				if (labirinto[i][j] == ' ') {
					return new Ponto(j, i);
				}
			}
		}
		return null;
	}

	private boolean percorreLabirinto(char[][] labirinto, Ponto atual, Set<Ponto> visitados) {
		if (!eValido(atual, labirinto) || labirinto[atual.coluna][atual.linha] == 'X' || visitados.contains(atual)) {
			return false;
		}

		if (labirinto[atual.coluna][atual.linha] == 'D') {
			labirinto[atual.coluna][atual.linha] = 'S'; // Marca a saída
			return true;
		}

		visitados.add(atual);

		// Tenta encontrar a saída nas quatro direções
		if (percorreLabirinto(labirinto, new Ponto(atual.linha, atual.coluna - 1), visitados)) { // Cima
			labirinto[atual.coluna][atual.linha] = 'O'; // Marca o caminho
			return true;
		}
		if (percorreLabirinto(labirinto, new Ponto(atual.linha + 1, atual.coluna), visitados)) { // Direita
			labirinto[atual.coluna][atual.linha] = 'O'; // Marca o caminho
			return true;
		}
		if (percorreLabirinto(labirinto, new Ponto(atual.linha, atual.coluna + 1), visitados)) { // Baixo
			labirinto[atual.coluna][atual.linha] = 'O'; // Marca o caminho
			return true;
		}
		if (percorreLabirinto(labirinto, new Ponto(atual.linha - 1, atual.coluna), visitados)) { // Esquerda
			labirinto[atual.coluna][atual.linha] = 'O'; // Marca o caminho
			return true;
		}

		visitados.remove(atual);
		labirinto[atual.coluna][atual.linha] = ' '; // Remove a posição atual do conjunto de visitados
		return false;
	}

	public static boolean eValido(Ponto ponto, char[][] labirinto) {
		return ponto.linha >= 0 && ponto.linha < labirinto[0].length && ponto.coluna >= 0
				&& ponto.coluna < labirinto.length;
	}

	public static void imprimeLabirinto(char[][] labirinto) {
		for (char[] linha : labirinto) {
			for (char celula : linha) {
				if (Character.isLetter(celula)) {
				} else {
					celula = ' ';
				}
				System.out.print(celula);
			}
			System.out.println();
		}
		System.out.println();
	}
}
