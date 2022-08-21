package Day1Assignment;

public interface COncat {
	public static void main(String[] args) {
        String s ="Java Programming";
        String s1=" Session";

        String s2= s.concat(s1);
        String  s3=s.toUpperCase();
        boolean s4=s.startsWith("ha");
        String s5=s.replace("Java", "Python");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);


       String[] sp = s.split(" ");

        for(String e: sp){
           System.out.println(e);
       }

        try {

           System.out.println("Maveric");

        } catch (Exception e) {

            System.out.println("Handled");
        }
        finally {
            System.out.println("Success");
        }
}
}