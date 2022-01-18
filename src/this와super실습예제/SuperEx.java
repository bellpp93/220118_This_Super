package this��super�ǽ�����;

//�θ� Ŭ����
class Man {
	//�������
	String name;  //�̸�
	
	//����Ʈ ������
	public Man() {}  //default constructor�� �Ű������� ���� ���๮�� ����.
	
	//������
	public Man(String name) {
		this.name = name;
	}
	
	//�ʿ��� �޼ҵ� ����
	public void tellyourName() {
		System.out.println("My name is " + name);
	}
}

//�ڽ� Ŭ����
class BusinessMan extends Man {  //extends => Ȯ���ϴ�
	//�������
	String company;  //ȸ���
	String position;  //����
	
	//������
	public BusinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}
	
	//�ʿ��� �޼ҵ� ����
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
	}
}

public class SuperEx {

	public static void main(String[] args) {
		BusinessMan man1 = new BusinessMan("����ö", "�Ｚ����", "����");
		BusinessMan man2 = new BusinessMan("����ȣ", "LG����", "����");
		
		System.out.println("First man info => ");
		man1.tellyourName();
		man1.tellYourInfo();
		
		System.out.println();  //�ٹٲ�
		
		System.out.println("Second man info => ");
		man2.tellyourName();
		man2.tellYourInfo();
	}
}
