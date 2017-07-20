import java.io.*;
import java.util.*;
public class large
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int a1=sc.nextInt();
int a2=sc.nextInt();
if(a>a1&&a>a2)
{
System.out.print(a);
}
else if(a1>a2&&a1>a)
{
System.out.print(a1);
}
else if(a2>a1&&a2>a)
{
System.out.print(a2);
}
else
{
System.out.print("not found");
}
}
}

