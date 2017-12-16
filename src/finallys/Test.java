package finallys;

public class Test {
	public static int getValue(){
		int i = 0;
		try {
			i=1;
			return i;
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			i=2;
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.println(getValue());
	}
	
}
