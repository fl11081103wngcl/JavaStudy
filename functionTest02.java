/**
 * 
 */

/**
 * @author v-nj-wang.fan
 *
 *函数的基本应用
 *一、两个明确：
 *1、明确要定义的功能最后的结果是什么？ --> 确定返回值的类型
 *2、明确在定义该功能的过程中，是否需要未知内容的参与运算 --> 确定参数列表
 *
 *二、示例：
 *需求：定义一个功能，可以实现两个整数的加法运算
 *分析：
 *1、该功能的运算结果是什么？两个数的和，也是一个整数（int）
 *2、在实现该功能的过程中是否有未知内容参与运算？加数和被加数是不确定的（两个参数，int a，int b）
 *代码：
 *int getSum（int a, int b）
 *	{
 *		return a+b;
 *	}
 *
 *
 **/
public class functionTest02 
{
	//主函数
	//Java 中的最小的功能单位就是函数；
	//Java 中的主函数的功能就是调用函数
	public static void main(String[] args)
	{
		int a = getSum01();
		System.out.println(a);
		int b = getSum02(5,9);
		System.out.println(b);
		boolean c = compare(a,b);
		System.out.println(c);
		int d = getMax(a,b);
		System.out.println(d);
	}
	
	/*
	 *一、 如何定义一个函数？
	 *1、既然函数是一个独立的功能，那么该功能的运算结果是什么？先明确 --> 因为这是在函数的返回值类型。
	 *2、明确在定义该功能的过程中是否需要未知的内容参与运算 --> 因为是在明确函数的参数列表（参数的类型和参数的个数）
	 *  
	 */
	
	// 需求：定义一个功能，完成3+4的运算，并将结果返回给调用者；
	/*
	 * 1、明确功能的结果：是一个整数的和 --> 即返回值得类型是整数（int）
	 * 2、在实现该功能的过程中是否有未知的内容参与运算，没有。 -->明确函数的参数列表（参数的类型和参数的个数）
	 * 
	 */
	public static int getSum01()
	{
		return 3+4;
	}
	
	/*
	 * 
	 * 需求：
	 * 以上这个函数的功能，结果是固定的，毫无扩展性而言。
	 * 为了方便用户需求，由用户来指定加数和被加数,这样功能才有意义
	 * 思路：
	 * 1、功能结果是一个和，返回值得类型是int
	 * 2、有未知的内容参与运算，有2个，这两个未知的内容类型都是int
	 * 
	 * 
	 * 
	 */
	
	public static int getSum02(int x,int y)
	{
		return x+y;
	}
	
	/*
	 * 
	 * 需求：判断两个数是否相等
	 * 思路：
	 * 1、明确功能结果：结果是：boolean；
	 * 2、功能是否有未知的内容参与运算，有，两个整数
	 *
	 */
	public static boolean compare(int x,int y)
	{
		return x==y;
	}
	
	/*
	 * 需求：定义功能，对两个数进行比较，获取较大的数
	 * 思路：
	 * 1、明确功能结果获取较大的数即结果是：整数
	 * 2、功能是否有未知的内容参与运算，有，2个整数
	 * 
	 */
	public	static int getMax(int x,int y)
	{
		return (x>y)?x:y;
	}
	
	/*
	 * 这个功能定义的思想有问题，为什么？因为此功能只为完成加法运算，至于是否需要对和进行打印操作，
	 * 那是调用者的事，不要在该功能中完成
	 * 
	 * public static void getSum03(int a,int b)
	 * {
	 * 		System.out.println(a+b);
	 * 		return;
	 * }
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
}
