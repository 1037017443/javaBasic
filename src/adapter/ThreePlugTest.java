package adapter;

/**
 * ��ϵķ�ʽ
 * @author lei
 *
 */
public class ThreePlugTest implements ThreePlug{
	private TwoPlug twoPlug;
	
	public ThreePlugTest(TwoPlug twoPlug){
		this.twoPlug = twoPlug;
	}
	
	@Override
	public void threeMethod() {
		twoPlug.twoMethod();
	}
	
	public static void main(String[] args) {
		TwoPlug twoPlug2 = new TwoPlug();
		ThreePlug test = new ThreePlugTest(twoPlug2);
		test.threeMethod();
	}
}
