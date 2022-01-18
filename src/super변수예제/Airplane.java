package super변수예제;
//부모 클래스
public class Airplane {  //클래스 설계할 때 멤버변수, 생성자, 메소드 등 구성요소가 있는 것이지 필수는 아니다.
	//메소드 구현
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}
