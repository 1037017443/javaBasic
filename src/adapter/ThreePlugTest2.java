package adapter;

/**
 * �̳еķ�ʽ
 * @author lei
 *
 */
public class ThreePlugTest2 extends TwoPlug implements ThreePlug {

	@Override
	public void threeMethod() {
		twoMethod();
	}
	
	public static void main(String[] args) {
		ThreePlug test2 = new ThreePlugTest2();
		test2.threeMethod();
	}
}
