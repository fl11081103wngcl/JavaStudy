/**
 * 
 */

/**
 * @author v-nj-wang.fan
 *20141225
 *需求：获取1-10的和，并打印；
 *
 *思路：
 *1、1+2+3+3+5+6+7+8+9+10 
 *以上的形式可以写成如下：
 *  0+1
 *  	1+2
 *  		3+3
 *  			6+4
 *  				10+5
 *  				……………………
 *  从以上的形式可以看出规律：
 *  1、左边的数都是上一个表达式的和，即一直在变化不确定的数；
 *  2、右边的数可以看出是从1、2、3、4、5不断递增的数；
 *  3、可以看出以上是加法的循环
 *  
 * 步骤：
 * 1、对应不断变化的、且不确定的数我们需要定义一个变量来实现；int sum；
 * 2、对应一个不断递增数，我们需要定义一个变量，来表示倍加的数；int x；
 * 3、定义循环
 *
 *原理：
 *此思路其实就是累加思想，通过变量记录每次变化的结果，通过循环的形式，进行累加的动作；
 *
 *
 */
public class ForTest01 
{
	public static void main(String[]args)
	{
		//1、定义变量用于存储不断变化的和
		int sum =0;
		//2、定义变量用于记录不断变化的被加数；
		int x =1;
		//3、定义循环while语句
		while(x<=10)
		{
			sum=sum+x;
			x++;
			System.out.println("sum="+sum);
		}
		System.out.println("while sum="+sum);
		
		//使用For 语句实现如下
		for(int y=1;x<=10;x++)
		{
			sum+=y;
			
		}
		System.out.println("for sum="+sum);
		
		int p = 97;
		int q = 65;
		for (int m=1;m<=26;m++)
		{
			System.out.print((char)p);
		    p++;
		}
		System.out.println("\n");
		for (int m=1;m<=26;m++)
		{
			System.out.print((char)q);
		    q++;
		}
	}
}





