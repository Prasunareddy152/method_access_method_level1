class RecipeManager 
{
	public void addIngredient() 
	{
		System.out.println("Add Ingredient");
		removeIngredient();
		prepareRecipe();
	}
	public void removeIngredient()
	{
		System.out.println("Remove Indredient");
		calculateTotalCalories();
	}
	public void prepareRecipe()
	{
			System.out.println("Prepare Recipe");
			addIngredient();
	}
	public static void calculateTotalCalories()
	{
		System.out.println("Calculate Total Calories");
	}
	public static void printRecipe()
	{
		System.out.println("Print Recipe");
	}
	public static void main(String[] args)
	{
		RecipeManager r1=new RecipeManager();
		r1.prepareRecipe();
	}
}
