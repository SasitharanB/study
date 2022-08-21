	package Day1Assignment;
	
	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.time.LocalDate;
	import java.time.temporal.ChronoUnit;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	
	public class Day3Assignment {
	 public static void main(String[] args)  throws IOException {
	
	         String dob = "1998-12-31";
	
	         String currentDate = "2022-08-04";
	
	         LocalDate a = LocalDate.parse(dob);
	
	         LocalDate b = LocalDate.parse(currentDate);
	
	         long noOfDaysBetween = ChronoUnit.DAYS.between(a,b);
	
	         System.out.println(noOfDaysBetween);
	
	         File fi = new File("Difference.txt");
	
	         FileOutputStream fops = new FileOutputStream(fi);
	
	         DataOutputStream dops = new DataOutputStream(fops);
	
	         dops.writeUTF("Hello");
	
	         FileInputStream fips = new FileInputStream(fi);
	
	         DataInputStream dpis = new DataInputStream(fips);
	
	         String str = dpis.readUTF();
	
	         System.out.println(str);
					
					
					syso
		 		
	
	}
	}