package issue6;

public class Kinect {
	
	private String Descricao;

	public Kinect(String descricao) {
		super();
		Descricao = descricao;
	}

	public String getDescricao() {
		return Descricao;
	}

	@Override
	public String toString() {
		return  Descricao;
	}


	
	

}
