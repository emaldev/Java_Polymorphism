package Unuversity_InnerClass;

class UniversityClass{
    private String uniName;

    public  UniversityClass(String uniName){
        this.uniName = uniName;
    }
         public void desplayUnversityName(){
            System.out.println("University: " + uniName);
         }

        
class DepartementClass{
    private String deptName;

    public DepartementClass(String deptName){
        this.deptName = deptName;
    }
         public void displayDepartementName(){
            System.out.println("Departement: " + deptName);
         }

                  public void showInfo(){
                    System.out.println("University: " + uniName);
                    System.out.println("Depatement: " + deptName);
                  }
}

}
public class Main {
           public static void main(String[] args){
     UniversityClass myUn = new UniversityClass("Ahllamah Tabatabayee");

     UniversityClass.DepartementClass myDep = myUn.new DepartementClass("Computer Engineering");

     myDep.showInfo();

        }
    
}
