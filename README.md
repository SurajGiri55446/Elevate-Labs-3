# Library Management System

## Project Description
This project is a Java-based console application designed to manage library operations. It enables users to add books, add users, issue books, return books, and view available or issued books. The system uses a menu-driven approach with a loop, allowing users to perform multiple actions until they choose to exit. It uses object-oriented programming concepts and ensures proper input handling to avoid common runtime errors.

## Tools Used
- **Java Development Kit (JDK) 24**: For writing, compiling, and executing the Java code.
- **VS Code**: Code editor used for development.
- **Terminal/Command Prompt with javac**: Used for compiling Java files.
- **Git and GitHub**: For version control and sharing the project.

## Code Files
- `Books.java`: Contains the `Books` class representing a book with ID, name, and issue status.
- `User.java`: Represents a library user with ID and name.
- `Library.java`: Contains static methods to manage the book and user lists, as well as to handle issuing and returning books.
- `Main.java`: Contains the main method and menu logic for interacting with the system.

## Screenshots
- **[Output] Screenshot**:
- <img width="598" height="835" alt="Screenshot 2025-08-07 124236" src="https://github.com/user-attachments/assets/21e8521b-3cfd-41ee-8743-67c0fdf409ea" />


## Step-by-Step Process
1. Created Java files: `Books.java`, `User.java`, `Library.java`, and `Main.java` in VS Code.
2. Implemented:
   - `Books` class with fields for ID, name, and issue status.
   - `User` class for storing user ID and name.
   - `Library` class to maintain `ArrayList`s of books and users and handle core logic.
3. In `Main.java`, added a menu with options like:
   - Add Book
   - Add User
   - Display Books / Users
   - Issue Book
   - Return Book
   - View Issued Books
   - Exit
4. Compile the Program javac *.java(all files).
5. Executed the program with java Main.
6. Push to GitHub Repository.
