public class StudentClassObjectCreation {

    int id=45;
    String name="vishwa";

    public static void main(String[] args) {
        //creating object of class
        StudentClassObjectCreation s=new StudentClassObjectCreation();
        System.out.println("Hello this is my first program to learn java");
        //calling instance variable defined in the class by oject created inside the method
        System.out.println(s.id);
        System.out.println(s.name);
    }
}
