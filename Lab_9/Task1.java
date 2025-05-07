class Task1{
static void reverseString(String str){
String reverse ="";
for(int i=str.length()-1; i>=0; i--){
reverse+=str.charAt(i);
}
System.out.print(reverse);
 }

public static void main(String[] args){
reverseString("SHAHZAIB");
}
}
