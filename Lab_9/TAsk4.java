class Task4{
static void countVowelsAndConsonants(String str){
int vowels=0;
int consonants=0;
for(int i=0; i<str.length(); i++) {
char c=str.charAt(i);
if(c>='a' && c<='z'){
vowels++;
}
else
{
consonants++;
}
}
System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
}
}

public static void main(String[] args){
countVowelsAndConsonants("latitude");
}

