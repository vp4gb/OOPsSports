package Game;

public class start {
	public static void main(String []args)
	{
		Sportsmen s1 = new Sportsmen();
		Cricket C1 = new Cricket();
	    String str1;
	    double result;
	    str1=s1.fitness(176,33);
	    System.out.println(str1);
	    str1=C1.fitness(169,30);
	    System.out.println(str1);
        result=C1.Avg(89,7);
        System.out.println("BatsmenAverage" +result);
	    result=C1.Avg(100);
	    System.out.println("BowlerAverage" +result);
	}
}
