package Java_teacher_inner_Class;

public class Main {
    public static void main(String[] args){
        Person mypersonClass = new Person("Emal-Hasanzada");
        Teacher myTeacherClass = new Teacher("Emal-Hasanzada", "Java-Programming.");
        Teacher.ClassRoom myClassRoom = myTeacherClass.new ClassRoom("12The ");
        mypersonClass.displayName();
        myTeacherClass.displayInfo();
        myClassRoom.showClass();
        myClassRoom.showTeacherInfo();
    }
}
