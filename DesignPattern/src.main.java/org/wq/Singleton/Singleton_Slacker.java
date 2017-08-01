package org.wq.Singleton;

/**
 * 
 * @author wangqiang 联系邮箱:417297506@qq.com 2017年8月1日 上午11:26:19 类的说明:单例模式-懒汉式
 *         通过测试 我们发现 懒汉式是线程不安全的所以我们需要用同步 
 *         优点是延时加载 在第一次使用实例的时候的才初始化
 * 
 */
public class Singleton_Slacker {

	/**
	 * 为什么构造方法被私有化呢？ 避免类在外部直接被实例化 既然不能被实例化 那怎么获取实例对象呢？
	 */
	private Singleton_Slacker() {

	}

	/**
	 * 为什么是private修饰？为什么是static？ 为什么设置为null？ private修饰 避免对象在外部直接 类型.属性 方式获取
	 * 设置为null 其实就是防止类在加载假的时候就被实例化 而是在需要有实例的时候才实例化
	 */
	private static Singleton_Slacker slacker = null;

	/**
	 * 
	 * @author wangqiang 联系邮箱:417297506@qq.com 2017年8月1日 上午11:34:06 方法的说明:
	 *         public方法 供外界调用该方法获取对象实例 TODO
	 * @return
	 * synchronized 会是效率降低 但是如果使用如下方式 可以提高效率
	 */
	public static Singleton_Slacker getSlacker() {
		if (slacker == null) {
			synchronized (Singleton_Slacker.class) {
				if (slacker == null) {
					slacker = new Singleton_Slacker();
				}
			}
		}
		return slacker;
	}

}
