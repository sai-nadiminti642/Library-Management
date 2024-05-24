    import java.util.Scanner;

    //public class LibraryManagementSystem {
        public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Library Management System:");
            System.out.println("1. Add User");
            System.out.println("2. Remove User");
            System.out.println("3. Add Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Generate Report");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter user ID:");
                    String userId = scanner.nextLine();
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter email:");
                    String email = scanner.nextLine();
                    library.addUser(new User(userId, name, email));
                    break;
                case 2:
                    System.out.println("Enter user ID to remove:");
                    userId = scanner.nextLine();
                    library.removeUser(userId);
                    break;
                case 3:
                    System.out.println("Enter book ID:");
                    String bookId = scanner.nextLine();
                    System.out.println("Enter title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter author:");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    break;
                case 4:
                    System.out.println("Enter book ID to remove:");
                    bookId = scanner.nextLine();
                    library.removeBook(bookId);
                    break;
                case 5:
                    System.out.println("Enter user ID:");
                    userId = scanner.nextLine();
                    System.out.println("Enter book ID:");
                    bookId = scanner.nextLine();
                    if (library.borrowBook(userId, bookId)) {
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Failed to borrow book.");
                    }
                    break;
                case 6:
                    System.out.println("Enter book ID to return:");
                    bookId = scanner.nextLine();
                    if (library.returnBook(bookId)) {
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Failed to return book.");
                    }
                    break;
                case 7:
                    library.generateReport();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
//}

    
}
