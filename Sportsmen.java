package Game;
public class Sportsmen 
{
int age;
int height;
int Name;
public void setAge(int a)
{ age=a;}
public void getAge(int a)
{ age=a;}
public void setName(int n)
{ Name=n;}
public void getName(int n)
{ Name=n;}
public void setHeight(int h)
{ height=h;}
public void getHeight(int h)
{ height=h;}
public String fitness(int h, int a)
{
height = h;
age = a; 
String str;
if (height>=182 && (age >20 || age<40)) 
{//System.out.println("Player is FIT");
str="player is fit";
}
else //System.out.println("Player is NOT FIT");
str="player is NOT fit";
return str;
}
}




