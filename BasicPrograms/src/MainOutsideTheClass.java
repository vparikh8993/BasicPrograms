class Student {
    int id=4;
    String name="vishwa";
}

class MainOutsideTheClass{
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.id);
        System.out.println(s.name);
    }
}