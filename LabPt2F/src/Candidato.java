
import java.util.Random;
import java.util.Scanner;
public class Candidato {

	private String nome;
	private String partido;
	private int intencoesVotos;

	public Candidato(String nome, String partido, int intencoesVotos) {
		this.nome = nome;
		this.partido = partido;
		this.intencoesVotos = intencoesVotos;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setPartido(String partido)
	{
		this.partido = partido;
	}

	public void setIntencoesVotos(int intencoesVotos)
	{
		this.intencoesVotos = intencoesVotos;
	}

	public String getNome()
	{
		return nome;
	}

	public String getPartido()
	{
		return partido;
	}

	public int getIntencoesVotos()
	{
		return intencoesVotos;
	}

	@Override
	public String toString() {
		return " Nome: " +	nome + " | Partido: " + partido + " | Intencao de Voto na Pesquisa: " + intencoesVotos + "\n";
	}
}
