package testing;
public class CalculationApp {
	
	public static void main(String[] args) {
		
		System.out.println("this app does some dummy maths");
	}

	public int square(int x)
	{	//a dummy vulnerability
		int t;
		return x*x;
	}
	
	public int countA(String word)
	{
		int count =0;
		for(int i=0; i< word.length();i ++)
		{
			if(word.charAt(i)=='a'|| word.charAt(i)=='A')
			{
				count ++;
			}
		}
		return count;
	}
}
