package org.wq.Singleton;

public class TestSingleton_Slacker  {
	public static void main(String[] args) {
	
		/*Singleton_Slacker singleton_Slacker=Singleton_Slacker.getSlacker(); 
		Singleton_Slacker singleton_Slacker2=Singleton_Slacker.getSlacker(); 
		System.out.println(singleton_Slacker==singleton_Slacker2);//true 说明我们单例模式没问题
		 */		
		
		//注释掉上面部分 我们再运行下面的代码
			Thread t1=new Thread(new Runnable() {
				public void run() {
					Singleton_Slacker singleton_Slacker=Singleton_Slacker.getSlacker(); 
					System.out.println(singleton_Slacker.hashCode());
				}
			});
			Thread t2=new Thread(new Runnable() {
				public void run() {
					Singleton_Slacker singleton_Slacker=Singleton_Slacker.getSlacker(); 
					System.out.println(singleton_Slacker.hashCode());
				}
			});
			t1.start();
			t2.start();
		// 多次运行 你会发现 打印的hashCode字符串会不一致  为什么会不一致了？
		
	}
}
