package OOP;

public class Student extends User {
    String matric_no = "bhu/22/04/10/0018";
    String admission_no = "2364801739";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register your courses at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result.";
        } else {
            return "You got 8Bs, 2Cs and 2Ds";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Josiah Zebulun";
        student.password = "Josiah1";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
