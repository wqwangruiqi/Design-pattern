package org.wq.Singleton;

public class TestSingleton_Hungry  {
	public static void main(String[] args) {
	
		/*Singleton_Hungry singleton_Hungry =Singleton_Hungry.getSlacker(); 
		Singleton_Hungry singleton_Hungry2=Singleton_Hungry.getSlacker(); 
		System.out.println(singleton_Hungry==singleton_Hungry2);//true 说明我们单例模式没问题
		 System.exit(0);		*/
		
		//注释掉上面部分 我们再运行下面的代码
			Thread t1=new Thread(new Runnable() {
				public void run() {
					Singleton_Hungry singleton_Hungry=Singleton_Hungry.getSlacker(); 
					System.out.println(singleton_Hungry.hashCode());
				}
			});
			Thread t2=new Thread(new Runnable() {
				public void run() {
					Singleton_Hungry singleton_Hungry=Singleton_Hungry.getSlacker(); 
					System.out.println(singleton_Hungry.hashCode());
				}
			});
			t1.start();
			t2.start();
		//  打印的hashCode字符串始终一致  
		
	}
}
