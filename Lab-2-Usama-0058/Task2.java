import java.util.Scanner;
class Task2
{

public static void main(String[] args)
{
Scanner num=new Scanner(System.in);
int[] arr =  new int[10];
int sum=0;
for (int i=0;i<10;i++)
{
System.out.print("Plz Enter value of arr:");
arr[i]=num.nextInt();
if (arr[i]%4==0)
{
sum=sum+arr[i];
}


}
System.out.print("Total sum is:"+sum);




}
}