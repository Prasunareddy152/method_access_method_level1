class TemparatureConverter 
{
	public static void main(String[] args) 
	{
		convertToFahrenheit();
	}
	public static void convertToFahrenheit()
	{
		System.out.println("Convert to Fahremheit");
		TemparatureConverter t1=new TemparatureConverter();
		t1.setCelsiusTemparature();
		t1.displayResult();
	}
	public void setCelsiusTemparature()
	{
		System.out.println("Set Celsius temparature");
	}
	public void displayResult()
	{
		System.out.println("Display result");
	}
}
