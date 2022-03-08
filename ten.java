//PRIME NUMBERS WITHIN GIVEN RANGE
import java.io.*;
import java.util.*;

public class ten
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

System.out.println("Enter initial and final number");
System.out.print("initial number :");
int initialnumber=s.nextInt();
System.out.print("final number :");
int finalnumber=s.nextInt();

System.out.println("prime numbers");

for(int i=initialnumber;i<=finalnumber;i++)
{
 int b=0;
 for(int j=2;j<=i/2;j++)
 {
   if(i%j==0)
   { 
    b++;
   }
 }
if(b==0&&i!=1)
{
 System.out.println(i);
}
} 
}
}

/*INPUT - initial number=1
          final number=50

 OUTPUT - prime numbers
          2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 */
