package super��������;
//�ڽ� Ŭ����
public class SupersonicAirplane extends Airplane {
	//��� ����(2��) => ���� ����ϴ� ���������� ����� ��������ν� '������'�� �����ش�. (������ �ʴ� ��. ���� �Ǿ��ִ� ��.)
	public static final int NORMAL = 1;		//�Ϲ� ���� /*�̶� NORMAL�� 1�� �������̴� ��� ��.
	public static final int SUPERSONIC = 2;	//������ ����
	
	//��� ���� ����(1��)
	public int flymode = NORMAL;
	
	//�޼ҵ�(1��)
	@Override	//�޼ҵ� �������̵� => �������� �����ϱ� ���� ����
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		}else {
			super.fly();  //�θ� Ŭ������ fly(); �޼ҵ带 ȣ���ϰڴ� ��� �ǹ�.
		}
	}
}
