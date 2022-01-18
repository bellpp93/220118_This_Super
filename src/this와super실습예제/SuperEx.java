package this와super실습예제;

//부모 클래스
class Man {
	//멤버변수
	String name;  //이름
	
	//디폴트 생성자
	public Man() {}  //default constructor는 매개변수도 없고 실행문도 없음.
	
	//생성자
	public Man(String name) {
		this.name = name;
	}
	
	//필요한 메소드 구현
	public void tellyourName() {
		System.out.println("My name is " + name);
	}
}

//자식 클래스
class BusinessMan extends Man {  //extends => 확장하다
	//멤버변수
	String company;  //회사명
	String position;  //직급
	
	//생성자
	public BusinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}
	
	//필요한 메소드 구현
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
	}
}

public class SuperEx {

	public static void main(String[] args) {
		BusinessMan man1 = new BusinessMan("오수철", "삼성전자", "부장");
		BusinessMan man2 = new BusinessMan("박태호", "LG전자", "과장");
		
		System.out.println("First man info => ");
		man1.tellyourName();
		man1.tellYourInfo();
		
		System.out.println();  //줄바꿈
		
		System.out.println("Second man info => ");
		man2.tellyourName();
		man2.tellYourInfo();
	}
}
