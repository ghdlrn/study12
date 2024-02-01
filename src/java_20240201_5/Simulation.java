package java_20240201_5;

public class Simulation {

	public static void main(String[] args) {

		MediaPlayer m = new MP3Player();
		MediaPlayer w = new WAVPlayer();
		MediaPlayer f = new FLACPlayer();
		
		m.play();
		w.play();
		f.play();
	}

}
