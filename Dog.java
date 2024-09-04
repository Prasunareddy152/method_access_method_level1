class Dog 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		running();
		System.out.println("Main ends");
	}
	public static void running()
	{
		System.out.println("Running starts");
		Dog d1=new Dog();
		d1.sleeping();
		System.out.println("Running ends");
	}
	public void sleeping()
	{
		System.out.println("Sleeping starts");
		System.out.println("sleeping ends");
	}
}
