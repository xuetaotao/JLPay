/**
 *		抽象类
 * 		作者：薛涛涛
 *		日期：2018年5月18日10:40:35
 */
 
 //凡是含有抽象方法的类都必须声明为抽象类
 abstract class A{
 	
 	//凡是没有方法体的方法必须得使用关键字abstract修饰为抽象方法
 	public abstract void f();
 	
 	//如果该方法也被定义，那么子类必须声明为抽象类  /   子类将该方法也重写
 	//public abstract void g();
 }
 
 class B extends A{
 	
 	//如果不重写父类继承过来的方法，那么子类必须声明为抽象类
 	public void f(){
 		
 		System.out.println("BBBB");
 	}
 }
 
 public class AbstractTest{
 	
 	public static void main(String[ ] args){
 		
 		B bb = new B();
 		//A aa = new A();		//A是抽象的，无法实例化
 		bb.f();
 		
 		//抽象类也可以实现多态
 		//A aa = new B();		//等价于 A aa;    aa = bb;  两个语句   
 	
 		//可以定义一个抽象类的对象，但是不可以new一个抽象类的对象
 		A aa;
 		aa = bb;
 		aa.f();
 	}
 }