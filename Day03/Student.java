class Student{
    String studentId,studentName,grade;

    Student(){
        this("s-0", "Unknown", "D");
    }

    Student(String studentId, String studentName, String grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        //call default constructor
        Student student1 = new Student();
        System.out.println("Student Id = "+student1.studentId);
        System.out.println("Student Name = "+student1.studentName);
        System.out.println("Grade = "+student1.grade);



        //call  parameterise constructor
        Student student2 = new Student("S-100","Shashikant kumar","A");
        System.out.println("Student Id = "+student2.studentId);
        System.out.println("Student Name = "+student2.studentName);
        System.out.println("Grade = "+student2.grade);

    }
}