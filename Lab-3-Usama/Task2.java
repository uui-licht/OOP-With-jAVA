class Task2{
public static void main(String [] args){
	
String str = "level";
String rev = "";

System.out.println(str);
	for(int i=str.length()-1; i>=0; i-- ){
	rev=rev+str.charAt(i);
	
	}
	if(str.equals(rev)){
	System.out.println("It's palindrome");
	}
	else{
	System.out.println("It's not palindrome");
	}

}
	}