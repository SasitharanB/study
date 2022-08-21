package Day1Assignment;

public class Day1Assignment {
	//Instance variable
	Float f=25.7f;
	//Local variable
	void method1(){
		String name ="sasi";
	}
 public static void main(String[] args) {
     //Task-3:static Variable
	int a=10;
	int b=5;
	//Unary operator
	a=a++;
	System.out.println(a);
	System.out.println(++b);
	//Arithmetic OPerators
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
   //Logical OPerators
	boolean c=true;
    boolean  d=false;
        System.out.println(c&&d);
        System.out.println(c||d);
   //Ternary Operators
        String name = a>b?"great":"less";
        System.out.println(name);
        int[] number=new int[101];
        for (int i=1;i<100;i++){
            number[i] =i+1;
        System.out.println(number[i]);
            }
}
 }
 
