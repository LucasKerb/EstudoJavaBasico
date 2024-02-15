import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto {
	private char[][] LabTxt;
	private int linhas;
	private int colunas;

	public void criaLabirinto(String filename) throws IOException{
		try {
			BufferedReader rd = new BufferedReader(new FileReader(filename));
			String linha;
			linhas = 0;
			colunas = 0;

			// Conta o número de linhas e a maior quantidade de colunas no arquivo
			while ((linha = rd.readLine()) != null) {
				linhas++;
				if (linha.length() > colunas) {
					colunas = linha.length();
				}
			}

			LabTxt = new char[linhas][colunas];

			// Reinicializa o leitor para ler o arquivo novamente
			rd.close();
			rd = new BufferedReader(new FileReader(filename));

			int i = 0;

			// Preenche a matriz com os caracteres do arquivo
			while ((linha = rd.readLine()) != null) {
				for (int j = 0; j < linha.length(); j++) {
					LabTxt[i][j] = linha.charAt(j);
				}
				i++;
			}

			rd.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void percorreLabirinto() {
	    // Inicie a exploração a partir da posição inicial (0, 0)
	    int startX = 0;
	    int startY = 0;
	    
	    moveLabirinto(startX,startY);

	    // Chame o método recursivo para percorrer o labirinto a partir da posição inicial
//	    boolean temSaida = percorreLabirinto(startX, startY);
//
//	    if (temSaida) {
//	        // Se houver uma saída, imprima o labirinto resolvido
//	        imprimeLabirintoResolvido();
//	    } else {
//	        System.out.println("Não foi possível encontrar uma saída.");
//	    }
//
//	    return temSaida;
	}
	private void moveLabirinto( int x, int y) {
		if(x == 0 && y == 0) {
			System.out.println("Vou direita");

			moveLabirinto(x + 1, y);
			
		}else{
			char cell = LabTxt[y][x];
			if(cell == 'X') {
				moveLabirinto(x, y + 1);
				System.out.println("encontrei parede");
			}
			
			
			
			
		}
		System.out.println("cu");
	}
	private boolean verificaPassagem(int x, int y) {
	    if (x < 0 || x >= colunas || y < 0 || y >= linhas) {
	    	System.out.println(x);
	    	System.out.println(y);
	    	System.out.println("Entrei no if");

	        return false;
	    }

	    char cell = LabTxt[y][x];

	    // Verifique se chegamos ao destino
	    if (cell == 'D') {
	        return true;
	    }

	    // Verifique se podemos mover para a próxima posição (espaço em branco)
	    if (cell == ' ') { 
	        // Marque esta célula como visitada (opcional)
	        LabTxt[y][x] = '*';
	        System.out.println("Giovani"+ y + x);
	        if(x == 0 && y == 0) {
	        	System.out.println("Primeira vez entrando aqui ");
	        	
	        }else {
	        	System.out.println("Segunda vez");
	        }
	        
	        
	        
	        

	        // Tente mover para todas as direções possíveis
//	        if (percorreLabirinto(x + 1, y) ||
//	            percorreLabirinto(x - 1, y) ||
//	            percorreLabirinto(x, y + 1) ||
//	            percorreLabirinto(x, y - 1)) {
//	            return true;
//	        }
//	        if (percorreLabirinto(x + 1, y) ||
//		            percorreLabirinto(x, y + 1)||
//		            percorreLabirinto(x, y - 1)) {
//	        	System.out.println("GORDISCO");
//		            return true;
//		        }
	        if(verificaPassagem(x + 1, y)) {
	        	System.out.println("Vou para a direita");
	        	return true;
	        
	        	
	        }
	        if(verificaPassagem(x , y + 1)) {
	        	System.out.println("Vou para a baixo");
	        	return true;
	        
	        	
	        }


	        // Desmarque a célula (opcional)
	        LabTxt[y][x] = ' ';
	    }

	    return false;
	}

	private boolean percorreLabirinto(int x, int y) {
	    // Verifique se estamos fora dos limites do labirinto
	    if (x < 0 || x >= colunas || y < 0 || y >= linhas) {
	    	System.out.println(x);
	    	System.out.println(y);
	    	System.out.println("Entrei no if");

	        return false;
	    }

	    char cell = LabTxt[y][x];

	    // Verifique se chegamos ao destino
	    if (cell == 'D') {
	        return true;
	    }

	    // Verifique se podemos mover para a próxima posição (espaço em branco)
	    if (cell == ' ') { 
	        // Marque esta célula como visitada (opcional)
	        LabTxt[y][x] = '*';
	        System.out.println("Giovani"+ y + x);
	        if(x == 0 && y == 0) {
	        	System.out.println("Primeira vez entrando aqui ");
	        	
	        }else {
	        	System.out.println("Segunda vez");
	        }
	        
	        
	        
	        

	        // Tente mover para todas as direções possíveis
//	        if (percorreLabirinto(x + 1, y) ||
//	            percorreLabirinto(x - 1, y) ||
//	            percorreLabirinto(x, y + 1) ||
//	            percorreLabirinto(x, y - 1)) {
//	            return true;
//	        }
//	        if (percorreLabirinto(x + 1, y) ||
//		            percorreLabirinto(x, y + 1)||
//		            percorreLabirinto(x, y - 1)) {
//	        	System.out.println("GORDISCO");
//		            return true;
//		        }
	        if(verificaPassagem(x + 1, y)) {
	        	System.out.println("Vou para a direita");
	        	return true;
	        
	        	
	        }
	        if(verificaPassagem(x , y + 1)) {
	        	System.out.println("Vou para a baixo");
	        	return true;
	        
	        	
	        }


	        // Desmarque a célula (opcional)
	        LabTxt[y][x] = ' ';
	    }

	    return false;
	}
    private static final char CAMINHO = '*'; // Símbolo para representar o caminho correto


    public void imprimeLabirintoResolvido() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                char cell = LabTxt[i][j];
                
                if (cell == CAMINHO) {
                    // Imprima uma seta na direção correta com base nas células adjacentes
                    char seta = determinarSeta(j, i);
                    System.out.print(seta);
                } else {
                    System.out.print(cell);
                }
            }
            System.out.println(); // Pule uma linha após cada linha da matriz
        }
    }

    private char determinarSeta(int x, int y) {
        // Verifique as células adjacentes para determinar a direção da seta
        if (x > 0 && LabTxt[y][x - 1] == CAMINHO) {
            return '>'; // Esquerda
        } else if (x < colunas - 1 && LabTxt[y][x + 1] == CAMINHO) {
            return '<'; // Direita
        } else if (y > 0 && LabTxt[y - 1][x] == CAMINHO) {
            return 'I'; // Cima
        } else if (y < linhas - 1 && LabTxt[y + 1][x] == CAMINHO) {
            return 'I'; // Baixo
        } else {
            return CAMINHO;
        }
    }
    

	public void imprimeLabirinto() {
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				char posicao = LabTxt[i][j];
				if (posicao == 'X') {
					System.out.print('X');
				} 
				else if (posicao == 'D') {
					System.out.print('D');
				} 				
				else {
					System.out.print(' ');
				}
			}
			System.out.println(); // Pule para a próxima linha
		}
	}
}
