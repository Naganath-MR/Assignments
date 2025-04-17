package apr16;

public class Arrays_Operators_Assignment {

	public static void main(String[] args) {
		
		/*Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
marks [75, 80, 82] Add 10 marks to each students using assignment operators and
store it into another array, after adding 10 marks identify the average marks of all
students

Expected Output:
Updated Marks:
Suresh: 85
Mahesh: 90
Naresh: 92
Average Marks: 89.0
		
		 */
		//First array to store student names
		String[] Students= {"Suresh", "Mahesh", "Naresh"};
		
		//Second array to store student marks
		int[] marks = {75,80,82};
		
		//Create third new array, add "10" marks to each students using "+" operator
		
		int [] Array3 = new int[3];
		
		Array3[0] = marks[0]+ 10;
		Array3[1] = marks[1]+ 10;
		Array3[2]= marks[2] +10;
		
		int UpdatedMarks = Array3[0] + Array3[1]+ Array3[2];
		
		
		System.out.println("Updated Marks:==");
		
		System.out.println(Students[0] + ":" +Array3[0]);
		System.out.println(Students[1] + ":" +Array3[1]);
		System.out.println(Students[2] + ":" +Array3[2]);
		
		double average = UpdatedMarks/3;
		System.out.println("Average Marks: "+average);

	}

}
