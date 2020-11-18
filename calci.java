import java.util.*;
class Ab
{
int c,m,n,i;
public void display()
{
Scanner s=new Scanner(System.in);
try
{
System.out.println("\t\t\tWELCOME TO CALCULATOR ");
System.out.println("PRESS 1 FOR ADDITION ");
System.out.println("PRESS 2 FOR SUBSTRACTION ");
System.out.println("PRESS 3 FOR MULTIPLICATION");
System.out.println("PRESS 4 FOR DIVISION ");
System.out.println("Enter your choice ");
i=s.nextInt();
System.out.println("Enter the First number ");
m=s.nextInt();
System.out.println("Enter the Second number");
n=s.nextInt();
}
catch(Exception e)
{
	System.out.println(e);
	Ab z =new Ab();
	z.display();
}
if(i==1)
{
	 c=m+n;
}
if(i==2)
{
	c=m-n;
}
if(i==3)
{
	c=m*n;
}
if(i==4)
{
try{
	c=m%n;
}
catch(Exception e){}
}
System.out.println("The Result is "+c);
	System.out.println("PRESS 9 TO START CALCULATOR AGAIN ");
	try{
	int z=s.nextInt();
	if(z==9)
	{
		Ab l=new Ab();
		l.display();
	}
else
{
	System.out.println("INVALID INPUT");
}
}

catch(Exception e)
{
	System.out.println("INVALID INPUT ");
}
}
}
class Calci
{
public static void main(String[] arr)
{
	
	Ab a=new Ab();
	a.display();	
}
}