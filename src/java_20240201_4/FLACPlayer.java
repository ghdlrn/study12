package java_20240201_4;

public class FLACPlayer implements MediaPlayer {

	private String fileName;
	private double runTime;
	private double fileSize;
	public static int state;  // -1(정지), 0(일시정지), 1(실행)

	
	@Override
	public void play() {
		state = 1;
		System.out.println("FLAC 파일 재생 중...");
	}
	
	@Override
	public void pause() {
		state = 0;
		System.out.println("FLAC 파일이 일시정지 되었습니다.");
	}
	
	@Override
	public void stop() {
		state = -1;
		System.out.println("FLAC 파일이 정지되었습니다.");
		
	}
	
	@Override
	public void loadFile(String file) {
		System.out.println(file + "이 저장됨..");
		System.out.println("loading...");
	}
}
