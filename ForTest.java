/**
 * @author v-nj-wang.fan
 *
 *
 *For语句：
 *for（初始化表达式；循环条件表达式；循环后的操作表达式）
 *	{
 *		执行语句；
 *	}
 *
 *一、for语句的执行顺序：
 *1、首先执行 for循环中的初始化表达式，此表达式在for循环中只执行1次；
 *2、然后执行循环条件表达式，如果条件表达式满足；
 *3、如果条件表达式满足，进行执行语句的操作
 *4、执行语句完成后，执行循环后的操作表达式，然后回到第2步 -> 满足 -> 第三步
 *5、知道循环不满足跳出循环体
 *
 *二、但是无限循环的最简单表现形式有以下2种：
 *1、for（； ；）{}
 *2、while（true）{}
 */
public class ForTest 
{
	public static void main(String[] args)
	{
		/*
		 * 
		 * 3、For语句
		 * for（初始化表达式；循环条件表达式；循环后的操作表达式）
		 * 	{
		 * 		执行语句；
		 * 	}
		 * 
		 */
		for(int x=0;x<3;x++)
			{
				System.out.println("x="+x);
			}
		
		//System.out.println("======"+x+"=======")；此语句是不能执行的，因为输入的变量“x”只在for循环中有效
		// 跳出for循环变量x，就会在内存中消失
		
		int y=0;
		while(y<3)
			{
				System.out.println("y="+y);
				y++;
				
			}
		System.out.println("======"+y+"======");
		/*
		 * for语句和while语句的区别？小知识点：
		 * 1、for 与 while的语句是可以互换的，如果需要定义循环增量，用for语句更合适
		 * 2、变量有自己的作用域，对for来讲，如果将变量用于控制循环的增量定义在for语句中，那么该变量只在for语句中
		 * 有效，for语句执行完，该变量在内存中被释放
		 * 
		 */
		
		//for 语句的其他写法
		
		int m=1;
		/*
		 * 
		 *for (System.out.println("a");System.out.println("b");System.out.println("c"))
		 * 以上写法for语句中并不存在“条件语句”，即不是boolean类型的所以无法进行判断循环；
		 * 但是无限循环的最简单表现形式有以下2种：
		 * 1、for（； ；）{}
		 * 2、while（true）{}
		 * 
		 * 
		 */
		
		for(System.out.println("m="+m+"=a");m<=3;System.out.println("m="+m+"=c"))
		{
			System.out.println("m="+m+"=b");
			m++;
		}
		
		//以上的语句同时可以写成下面的形式
		int n=1;
		for(System.out.println("n="+n+"=a");n<=3;System.out.println("n="+n+"=c"),n++)
		{
			System.out.println("n="+n+"=b");
			
		}
	}
}
