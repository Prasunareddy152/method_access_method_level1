class SocialMediaPost 
{
	public static void main(String[] args) 
	{
		SocialMediaPost s1=new SocialMediaPost();
		s1.createPost();
	}
	public void createPost()
	{
		System.out.println("Create Post");
		publishPost();
		generatePostID();
		
	}
	public void publishPost()
	{
		System.out.println("Publish Post");
	}
	public static void generatePostID()
	{
		System.out.println("genarate post ID");
	}
}
