class ShoppingCart 
{
	public static void main(String[] args) 
	{
		ShoppingCart s1=new ShoppingCart();
		s1.checkout();
	}
	public void addItem()
	{
		System.out.println("Add Item");
		calculateTotal();
	}
	public void removeItem()
	{
		System.out.println("Remove Item");
		calculateTotal();
	}
	public void checkout()
	{
		System.out.println("Checkout");
		addItem();
		removeItem();
		generateInvoice();
	}
	public static void calculateTotal()
	{
		System.out.println("Calculate Total");
	}
	public static void generateInvoice()
	{
		System.out.println("Generate Invoice");
	}
	
}
