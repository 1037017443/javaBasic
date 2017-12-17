package basic;

public class Child extends Person {
	public static void main(String[] args) {
		Person p = new Child();
		Person p2 = new Person();
		System.out.println(p.age);
		//System.out.println(p.name);//子类无权访问父类的私有属性
		//System.out.println(p2.name);//私有属性，在类的外部是不能直接访问的
	}
}
