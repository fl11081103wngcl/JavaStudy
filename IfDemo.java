/**
 * 
 */

/**
 * @author v-nj-wang.fan
 *
 *
 *判断结果语句---->if语句
 *
 *一、if语句的三种格式：
 *a、if（条件表达式）
 *	{
 *		执行语句；
 *	}
 *
 *b、if（条件表达式）
 *	{
 *		执行语句；
 *	}
 *	else
 *	{
 *		执行语句；
 *	}
 *
 *c、if（条件表达式）
 *	{
 *		执行语句；	
 *	}
 *	else if（条件表达式）
 *	{
 *		执行语句；
 *	}
 *  else if（条件表达式）
 *	{
 *		执行语句；
 *	}
 *	……
 *  else
 *	{
 *		执行语句；
 *	}
 *
 *二、if语句的特点：
 *a、每一种格式都是单条语句
 *b、if语句的第二种格式与三元运算符的区别：
 *三元运算符运算完要有值出现，好处是可以写在其他的表达式中
 *c、条件表达式无论写成什么样子，只看最终的结果是否是true或者false
 *
 *
 */
public class IfDemo {
	
	public static void main(String[] args)
	{
		int x =3;
		//if 只能一层版本；
		if (x>1)
		{
			System.out.println("Yes");
		}
		
		int y=3;
		//if……else 是2层判断
		if(y>2)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		/*
		 * if else 结构 简写格式：变量 = （条件表达式）？表达式1：表达式2；
		 * 
		 * 三元运算符：
		 * 好处：可以简化if else 代码
		 * 弊端：因为是一个运算符，所有运算完必须要一个结果；
		 * 
		 */
		int a=9,b;
		b= (a>10)?100:200;
		System.out.println("b="+b);
		
		int m=3,n;
		if(m>9)
		{
			n = 100;
			System.out.println("n="+n);
			
		}
		else
		{
			n=200;
			System.out.println("n="+n);
		
		}
		
		//比较以下2个语句的输出,
		/*if……else if……else 只执行符合的语句，一旦执行符合，
		 * 就会跳出判断，不会继续执行下面同样符合的语句；
		*/
		int p=3;
		if(p>1)
			System.out.println("a");
		else if (p>2)
			System.out.println("b");
		else if(p>3)
			System.out.println("c");
		else
			System.out.println("d");
		
		int q=3;
		if(q>1)
			System.out.println("a");
		if(q>2)
			System.out.println("b");
		if(q>3)
			System.out.println("c");
		else
			System.out.println("d");
		
		System.out.println("Over");
	
		
		
		
	}

}
