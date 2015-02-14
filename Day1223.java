/**
 * 
 */

/**
 * @author v-nj-wang.fan
 *
 *代码中实现十进制数转换为十六进制
 *
 *
 */
public class Day1223 
{
	public static void main (String[] args)
	{
		//打印60的二进制
		System.out.println("60的二进制="+Integer.toBinaryString(60));
		int num = 60;
		//获取60的最低4位，通过&15
		int n1 = num & 15;
		System.out.println((char)(n1-10+'A'));
		//获取60二进制数的下一组4位有效位1，即将60右移4位。
		int temp = 60 >>> 4;
		// 对temp值进行最低4位的获取,即temp&15.
		int n2 = temp & 15;
		System.out.println(n2);
		/*
		 * 0-9 'A' 'B' 'C' 'D' 'E' 'F' 
		 * 		65  66  67  68  69  70 --> ASCII 值
		 *		10  11  12  13  14  15 --> 数值
		 */
	
		System.out.println("60的十六进制="+n2+(char)(n1-10+'A'));
	}
}
