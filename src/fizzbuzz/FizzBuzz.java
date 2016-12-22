package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=1;i<100;i++)
		{
			System.out.println(fizzbuzz(i));
		}
	}
	public static String fizzbuzz(int i)
	{
		if(i%3 == 0 && i%5 == 0)
		{
			return "fizzbuzz";
		}else if(i%3 == 0)
		{
			return "fizz";
		}else if(i%5 == 0)
		{
			return "buzz";
		}
		return Integer.toString(i);
	}
}
