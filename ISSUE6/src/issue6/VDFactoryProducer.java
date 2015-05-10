package issue6;



public class VDFactoryProducer implements VideoGameFactory {
	
		@Override
	public VideoGame createVideoGame(String videoGameType, String processador,
			String hD, Midia midia, String modelo, Object adicional) {
		// TODO Auto-generated method stub
		if("playstation".equalsIgnoreCase(videoGameType))
			return new PlayStation(processador, hD, midia, modelo, (Move) adicional);
		
		if ("wii".equalsIgnoreCase(videoGameType))
			return new Wii(processador, hD, midia);
		
		if ("xbox".equalsIgnoreCase(videoGameType))
			return new XBox(processador, hD, midia, modelo, (Kinect) adicional);
		
		else
			return null;
	}

	
}
