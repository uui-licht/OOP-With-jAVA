import java.util.Random;
class Main {
public static void main(String[] args){
int min=10;
int max=20;
int num;

while(true){
num=new Random().nextInt(max-min+1)+min;
if(num%2==0){
System.out.println(0);
break;
}
else
{
System.out.println(num);
break;
}
}
}
}
