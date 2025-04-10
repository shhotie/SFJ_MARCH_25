package controlstatement;

public class BooksExample {
    public static void main(String[] args) {
        String[] books = {"Java", "Python", "Database", "OS", "HTML"};
        String targetBook = "CSS";
        boolean found = false;
        for (int i =0; i< books.length; i++){
            if(books[i].equals(targetBook)) {
                System.out.println("Book Found");
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Book not found");
        }
    }
}
