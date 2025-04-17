package apr14;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection_Student_Details {

	public static void main(String[] args) {
		
		
		Map <String,String> StudentDetailsR1 = new LinkedHashMap<String,String>();
		
		StudentDetailsR1.put("Name" , "John Doe");
		StudentDetailsR1.put("Age" , "20");
		StudentDetailsR1.put("Gender" , "Male");
		StudentDetailsR1.put("Roll Number" , "S12345");
		StudentDetailsR1.put("Grade" , "A");
		StudentDetailsR1.put("Major" , "Computer Science");
		StudentDetailsR1.put("GPA" , "3.8");
		StudentDetailsR1.put("Email" , "john@example.com");
		StudentDetailsR1.put("Contact Number" , "9876543210");
		StudentDetailsR1.put("Address" , "123 Elm St");
		
		System.out.println(StudentDetailsR1);
		
		Map<String,String> StudentDetailsR2 = new LinkedHashMap<String,String>();
		StudentDetailsR2.put("Name" , "Jane Smith");
		StudentDetailsR2.put("Age" , "21");
		StudentDetailsR2.put("Gender" , "Female");
		StudentDetailsR2.put("Roll Number" , "S12346");
		StudentDetailsR2.put("Grade" , "B");
		StudentDetailsR2.put("Major" , "Mathematics");
		StudentDetailsR2.put("GPA" , "3.5");
		StudentDetailsR2.put("Email" , "jane@example.com");
		StudentDetailsR2.put("Contact Number" , "9876543211");
		StudentDetailsR2.put("Address" , "456 Oak St");
		System.out.println(StudentDetailsR2);
		 
		
		List <Map<String,String>> ListNew = new LinkedList <Map<String,String>>();
		
		ListNew.add(StudentDetailsR1);
		ListNew.add(StudentDetailsR2);
		
		System.out.println(ListNew);
		
		
		
		System.out.println(ListNew.getFirst()); //First row only
		System.out.println(ListNew.get(0)); //It also denotes 1st row, by using index 0
		System.out.println(ListNew.get(0).get("Gender"));
		System.out.println(ListNew.get(1).get("Major"));
		
		
	}

}
