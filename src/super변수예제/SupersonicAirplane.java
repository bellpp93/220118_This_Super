package super변수예제;
//자식 클래스
public class SupersonicAirplane extends Airplane {
	//상수 선언(2개) => 자주 사용하는 고정값들은 상수를 사용함으로써 '가독성'을 높여준다. (변하지 않는 것. 고정 되어있는 것.)
	public static final int NORMAL = 1;		//일반 비행 /*이때 NORMAL과 1은 같은것이다 라는 뜻.
	public static final int SUPERSONIC = 2;	//초음속 비행
	
	//멤버 변수 선언(1개)
	public int flymode = NORMAL;
	
	//메소드(1개)
	@Override	//메소드 오버라이딩 => 다형성을 구현하기 위한 개념
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();  //부모 클래스의 fly(); 메소드를 호출하겠다 라는 의미.
		}
	}
}
