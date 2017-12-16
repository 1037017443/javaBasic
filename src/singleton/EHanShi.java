package singleton;

/**
 * 在调用方法时创建对象
 * @author lei
 *
 */
public class EHanShi {
	//私有构造器
	private EHanShi(){
		System.out.println("饿汉是初始化了");
	}
	private static EHanShi instance = null;
	
	public static EHanShi getInstance(){
		if(instance == null){
			synchronized (EHanShi.class) {
				if(instance == null){
					instance = new EHanShi();
				}
				return instance;
			}
		}
		return instance;
	}
}
