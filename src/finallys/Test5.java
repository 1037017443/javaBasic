package finallys;

public class Test5 {
	private static int i = 0;
	public static int getValue(){
		try {
			i=1;
			return i;
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			i=2;
			System.out.println("finally÷¥––¡À");
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.println(getValue());
		System.out.println(i);
	}
	
}
