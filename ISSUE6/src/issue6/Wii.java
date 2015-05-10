package issue6;

public class Wii extends VideoGame {

	public Wii(String processador, String hD, Midia midia) {
		super(processador, hD, midia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Wii [processador=" + processador + ", hD=" + hD + ", midia="
				+ midia + "]";
	}
	

}
