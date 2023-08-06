 import java.util.Scanner;
class checkPrime{
public static void main(String args[]){
int num,rem,i=0;
Boolean prime=true;
Scanner sc=new Scanner(System.in); 
System.out.print("Enter a number: ");
num=sc.nextInt(); 
sc.close();
for(i=2;i<num/2;i++)
{
rem=num%i;
if (rem==0)
{
prime=false;
break;
}
}
if(prime)
System.out.println("The given number is prime");
else
System.out.println("The given number is not prime");                                                                                                             
}
}