package issue6;

public class Move {

	private String descricao;
	
	public Move(String modelo) {
		super();
		this.descricao = modelo;
	}

	public String getModelo() {
		return descricao;
	}

	@Override
	public String toString() {
		return  descricao;
	}
	
	
}
