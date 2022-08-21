public class Day2Assignment { 

public static void main(String[] args){ 

//to find & print duplicate characters in a string
	 and String Array in  a single program 

 

String str= "Sasitharan"; 

char[]inp=str.toCharArray(); 

System.out.println("Duplicate Characters are:"); 

for(int i=0; i<str.length(); i++) 

{ 
	int count =1; 

for(int j =i+1; j<str.length(); j++) 

{ 

if(inp[i]== inp[j]) 

{ 
inp[j]=' ';

count++; 
}	
}
System.out.println(inp[i]);
}
}}