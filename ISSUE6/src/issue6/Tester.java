package issue6;

public class Tester {
	public static void main(String[]args){
		
		VideoGameFactory fabrica = new VDFactoryProducer();
		VideoGame v1 =  fabrica.createVideoGame("playstation", "bom", "hd bem legal", Midia.cd, "2 slim",null);
		System.out.println(v1);
			
		Move move = new Move("modelo padrão");
		Kinect kn =new Kinect("preto com listras verdes");
		
		VideoGame v2 = fabrica.createVideoGame("xbox", "rápido", "grande", Midia.dvd, "360", kn);
		VideoGame v3 = fabrica.createVideoGame("wii", "meiaboca", "15gb", Midia.miniDisc, null, null);
		
		System.out.println(v2);
		System.out.println(v3);
		
		
		VideoGame v4 = fabrica.createVideoGame("playstation", "potente", "40gb", Midia.dvd, "prateado", move);
		System.out.println(v4);
	}

}
