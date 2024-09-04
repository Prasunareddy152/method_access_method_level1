class Cat 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Cat c1=new Cat();
		c1.eat();
		System.out.println("Main ends");
	}
	public void eat()
	{
		System.out.println("eating");
		go();
	}
	public static void go()
	{
		System.out.println("Going");
	}
}
