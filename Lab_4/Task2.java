class Task2{
public static void main(String[]args){
int num=0;
int[] array={1,1,2,3,3,4,5,5,6,7,7,8,9,9};
int[] array1= new int[array.length];
for(int i=0;i<array.length;i++)
{
	if(array[i]>num){
		num=array[i];


	}
else{
	num=0;
	
}
		array1[i]=num + array1[i];
	System.out.println(array1[i]);
	
}


}
}