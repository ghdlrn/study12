package java_20240201;
/*
 *제품명 : 임의
 *기능 전원 on, off
 *사운드 올린다, 내린다
 *메소드: 4개
 *최대한 간단하게 구성
 */
public class Speaker {
	
	private boolean button;
	private int volume;
	
	public Speaker(boolean button, int volume) {
		this.button = button;
		this.volume = volume;
	}
	
	public void switchOn() {
		button = true;
		System.out.println("전원을 켭니다");
		System.out.println(button);
	}
	public void switchOff() {
		button = false;
		System.out.println("전원을 끕니다");
		System.out.println(button);
	}
	public void soundUp() {
		volume++;
		System.out.println("볼륨 : " + volume);
	}
	public void soundDown() {
		volume--;
		System.out.println("볼륨 : " + volume);
	}
}
