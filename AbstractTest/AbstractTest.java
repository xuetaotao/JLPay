/**
 *		������
 * 		���ߣ�Ѧ����
 *		���ڣ�2018��5��18��10:40:35
 */
 
 //���Ǻ��г��󷽷����඼��������Ϊ������
 abstract class A{
 	
 	//����û�з�����ķ��������ʹ�ùؼ���abstract����Ϊ���󷽷�
 	public abstract void f();
 	
 	//����÷���Ҳ�����壬��ô�����������Ϊ������  /   ���ཫ�÷���Ҳ��д
 	//public abstract void g();
 }
 
 class B extends A{
 	
 	//�������д����̳й����ķ�������ô�����������Ϊ������
 	public void f(){
 		
 		System.out.println("BBBB");
 	}
 }
 
 public class AbstractTest{
 	
 	public static void main(String[ ] args){
 		
 		B bb = new B();
 		//A aa = new A();		//A�ǳ���ģ��޷�ʵ����
 		bb.f();
 		
 		//������Ҳ����ʵ�ֶ�̬
 		//A aa = new B();		//�ȼ��� A aa;    aa = bb;  �������   
 	
 		//���Զ���һ��������Ķ��󣬵��ǲ�����newһ��������Ķ���
 		A aa;
 		aa = bb;
 		aa.f();
 	}
 }