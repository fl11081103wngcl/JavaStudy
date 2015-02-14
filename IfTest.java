/**
 * 
 */

/**
 * @author v-nj-wang.fan
 *
 *需求1：根据用户输入的数值，打印对应的星期英文；
 *
 *需求2：根据用户输入的月份，打印该月份所属的季节
 *3、4、5 --> 春季
 *6、7、8 --> 夏季
 *9、10、11 --> 秋季
 *12、1、2 ---> 冬季 
 */
public class IfTest 
{
	public static void main(String[] args)
	{
		//需求1的代码如下：
		int num =2;
		if (num==1)
			System.out.println("Monday");
		else if(num==2)
			System.out.println("Tuesday");
		else if(num==3)
			System.out.println("Wednesday");
		else if(num==4)
			System.out.println("Thursday");
		else if(num==5)
			System.out.println("Friday");
		else if(num==6)
			System.out.println("Saturday");
		else if(num==7)
			System.out.println("Sunday");
		else
			System.out.println("您输入的不正确，请重新输入");
		
		//需求2实现代码，第一种方法,此处使用“||”双或逻辑运算符；
		int x = 3;
		if (x==3 || x==4 || x==5)
			System.out.println("您输入的"+x+"是一年中的春季");
		else if (x==6 || x==7 || x==8)
			System.out.println("您输入的"+x+"是一年中的夏季");
		else if (x==9 || x==10 || x==11)
			System.out.println("您输入的"+x+"是一年中的秋季");
		else if (x==12 || x==1 || x==2)
			System.out.println("您输入的"+x+"是一年中的冬季");
		
		else
			System.out.println("您输入的不正确，请重新输入");
		//需求2实现代码，第一种方法,此处使用“&&”双与逻辑运算符；
		int y =9;
		if(y>12 || y<1)
			System.out.println("您输入的不正确，请重新输入");
		else if(y>=3 && y<=5)
			System.out.println("您输入的"+y+"是一年中的春季");
		else if(y>=6 && y<= 8)
			System.out.println("您输入的"+y+"是一年中的夏季");
		else if(y>=9 && y<=11)
			System.out.println("您输入的"+y+"是一年中的秋季");
		else
			System.out.println("您输入的"+y+"是一年中的冬季");
	}
}
