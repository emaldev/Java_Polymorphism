package Java_teacher_inner_Class;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }
     
    public void displayInfo(){
        System.out.println("Name: " + name + ", Subject: " + subject);
    }
      
    class ClassRoom{
        private String className;

        public ClassRoom(String className){
            this.className = className;
        }

        public void showClass(){
            System.out.println("Class: " + className);
        }

        public void showTeacherInfo(){
            System.out.println("Teacher Name: " + name + ",Subject: " + subject + ",Class Name: " + className);
        }
    }
}
