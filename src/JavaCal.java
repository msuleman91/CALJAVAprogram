
public class JavaCal {
	
	public int sum(int a, int b)
	{
		
		return a+b;
	}
	public int sub(int a, int b)
	{
		
		return a-b;
	}
	
	public int mul(int a, int b)
	{
		
		return a*b;
	}

	public static void main(String[] args) {
		JavaCal cal=new JavaCal();
		
		System.out.println(cal.sum(10, 10));
		System.out.println(cal.sub(10, 8));
		System.out.println(cal.mul(10, 8));

	}

}
