class Student{
	
	public String name;
	public String branch;
	public String DOB;
	public String bloodGroup;
	public int mobileNumber;
	public String score;
	public String studentType;
	public String registrationNumber;
	public String collegeEmail;
	
	Student(String Info){
		String[] studentInfo = Info.split(" ");
		this.name = studentInfo[0];
		this.branch = studentInfo[1];
		this.DOB = studentInfo[2];
		this.bloodGroup = studentInfo[3];
		this.mobileNumber = Integer.parseInt(studentInfo[4]);
		this.score = studentInfo[5];
		this.studentType = studentInfo[6];
	}
	
	
	
	public static void main(String[] args){
		String[] studentInfo = args[0].split("_");
		int numberOfStudent = studentInfo.length;
		
		for(int student = 0; student < numberOfStudent; student++){
			Student newStudent = new Student(studentInfo[student]);
		
		}
	}
	
}
		
