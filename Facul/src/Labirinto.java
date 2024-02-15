import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto {

	private char[][] mazeTxt;
	private int totalLinhas;
	private int totalColunas;



	public void setLabirinto(char[][] mazeTxt){
		this.mazeTxt = mazeTxt;
	}

	public void criaLabirinto(String filename) throws IOException{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(filename));

			String line = reader.readLine();
			totalColunas = line.length();

			while (line != null) {
				totalLinhas++;
				line = reader.readLine();
			}
			

			char[][] arquivo = new char[totalLinhas][totalColunas];

			line = reader.readLine();
			for (int i = 0; i < arquivo.length && (line != null); i++)
			{
				arquivo[i] = line.toCharArray();
				line = reader.readLine();
			}
			
			setLabirinto(arquivo);

			reader.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public boolean freePath(int linha, int coluna)
	{
		if (linha >= 0 && linha < totalLinhas && coluna >= 0 && coluna < totalColunas)
		{
			return mazeTxt[linha][coluna] == ' ' || mazeTxt[linha][coluna] == 'D';
		}
		return false;
	}

	public boolean percorreLabirinto() throws IllegalArgumentException
	{
		if (mazeTxt == null)
		{
			throw new IllegalArgumentException();
		}
		return percorreLabirinto(0, 0);
	}

	private boolean percorreLabirinto(int row, int column)
	{
		if (freePath(row, column))
		{
			if (this.mazeTxt[row][column] == 'D')
			{
				mazeTxt[row][column] = 'O';
				return true;
			}

			mazeTxt[row][column] = '-';

			boolean freePath = percorreLabirinto(row + 1, column);
			
			if (!freePath)
			{
				freePath = percorreLabirinto(row - 1, column);
			}
			if (!freePath)
			{
				freePath = percorreLabirinto(row, column + 1);
			}
			if (!freePath) {
				freePath = percorreLabirinto(row, column - 1);
			}
		}
		return false;
	}

}