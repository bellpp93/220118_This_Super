package super��������;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();

		//��ü���� ���� => �޼ҵ� ȣ��
		sa.takeOff();  //�θ� �޼ҵ� => �̷��մϴ�.
		sa.fly();	//�ڽ� �޼ҵ� => �������̵� if ���� => else => �Ϲ� �����մϴ�.
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		sa.fly();  //�ڽ� �޼ҵ� => �������̵� if �� => ������ �����մϴ�.
		sa.flymode = SupersonicAirplane.NORMAL;
		sa.fly();  //�ڽ� �޼ҵ� => �������̵� if ���� => else => �Ϲ� �����մϴ�.
		sa.land();  //�θ� �޼ҵ� => �����մϴ�.
		
		//[�ùķ��̼� ������]
		/*
		�̷��մϴ�.
		�Ϲ� �����մϴ�.
		������ �����մϴ�.
		�Ϲ� �����մϴ�.
		�����մϴ�.
		*/
	}
}
