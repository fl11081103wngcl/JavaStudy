abstract class Employee
{
	private String name;
	private String id;
	private double pay;
	Employee(String name,String id,double pay)
	{
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}
	public void setPay(double pay)
	{
		this.pay=pay;
	}
	public double getPay()
	{
		return pay;
	}
	public abstract void work();
}

class Manger extends Employee
{
	private int bonus;
	Manger(String name,String id,double pay,int bonus)
	{
		super(name,id,pay);
		this.bonus=bonus;
	}
	

	public void setBonus(int bonus)
	{
		this.bonus = bonus;
	}
	
	public void work()
	{
		System.out.println("Name: "+getName());
		System.out.println("Id: "+getId());
		System.out.println("Pay: "+getPay());
		System.out.println("Bonus: "+bonus);
		System.out.println("Position: Manger");
	}
}

class  Pro extends Employee
{
	Pro(String name,String id,double pay)
	{
		super(name,id,pay);
	}

	public void work()
	{
		System.out.println("Name: "+getName());
		System.out.println("Id: "+getId());
		System.out.println("Pay: "+getPay());
		System.out.println("Position: staff");
	}
}

class Run
{
	public static void main(String[] args)
	{
		Manger m = new Manger("null","null",0,0);
		Pro p = new Pro("null","null",0);
		m.setName("sil");
		m.setId("n001");
		m.setPay(20000);
		m.setBonus(200);
		m.work();
		p.setName("sihan");
		p.setId("n002");
		p.setPay(200000);
		p.work();
	}

}