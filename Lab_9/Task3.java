class Task3{
static void longestUniqueSubstring(String str){
String result="";
for(int i=0; i<str.length(); i++){
char c=str.charAt(i);
if(result.indexOf(c)==-1){
result+=c;
}
}
System.out.println(result);
}

public static void main(String[] args){
longestUniqueSubstring("abcdabcbb");
}
}
