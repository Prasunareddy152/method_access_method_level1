class Runner 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Runner r1=new Runner();
		r1.jog();
		System.out.println("Main Ends");
	}
	public void jog()
	{
		System.out.println("Jogging starts");
		sprint();
		System.out.println("Jogging ends");
	}
	public void sprint()
	{
		System.out.println("Sprinting starts");
		System.out.println("Sprinting ends");
	}
}
