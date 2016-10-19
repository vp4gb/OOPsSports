package Game;
import java.util.Scanner;
public class Cricket extends Sportsmen {

	int run;
	int match;
	int wicket;
	Scanner user_input = new Scanner( System.in );
	public Cricket() {
		// TODO Auto-generated constructor stub
		}
	///Overriding
public String fitness(int h,int a)
{
	height = h;
	age = a;
	String str;
	if (height>167 && (age>18 || age<35))
		str = "Player is Fit for cricket";
	else
		str = "player is not fit";
  return str;
}

public double Avg(int r,int m)
{
	double z;
    System.out.println("I am inside batsman Average");
	run = r;
	match= m;
	z=run/match;
	return z;
}
//Function overloading
public double Avg(int w)
{
	double z;
	wicket= w;
	 System.out.println("I am inside bowler Average");
  	System.out.println("enter numb of run given by the  Bowler");
//System.out.println("enter numb of wickets taken by the  Bowler");
  	run = user_input.nextInt();
  	z=run/wicket;
  	return z;
}
	
}

