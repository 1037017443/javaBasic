package finallys;

public class Test2 {
	public static int getValue(){
		int i = 0;
		try {
			i=1;
			return i;
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			i=2;
			System.out.println("finallyִ����");
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.println(getValue());
	}
	
}
