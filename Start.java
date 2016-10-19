package inheritance;

public class Start {
public static void main(String []args)
{
	double bwr;
	
	Batsmen s1=new Batsmen();
	Bowler s2=new Bowler();
	
	bwr=s2.Avg2(768, 7);
 System.out.println(bwr);
 System.out.println(s2.Avg2(668, 9)); 
 
	s1.setName("Sachin");
	s1.setAge(43);
//System.out.println("Run: "+s1.getRun());
//System.out.println("AGE: "+s1.getAge());
//System.out.println("Name: "+s1.getName());
   //*s1.CalAvg(1098, 7);
System.out.println("Average is"+s1.CalAvg(1098, 7));
}
}
