package singleton;

/**
 * ��ֻҪŪ���׵���ģʽ�����ʵ�ֵģ����ܴӱ���������������⣻
	����ģʽʵ�ֹ������£�
	���ȣ�������Ĺ��캯��˽�л���Ŀ���ǽ�ֹ�������򴴽�����Ķ��󣩣�
	��Σ��ڱ������Զ���һ�����󣨼�Ȼ��ֹ�������򴴽�����Ķ��󣬾�Ҫ�Լ�����һ��������ʹ�ã��������û���ã������ǵ�������
	����ṩһ���ɷ������Զ����������Ա�����������ṩ�ö���ķ��ʷ�ʽ����
	ֱ�׵Ľ����ǣ��㲻���ø����������ط��������󣬶���ͨ�����������ṩ�ķ����������е��Ǹ��Զ������
	��ô����Ĺؼ����ˣ�����������з���ֻ�����ַ�ʽ���ٴ������һ�������øö���ȥ�������з�������ʹ������ֱ�ӵ������з�������ʽ������.������()����
	����˵�ˣ����캯��˽�л����һ������Ͳ����ã�ֻ��ʹ�õڶ��ַ�����
	��ʹ������ֱ�ӵ������з��������з��������Ǿ�̬�ģ�����̬�������ܷ��ʷǾ�̬��Ա������������Զ����ʵ������Ҳ�����Ǿ�̬�ġ�
	����ǵ���ģʽΨһʵ����������Ϊ��̬��ԭ��
 * ����ģʽ�Ķ������ڵ��õ�ʱ�ŵ�һ�δ���
 * @author lei
 *
 */
public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("��ʼ��");
		//EHanShi instance = EHanShi.getInstance();
		//BaoHanShi instance2 = BaoHanShi.getInstance();
		//EHanShi eHanShi = new EHanShi();//�������Ѿ�˽�л��ˣ�������new��
		System.out.println("������");
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