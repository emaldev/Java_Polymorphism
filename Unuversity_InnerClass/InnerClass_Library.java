package Unuversity_InnerClass;

class LibraryClass{
     private String libName;

        public LibraryClass(String libName){
            this.libName = libName;
        }

    class BookClass{
        private String title;

           public BookClass(String title){
            this.title = title;
           }
        
        public void displayBook(){
            System.out.println("Book: " + title);

        }
        public void displayLibraryName(){
            System.out.println("Library: " + libName);
        }
        public void displayInFrame(){
            System.out.println("+------------------------------------+");
            System.out.println("| Book: " + title + "             |");
            System.out.println("+------------------------------------+");
            System.out.println("| Book: " + libName + "              |");
            System.out.println("+------------------------------------+");
        }
    }
}
public class InnerClass_Library {
        public static void main(String[] args){
            LibraryClass lib = new LibraryClass("Central Library");
            LibraryClass.BookClass book = lib.new BookClass("Java Programming");
            book.displayInFrame();
           
           
        }
    
}
