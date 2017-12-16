package singleton;

/**
 * �ڵ��÷���ʱ��������
 * @author lei
 *
 */
public class EHanShi {
	//˽�й�����
	private EHanShi(){
		System.out.println("�����ǳ�ʼ����");
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
