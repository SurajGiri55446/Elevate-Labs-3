import java.util.*;

public class Library {
    private List<Books> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private Map<Integer, Integer> issuedBooks = new HashMap<>(); 

    public void addBook(Books book) {
        books.add(book);
        System.out.println("----Book added------");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("-----User added--------");
    }

    public void displayBooks() {
        for (Books book : books) {
            System.out.println(book);
        }
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void issueBook(int bookId, int userId) {
        for (Books book : books) {
            if (book.getId() == bookId && !book.isIssued()) {
                book.issueBook();
                issuedBooks.put(bookId, userId);
                System.out.println("-------Book issued to user--------");
                return;
            }
        }
        System.out.println("------Book not found or already issued-----");
    }

    public void returnBook(int bookId) {
        for (Books book : books) {
            if (book.getId() == bookId && book.isIssued()) {
                book.returnBook();
                issuedBooks.remove(bookId);
                System.out.println("--------Book returned---------");
                return;
            }
        }
        System.out.println("--------Book not found or not issued--------");
    }

    public void displayIssuedBooks() {
        for (Map.Entry<Integer, Integer> entry : issuedBooks.entrySet()) {
            int bookId = entry.getKey();
            int userId = entry.getValue();
            System.out.println("Book ID " + bookId + " is issued to User ID " + userId);
        }
    }
}
