package issue6;

public interface VideoGameFactory {
	
	VideoGame createVideoGame(String videoGameType, String processador,
			String hD, Midia midia, String modelo, Object adicional);

}
