package issue6;

public abstract class VideoGame {
	
	protected String processador;
	protected String hD;
	protected Midia midia;
	
	
	public VideoGame(String processador, String hD, Midia midia) {
		super();
		this.processador = processador;
		this.hD = hD;
		this.midia = midia;
	}


	public String getProcessador() {
		return processador;
	}


	public void setProcessador(String processador) {
		this.processador = processador;
	}


	public String gethD() {
		return hD;
	}


	public void sethD(String hD) {
		this.hD = hD;
	}


	public Midia getMidia() {
		return midia;
	}


	public void setMidia(Midia midia) {
		this.midia = midia;
	}
	
	

}
