package issue6;

public class PlayStation extends VideoGame{
	
	private String modelo;
	private  Move move;
	
	public PlayStation(String processador, String hD, Midia midia,
			String modelo, Move adicional) {
		super(processador, hD, midia);
		this.modelo = modelo;
		this.move = adicional;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Move getMove() {
		return move;
	}

	public void setMove(Move move) {
		this.move = move;
	}

	@Override
	public String toString() {
		return "PlayStation [modelo=" + modelo + ", move=" + move
				+ ", processador=" + processador + ", hD=" + hD + ", midia="
				+ midia + "]";
	}
	
	
	
	
	
}
