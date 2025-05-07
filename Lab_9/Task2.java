class Task2{
public static void main(String[] args){
String text="aeiouuoiea";
String reverse="";
System.out.print(text);
for(int i=text.length()-1; i>=0; i--)
{
reverse=reverse+text.charAt(i);
}
if(text.equals(reverse))
{
System.out.print(" is palindrome");
}
else
{
System.out.print(" is not palindrome");
}
}
}