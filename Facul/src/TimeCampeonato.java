
public class TimeCampeonato {
	String nomeTime;
	int saldoGol;

	public TimeCampeonato(String nomeTime, int saldoGol) {
		super();
		this.nomeTime = nomeTime;
		this.saldoGol = saldoGol;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public int getSaldoGol() {
		return saldoGol;
	}

	public void setSaldoGol(int saldoGol) {
		this.saldoGol = saldoGol;
	}

	public String toString() {
		return "TimeCampeonato [nome=" + nomeTime + ", saldoGols=" + saldoGol	+ "]";
	}

}
