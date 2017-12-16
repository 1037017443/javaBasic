package singleton;

public class BaoHanShi {
	private BaoHanShi(){
		System.out.println("����ʽ���󴴽���");
	}
	private final static BaoHanShi instance = new BaoHanShi();
	public static BaoHanShi getInstance(){
		return instance;
	}
}
