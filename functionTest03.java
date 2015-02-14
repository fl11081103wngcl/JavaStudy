/**
 * 
 */

/**
 * @author v-nj-wang.fan
 *
 *练习
 *1、定义一个功能，用于打印矩形；
 *
 *2、定义一个打印99乘法表功能的函数；
 *
 *
 */
public class functionTest03 
{

	public static void main(String[] args)
	{
		printRectangle(4,7);
		printMultiplicationTables();
	}
	/*
	 * 1、定义一个功能，用于打印矩形
	 * 思路：
	 * 1、明确功能结果，此功能无结果反馈，直接打印 --> 得出无返回值，即使用关键字void。return也可以省略不写；
	 * 2、明确参与运算过程中是否存在未知内容参与，有。-->矩形的行数和列数 整数（int row，int columns;）
	 * 
	 * 
	 * 
	 */
	public static void printRectangle(int row,int columns)
	{
		for (int x= 0;x<row;x++)
		{
			for (int y =0;y<columns;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	   System.out.println("-------打印结束-------");
	}
	/*
	 * 需求：定义一个打印99乘法表的函数功能
	 * 
	 * 思路：
	 * 1、明确功能结果，此功能无需结反馈，直接打印结果 --> 得出无返回值类型，即使用关键字void。return也可以省略不写；
	 * 2、明确此函数运算过程中是否存在未知内容参与运算，无 --> 得出参数列表是空的，可以不写
	 * 
	 * 
	 */
	public static void printMultiplicationTables()
	{
		for (int x=1;x<=9;x++)
		{
			for (int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+(y*x)+"\t");
			}
			System.out.println();
		}
	}
	
	
}
