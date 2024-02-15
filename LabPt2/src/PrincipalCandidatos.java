import java.util.Random;
import java.util.Scanner;

public class PrincipalCandidatos {

	public static void main(String[] args)
	{
		
		Random randomicCreate = new Random();
		int index = randomicCreate.nextInt(100) + 1;
		Candidato[] candidato = new Candidato[index];

		for (int i = 0; i < index; i++)
		{
			String nome = randomicName();
			String partido = randomicParty();
			int intencoesVotos = randomicCreate.nextInt(36) + 1;
			candidato[i] = new Candidato(nome, partido, intencoesVotos);
		}

		ordenaCandidatosPorPartido(candidato);
		ordenaCandidatosPorVotos(candidato);
		ordenaCandidatosPorNome(candidato);
		imprimeCandidatos(candidato);
									
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o candidato que deseja procurar: ");
		String sc = scanner.nextLine();
		
		int positionInGroup = pesquisaBinariaCandidatos(candidato, sc);

		if (positionInGroup != -1)
		{
			System.out.println();
			System.out.print("Estas são as informações do candidato -> ");
			System.out.printf("%03d.", (positionInGroup + 1));
			System.out.println(candidato[positionInGroup]);
		} else
		{
			System.out.println("Não foi encontrado o candidato");
		}
	}
	
	private static void ordenaCandidatosPorNome(Candidato[] candidatos)
	{
		for (int i = 1; i < candidatos.length; i++)
		{
			Candidato candidato = candidatos[i];
			int j = i - 1;

			while (j >= 0 && candidatos[j].getNome().compareTo(candidato.getNome()) > 0)
			{
				candidatos[j + 1] = candidatos[j];
				j--;
			}
			candidatos[j + 1] = candidato;
		}
	}

	private static void ordenaCandidatosPorVotos(Candidato[] candidate)
	{
		for (int i = 1; i < candidate.length; i++)
		{
			Candidato candidato = candidate[i];
			int j = i - 1;

			while (j >= 0 && candidate[j].getIntencoesVotos() < candidato.getIntencoesVotos())
			{
				candidate[j + 1] = candidate[j];
				j--;
			}
			candidate[j + 1] = candidato;
		}
	}

	private static void ordenaCandidatosPorPartido(Candidato[] candidatos)
	{
		for (int i = 1; i < candidatos.length; i++)
		{
			Candidato candidato = candidatos[i];
			int j = i - 1;

			while (j >= 0 && candidatos[j].getPartido().compareTo(candidato.getPartido()) > 0)
			{
				candidatos[j + 1] = candidatos[j];
				j--;
			}

			candidatos[j + 1] = candidato;
		}
	}
	
	private static int pesquisaBinariaCandidatos(Candidato[] candidatos, String nome)
	{
		int inf = 0;
		int sup = candidatos.length - 1;
		int posicaoCandidato= -1;
		
		while (inf <= sup)
		{
			int med = (inf + sup) / 2;
			int nomesIguais = candidatos[med].getNome().compareToIgnoreCase(nome);

			if (nomesIguais == 0)
			{
				posicaoCandidato = med;
				sup = med - 1;
			} else if (nomesIguais > 0)
			{
				sup = med - 1;
			} else {
				inf = med + 1;
			}
		}		
		return posicaoCandidato;
	}
	
	private static void imprimeCandidatos(Candidato[] candys)
	{
		System.out.println("Sua lista de Candidatos é:");
		System.out.println(":: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ");
		for (int i = 0; i < candys.length; i++)
		{
			System.out.printf(":: %d. %s%n", (i + 1), candys[i]);
		}
		System.out.println(":: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ");
		System.out.println();
	}

	private static String randomicName()
	{
		String[] candidateName = {"Abel",
				"Alice",
				"Beatriz",
				"Carla",
				"David",
				"Eleonor",
				"Francisco",
				"Giordana",
				"Heitor",
				"Italo",
				"Josue",
				"Kurt",
				"Lucas",
				"Marco",
				"Natanael",
				"Otelo",
				"Paulo",
				"Quemuel",
				"Rafael",
				"Samuel",
				"Tay",
				"Uriel",
				"Vlad",
				"Xavier",
				"Zinedine"

		};
		Random randomic = new Random();
		return candidateName[randomic.nextInt(candidateName.length)];
	}

	private static String randomicParty()
	{
		String[] party = {"Democratas",
				"Colarado",
				"Nacional", "" +
				"Rebublicanos",
				"Blanco",
				"Teste",
				"Partido"};
		Random randomic = new Random();
		return party[randomic.nextInt(party.length)];
	}
}