package basic;

public class Child extends Person {
	public static void main(String[] args) {
		Person p = new Child();
		Person p2 = new Person();
		System.out.println(p.age);
		//System.out.println(p.name);//������Ȩ���ʸ����˽������
		//System.out.println(p2.name);//˽�����ԣ�������ⲿ�ǲ���ֱ�ӷ��ʵ�
	}
}
