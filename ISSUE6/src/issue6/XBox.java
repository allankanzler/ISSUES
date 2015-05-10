package issue6;

public class XBox extends VideoGame{
	
	private String modelo;
	private Kinect kinect;
	
	public XBox(String processador, String hD, Midia midia, String modelo, Kinect kinect) {
		super(processador, hD, midia);
		this.setModelo(modelo);
		this.kinect = kinect;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Kinect getKnect() {
		return kinect;
	}

	public void setKnect(Kinect knect) {
		this.kinect = knect;
	}

	@Override
	public String toString() {
		return "XBox [modelo=" + modelo + ", kinect=" + kinect
				+ ", processador=" + processador + ", hD=" + hD + ", midia="
				+ midia + "]";
	}
	
	
	

}
