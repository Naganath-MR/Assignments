package apr14;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Apr14_Assignment2 {

	public static void main(String[] args) {
		
		
		Map <String,String> Emp_Row1 = new LinkedHashMap < String,String>();
		
		Emp_Row1.put("Employee ID", "E001");
		Emp_Row1.put("Name", "Alice Green");
		Emp_Row1.put("Age", "30");
		Emp_Row1.put("Department", "Engineering");
		Emp_Row1.put("Position", "Software Engineer");
		Emp_Row1.put("Salary", "75,000");
		System.out.println(Emp_Row1);
		
Map <String,String> Emp_Row2 = new LinkedHashMap < String,String>();
		
		Emp_Row2.put("Employee ID", "E002");
		Emp_Row2.put("Name", "Bob Johnson");
		Emp_Row2.put("Age", "35");
		Emp_Row2.put("Department", "Marketing");
		Emp_Row2.put("Position", "Marketing Manager");
		Emp_Row2.put("Salary", "85,000");
		System.out.println(Emp_Row2);
		
Map <String,String> Emp_Row3 = new LinkedHashMap < String,String>();
		
Emp_Row3.put("Employee ID", "E003");
Emp_Row3.put("Name", "Carol White");
Emp_Row3.put("Age", "28");
Emp_Row3.put("Department", "Sales");
Emp_Row3.put("Position", "Sales Executive");
Emp_Row3.put("Salary", "65,000");
		System.out.println(Emp_Row3);
		
		List <Map<String,String>> Main = new LinkedList <Map<String,String>>();
		
		Main.add(Emp_Row1);
		Main.add(Emp_Row2);
		Main.add(Emp_Row3);
		
		System.out.println(Main + " ");
		
		System.out.println(Main.get(0));
		
		Map<String, String> retrieve = Main.get(0);
		System.out.println("Value of Position from Row 1:" +retrieve.get("Position"));
		
		
	}

}
