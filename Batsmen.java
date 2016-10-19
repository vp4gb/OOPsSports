package inheritance;

class Batsmen extends Player 
{
 double Average;
 
   // public void play(int x,int inn){
   // 	Average = 879/7; 
   // 	System.out.println("Average is :" +Average);
   // }
	
 //Function to caclulate batsman average
 public double CalAvg(int run,int inn)
 
 
 { 
	 System.out.println("i m in batsman set run");
	 Average=run/inn;
	 return Average;
	 //System.out.println("Average="+Average);

 }
}

