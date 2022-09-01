class Color
{
	Color()
	{
		System.out.println("It's a Default Constructor");
	}
	Color(int a)
	{
		System.out.println("Rainbow has "+a+" Colors");
	}
	Color(String str)
	{
		System.out.println("I Love "+str+" Color");
	}
}
public class ConstructorExample
{
	public static void main(String[] args)
	{
		Color obj = new Color();
		Color obj1 = new Color(7);
		Color obj2 = new Color("Black");
	}
}