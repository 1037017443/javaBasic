package singleton;

/**
 * 你只要弄明白单例模式是如何实现的，就能从本质上理解这个问题；
	单例模式实现过程如下：
	首先，将该类的构造函数私有化（目的是禁止其他程序创建该类的对象）；
	其次，在本类中自定义一个对象（既然禁止其他程序创建该类的对象，就要自己创建一个供程序使用，否则类就没法用，更不是单例）；
	最后，提供一个可访问类自定义对象的类成员方法（对外提供该对象的访问方式）。
	直白的讲就是，你不能用该类在其他地方创建对象，而是通过该类自身提供的方法访问类中的那个自定义对象。
	那么问题的关键来了，程序调用类中方法只有两种方式，①创建类的一个对象，用该对象去调用类中方法；②使用类名直接调用类中方法，格式“类名.方法名()”；
	上面说了，构造函数私有化后第一种情况就不能用，只能使用第二种方法。
	而使用类名直接调用类中方法，类中方法必须是静态的，而静态方法不能访问非静态成员变量，因此类自定义的实例变量也必须是静态的。
	这就是单例模式唯一实例必须设置为静态的原因。
 * 单利模式的对象是在调用到时才第一次创建
 * @author lei
 *
 */
public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("开始了");
		//EHanShi instance = EHanShi.getInstance();
		//BaoHanShi instance2 = BaoHanShi.getInstance();
		//EHanShi eHanShi = new EHanShi();//构造器已经私有化了，不能用new了
		System.out.println("结束了");
		Object object = new Object();
		object.notify();
		object.notifyAll();
		object.wait();
		object.wait(1000);
		object.wait(1000, 2);
		Thread.sleep(1000);
		Thread.sleep(1000, 2);
	}
}
