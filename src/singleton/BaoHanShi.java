package singleton;

public class BaoHanShi {
	private BaoHanShi(){
		System.out.println("饱汉式对象创建了");
	}
	private final static BaoHanShi instance = new BaoHanShi();
	public static BaoHanShi getInstance(){
		return instance;
	}
}
