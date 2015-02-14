/**
 * 
 */

/**
 * @author v-nj-wang.fan
 *
 *
 *其他的流程控制语句，break；continue
 *1、break（跳出）：应用范围,选择结构（switch）、循环结构，定义在循环结构内，用于跳出循环
 *2、continue（继续）：只用于循环结构，结束本次循环，继续下一次循环；
 *
 *注意：
 *1、这两个语句，离开应用范围，存在是没有意义的；
 *2、这两个语句单独存在时，在其下面都不可以有语句，因为执行不到
 *3、continue语句是结束本次循环继续下次循环
 *4、标号的出现，可以让这两个语句作用于指定的范围
 *
 *
 *
 */
public class BreakContinueTest 
{
	public static void main(String[] args)
	{
		//break
		for(int x=1; x<10;x++)
		{
			
			/*
			 * 1、
			 * System.out.println("x="+x);
			 * break; 写此处跳出循环，输入结果“x=0”
			 * 2、
			 * break单独存在，写此处后下面的语句就没有意义，因为执行不到
			 * System.out.println("x="+x);
			 * 
			 */
			
			if(x==4)
			{
				break;
			}
			System.out.println("x="+x);
		  }
		w:for (int x= 1;x<10;x++) // w、N用于标记循环
		{
			for (int y =1;y<10;y++)
			{
				System.out.println("x="+x);
				System.out.println("y="+y);
				break w;//指定break跳出的是哪一个循环
			}
		}
		  
		  System.out.println("*****************");
		  //continue
		  
		  for(int x=1;x<=10;x++)
		  {
			  if(x%2==1)
				  continue;
			  System.out.println("x="+x);
		  }
		  
		  System.out.println("*****************");
		 H: for (int x=1;x<=10;x++)
		  {
			  for(int y=1;y<=10;y++)
			  {
				  System.out.println("x="+x);
				  if(y%2==1)
					  continue;
				  System.out.println("y="+y);
				  continue H;
			  }
		  }
	}
}
