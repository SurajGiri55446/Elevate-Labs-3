import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
         System.out.println("\n--- Library Menu ---\n1. Add Book  2. Add User  3. Display Books  4. Display Users");
        System.out.println("5. Issue Book  6. Return Book  7. Show Issued Books  8. Exit");
        System.out.print("Choose option: ");


            int choice = sc.nextInt();
            sc.nextLine();
            if(choice==8){
                System.out.println("exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    library.addBook(new Books(bid, title,false));
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String uname = sc.nextLine();
                    library.addUser(new User(uid, uname));
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    library.displayUsers();
                    break;

                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    int bookToIssue = sc.nextInt();
                    System.out.print("Enter User ID to : ");
                    int userToIssue = sc.nextInt();
                    library.issueBook(bookToIssue, userToIssue);
                    break;

                case 6:
                    System.out.print("Enter Book ID : ");
                    int bookToReturn = sc.nextInt();
                    library.returnBook(bookToReturn);
                    break;

                case 7:
                    library.displayIssuedBooks();
                    break;


                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
