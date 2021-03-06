/**
 * @author v-nj-wang.fan
 *
 *
 *for语句嵌套：其实就是语句中还有语句，循环中还有循环
 *
 *循环嵌套
 *
 *练习：
 *1、
 *	————————————
 *		****
 *		****
 *		****
 *  ————————————
 * 2、
 *  ————————————
 *  	****
 *  	***
 *  	**
 *  	*
 *  ————————————
 * 3、
 *  ————————————
 *  	*
 *  	**
 *  	***
 *  	****
 *  ————————————
 * 4、
 *  ————————————
 *  	1
 *  	12
 * 		123
 * 		1234
 *  ————————————  
 *
 *5、乘法口诀表
 *
 *6、等腰三角形
 *       *
 *		* *
 *	   * * *
 *    * * * *
 *   * * * * *
 *	
 */
public class ForTest03 
{
	public static void main(String[] args)
	{
		//练习1
		System.out.println("-------练习1-------");
		for(int x=0;x<3;x++)//外循环控制行数
		{
			for(int y=0;y<4;y++)//内循环控制每一行的列数，
			{
				System.out.print("*");//print后面没有跟“ln”,即打印“*”不会换行，而是直接在其右边继续打印
			}
			System.out.println();// 此行只有一个功能就是换行
			/*
			 * 
			 * 以上的打印结果：
			 * 		****
			 * 		****
			 * 		****
			 * 原理：此语句是打印长方形，外循环控制行数，内循环控制每一行的列数，也就是一行中元素的个数
			 * 
			 * 
			 * 
			 */
		}
		System.out.println("-------练习2-------");
		/*
		 * 练习2:
		 *  ————————————
		 *  	****
		 *  	***
		 *  	**
		 *  	*
		 *  ————————————
		 * 思路：
		 * 1、根据练习1中，外循环控制行数，内循环控制列数即每行中的元素的个数
		 * 2、根据题意，共4行，所以可以得出外循环的区间是 [0 4) -->0、1、2、3
		 * 3、内循环列数是随着行数的变化而变化，即每一行的区间都是在变化的，如下：
		 * 		第一行[0 4):4个元素
		 *		第二行[1 4):3个元素
		 * 		第三行[2 4):2个元素
		 * 		第四行[3 4):1个元素
		 * 以上可以看出，内循环区间的左边的数值（即初始值一直在变化不确定，所以此时可以使用一个变量来表示初始值）
		 */
		//练习2的第一种方法
		System.out.println("---方法1---");
		int z=0;//定义一个变量表示内循环中初始值
		for(int x=0;x<4;x++)
		{
			for(int y=z;y<4;y++)
			{
				System.out.print("*");
			}
			z++;
			System.out.println();
		}
		/*
		 * 练习2的第2种方法
		 * 根据方法一中的变量z的增加，和外循环x的递增是一致的，所以内循环中可以将x的初始值赋给y；
		 * 方法2中可以进行如下的优化
		 * 
		 */
		System.out.println("---方法2---");
	
		for(int x=0;x<4;x++)
		{
			for(int y=x;y<4;y++)
			{
				System.out.print("*");
			}
		    System.out.println();
		}
		
		System.out.println("-------练习3-------");
		/*
		 * 练习3:
		 *  ————————————
		 *  	*
		 *  	**
		 *  	***
		 *  	****
		 *  ————————————
		 * 思路：
		 * 1、根据练习1中，外循环控制行数，内循环控制列数即每行中的元素的个数
		 * 2、根据题意，共4行，所以可以得出外循环的区间是 [0 4) -->0、1、2、3
		 * 3、内循环列数是随着行数的变化而变化，即每一行的区间都是在变化的，如下：
		 * 		第一行[0 0]:1个元素
		 *		第二行[0 1]:2个元素
		 * 		第三行[0 2]:3个元素
		 * 		第四行[0 3]:4个元素
		 * 以上可以看出，内循环区间的右边的数值（即条件一直在变化不确定，所以此时可以使用一个变量来表示条件）
		 *
		 *
		 *不是规律的规律
		 *1、尖朝上，内循环可以改变条件，让条件随着外循环变化而变化
		 *2、尖朝下，内循环可以改变初始化值，让初始化值随着外循环变化而变化
		 *
		 *
		 *
		 *
		 */
		
		
		for(int x=0;x<4;x++)
		{
			for(int y=0;y<=x;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------练习4-------");
		/*
		 * 练习4:
		 *  ————————————
		 *  	1
		 *  	12
		 *  	123
		 *  	1234
		 *  ————————————
		 * 思路：
		 * 1、根据练习1中，外循环控制行数，内循环控制列数即每行中的元素的个数
		 * 2、根据题意，共4行，且每一行的开始值为1，所以可以得出外循环的区间是 [1 5) -->1、2、3、4
		 * 3、内循环列数是随着行数的变化而变化，即每一行的区间都是在变化的，且每一行的开始都是1，所以初始值设为1，如下：
		 * 		第一行[1 1]:1个元素
		 *		第二行[1 2]:2个元素
		 * 		第三行[1 3]:3个元素
		 * 		第四行[1 4]:4个元素
		 * 以上可以看出，内循环区间的右边的数值（即条件一直在变化不确定，所以此时可以使用一个变量来表示条件）
		 */
		for(int x=1;x<5;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y);
				
			}
			System.out.println();
		}
		System.out.println("-------练习5-------");
		/*
		 * 练习5:
		 *  ————————————
		 *  	1*1=1
		 *  	1*2=2 2*2=4
		 *  	1*3=3 2*3=6  3*3=9
		 *  	1*4=4 2*4=8  3*4=12 4*4=16
		 *  	1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
		 *  	1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
		 *  	1*7=7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49
		 *  	1*8=8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
		 *  	1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
		 *  ————————————
		 * 思路：
		 * 1、根据练习1中，外循环控制行数，内循环控制列数即每行中的元素的个数
		 * 2、根据题意，共9行，且每一行的开始值为1，所以可以得出外循环的区间是 [1 10) -->1、2、3、4、5、6、7、8、9
		 * 3、内循环列数是随着行数的变化而变化，即每一行的区间都是在变化的，且每一行的开始都是1，所以初始值设为1，如下：
		 * 		第一行[1 1]:1个元素
		 *		第二行[1 2]:2个元素
		 * 		第三行[1 3]:3个元素
		 * 		第四行[1 4]:4个元素
		 * 		第五行[1 5]:5个元素
		 * 		第六行[1 6]:6个元素
		 * 		第七行[1 7]:7个元素
		 * 		第八行[1 8]:8个元素
		 * 		第九行[1 9]:9个元素
		 * 
		 * 
		 * 以上可以看出，内循环区间的右边的数值（即条件一直在变化不确定，所以此时可以使用一个变量来表示条件）
		 */	
			
		for(int x=1;x<10;x++)
		{
			for(int y=1;y<=x;y++)
			{
				/*if(y*x>9)
				{
					System.out.print(y+"*"+x+"="+(y*x)+" ");
				}
				else
				{
					System.out.print(y+"*"+x+"="+(y*x)+"  ");
				}
				*/
				
				//以上的if语句主要指为了打印整齐用的，同样可以用制表符\t来打印结果
				System.out.print(y+"*"+x+"="+(y*x)+"\t");
			}
			System.out.println();
		}
		System.out.println("-------练习6-------");
		/*
		 * 练习6:
		 *  ————————————
		 *  -----*      
		 *  ----* *
		 *	---* * *
		 *  --* * * *
		 *  -* * * * *	
		 *  ————————————
		 * 思路：
		 * 1、根据练习1中，外循环控制行数，内循环控制列数即每行中的元素的个数
		 * 2、根据题意，共5行，从图形中可以看出等腰三角形的左边都是“空格”，为了方面看出，这些使用“-”更形象
		 * ，此时可以看出此图形是由2个图形组成，所有需要2个内循环的语句
		 * 3、内循环一（“-”），属于尖朝下：内循环可以改变初始化值，让初始化值随着外循环变化而变化
		 * 		第一行[0 5]:5个元素
		 *		第二行[1 5]:4个元素
		 * 		第三行[2 5]:3个元素
		 * 		第四行[3 5]:2个元素
		 * 		第五行[4 5]:1个元素
		 * 以上可以看出，内循环区间的左边的数值（即初始值一直在变化不确定，所以此时可以使用一个变量来表示初始值）
		 * 
		 * 内循环二（“*”），属于尖朝上：内循环可以改变条件，让条件随着外循环变化而变化
		 * 		第一行[0 0]:1个元素
		 *		第二行[0 1]:2个元素
		 * 		第三行[0 2]:3个元素
		 * 		第四行[0 3]:4个元素
		 * 		第五行[0 4]:5个元素
		 * 
		 * 以上可以看出，内循环区间的右边的数值（即条件一直在变化不确定，所以此时可以使用一个变量来表示条件）
		 * 
		 */	
		for(int x=0;x<5;x++)
		{
			for(int y=x;y<5;y++)
			{
				System.out.print(" ");
			}
			
			for(int m=0;m<=x;m++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------练习7-------");
		System.out.println("*** ");
		for(int x =0;x<4;x++)
		{
			for(int y=0;y<1;y++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("*** ");
	
		
		
	}
}
