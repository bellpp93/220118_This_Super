package super변수예제;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();

		//객체에게 동작 => 메소드 호출
		sa.takeOff();  //부모 메소드 => 이륙합니다.
		sa.fly();	//자식 메소드 => 오버라이딩 if 거짓 => else => 일반 비행합니다.
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		sa.fly();  //자식 메소드 => 오버라이딩 if 참 => 초음속 비행합니다.
		sa.flymode = SupersonicAirplane.NORMAL;
		sa.fly();  //자식 메소드 => 오버라이딩 if 거짓 => else => 일반 비행합니다.
		sa.land();  //부모 메소드 => 착륙합니다.
		
		//[시뮬레이션 실행결과]
		/*
		이륙합니다.
		일반 비행합니다.
		초음속 비행합니다.
		일반 비행합니다.
		착륙합니다.
		*/
	}
}
