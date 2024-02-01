package java_20240201_4;

public interface MediaPlayer {
	
	public void play();
	public void pause();
	public void stop();
	default void loadFile(String file) {
		System.out.println(file + "로딩중....");
	};
}
