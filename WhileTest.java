/**
 * 
 */

/**
 * @author v-nj-wang.fan
 *
 *循环语句的代表：while、do……while、for
 *
 *
 */
public class WhileTest 
{
	public static void main(String[] args)
	{
		/*
		 * 1、while语句
		 * int x=1；定义初始化表达式
		 *while（条件语句）
		 *{
		 *	循环体（执行语句）；
		 *}
		 *
		 */
	int x = 1;
	while(x<=10)
		{
		System.out.println("x="+x);
		x++;
		}
	int y = 1;
	while(y<=10)//如果while（y<=10）会面加“;” -> while(y<=10); 则此语句到此结束，
		       //后面大括号里面的则会作为独立的部分存在，但是在运行的时候，CPU会一直循环的判断y是否小于等于10，相当于死循环，程序一直的运行；
		{
		System.out.println("y="+y);
		y+=2;
		}
	/*
	 * 2、do……while
	 * int x=1；初始化表达式
	 * do
	 * {
	 * 	循环体（执行语句）；
	 * }
	 * while（条件语句）；
	 * 
	 * 语句结束2种提示，1、语句后面跟大括号；2、语句后面跟分号；
	 * 
	 */
	
	int a =1;
	do
		{
			System.out.println("do a="+a);
			a++;
		}
	while(a<=3);//满足条件
	
	int b = 1;
	do
		{
			System.out.println("do b="+b);
			b++;
		}
	while(b<0);//不满足条件
	/*
	 * while 语句和do……while语句的区别？
	 * 1、while：先判判断条件，只有条件满足才执行循环体；
	 * 2、do……while：先执行循环体，在判断条件，条件满足，在继续执行循环体；
	 * 总结：do……while语句无论条件是否满足，循环体至少被执行一次；
	 * 
	 * 
	 */
	
	
	
	
	}
}



