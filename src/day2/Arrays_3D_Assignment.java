package day2;

public class Arrays_3D_Assignment {

	public static void main(String[] args) {
	
		
		
		
	

		

		        // 3D Array: Semesters → [Subjects, Status/Marks] → Values
		        String[][][] college = new String[5][2][6]; //5 = number of semesters

	//college[0] represents - Semester ( Total 5 semesters)
		        //college[0] + [0] - Semester + subject folder 
		        //college [0] + [1] -> Semester + Status with Marks Folder
		        
		        
		        
		        // Semester 1
		        college[0][0] = new String[] {"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."};
		        college[0][1] = new String[] {"Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)"};

		        // Semester 2
		        college[1][0] = new String[] {"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"};
		        college[1][1] = new String[] {"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)"};

		        // Semester 3
		        college[2][0] = new String[] {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."};
		        college[2][1] = new String[] {"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"};

		        // Semester 4
		        college[3][0] = new String[] {"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"};
		        college[3][1] = new String[] {"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)"};

		        // Semester 5
		        college[4][0] = new String[] {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"};
		        college[4][1] = new String[] {"Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)"};

		        // To pick particular subject
		        // college [0][0][0] means -> semester 1 + subject folder+ 1st subject name -->Maths
		        // college [0][1][0] means -> semester 1 + status with marks folder + 1st subject mark with status -Pass 78
		        
		        String sem1_subject1 =college [0][0][0];
		       String sem1_subject1Status=college [0][1][0];	
		       System.out.println("Semester 1 - Subject 1: " + sem1_subject1);
		        System.out.println("Semester 1 - Subject 1 Mark & status: " + sem1_subject1Status);   
		       
		        
		        String sem2_subject4 = college[1][0][3]; // Semester 2, Subject 4
		        String sem2_subject5 = college[1][0][4]; // Semester 2, Subject 5

		        String sem4_subject3_status = college[3][1][2]; // Semester 4, Subject 3 status
		        String sem4_subject6_status = college[3][1][5]; // Semester 4, Subject 6 status

		        // Output the results
		        System.out.println("Semester 2 - Subject 4: " + sem2_subject4);
		        System.out.println("Semester 2 - Subject 5: " + sem2_subject5);
		        System.out.println("Semester 4 - Subject 3 Status: " + sem4_subject3_status);
		        System.out.println("Semester 4 - Subject 6 Status: " + sem4_subject6_status);
		    }
		

	

	}


