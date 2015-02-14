/**
 * 
 */

/**
 * @author v-nj-wang.fan
 *
 *选择结果---->switch语句
 *
 *一switch语句格式：
 *switch（表达式）
 *	{
 *		case 取值1：
 *				执行语句；
 *				break；
 *		case 取值2：
 *				执行语句；
 *				break；
 *		……
 *		default：
 *				执行语句；
 *				break；
 *	}
 *
 *二、switch语句特点：
 *1、switch语句选择的类型只有4种：byte，short，int，char。
 *2、case之间与default没有顺序。先执行第一个case，没有匹配的case在执行default。
 *3、结束switch语句的两种情况：遇到break，执行到switch语句结束。
 *4、如果匹配的case或者default没有对应的break，那么程序会继续向下执行，但不判断case，
 *把能执行的case全都执行，直到遇到break或者switch结束结束
 *
 *
 *三、switch语句与if语句很相似，但是具体什么场景下使用那个语句？
 *1、如果判断的具体数值不多，而且符合byte，short，int，char这四种类型，
 *虽然switch语句和if语句都可以使用，但是我们建议使用switch语句，因为其效率稍高；
 *2、其他情况：对应区间判断，对于结果为boolean类型判断，使用if语句，if的使用范围更广；
 *
 *
 */
public class SwitchTest 
{
	public static void main(String[] args)
	{
		int x = 3;
		switch(x)//特点1：switch 语句选择的接受数据类型只有 byte、short、int、char 等4中类型，一般的都是int、char种；
		{
		
		/*
		 * 特点2：case之间与break是没有顺序的，位置可以任意放置；
		 *default:
		  System.out.println("d");
		  break;
		  以上default语句可以放在case前，但是此时后面就需要跟谁break；
		  
	    */
			case 2: 
				System.out.println("a");
				break;
			case 4: 
				System.out.println("b");
				break;
			case 3: 
				System.out.println("c");
				break;
			default:
				System.out.println("d");
				break;//此处的break可以不用写，因为下面就是switch的结束“}”，
						//所以程序会自动跳出switch语句
			}
		
		    int a =2,b=3;
		    char ch = '-';
		    switch(ch)
		    {
		    	case '+': 
		    		System.out.println("a+b="+(a+b));
		    		break;
		    	case '-': 
		    		System.out.println("a-b="+(a-b));
		    		break;
		    	case '*':
		    		System.out.println("a*b="+(a*b));
		    		break;
		    	case '/': 
		    		System.out.println("a/b="+(a/b));
		    		break;
		    	default:
		    		System.out.println("对不起您的输入错误，请重新输入");
		    	    break;
		    }
		    
		   
		    /*需求2：根据用户输入的月份，打印该月份所属的季节
		    *3、4、5 --> 春季
		    *6、7、8 --> 夏季
		    *9、10、11 --> 秋季
		    *12、1、2 ---> 冬季 
		    */
		    
		    int y = 7;
		    switch(y)
		    {
		    	case 3:
		    	case 4:
		    	case 5:
		    		System.out.println(y+"月是一年中的春天");
		    		break;
		    	case 6:
		    	case 7:
		    	case 8:
		    		System.out.println(y+"月是一年中的夏天");
		    		break;
		    	case 9:
		    	case 10:
		    	case 11:
		    		System.out.println(y+"月是一年中的秋天");
		    	case 12:
		    	case 1:
		    	case 2:
		    		System.out.println(y+"月是一年中的冬天");
		    	default:
		    		System.out.println("你输入的数据不正确，请重新输入");
		    }
		    
		    
		
		
	}
	

}
