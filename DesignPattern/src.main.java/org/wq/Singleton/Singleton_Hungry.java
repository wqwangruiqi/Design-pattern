package org.wq.Singleton;

/**
 * 
 * @author wangqiang
 *联系邮箱:417297506@qq.com
 * 2017年8月1日 上午11:26:19
 * 类的说明:单例模式-饿汉式
 *饿汉式 在类加载的时候创建实例
 *没有加锁，执行效率会提高。
 */
public class Singleton_Hungry {
	
	
	private Singleton_Hungry(){
		
	}
	
	private  static Singleton_Hungry slacker=new Singleton_Hungry();

	
	public static Singleton_Hungry getSlacker() {
		if(slacker==null){
			slacker=new Singleton_Hungry();
		}
		return slacker;
	}


	
}
