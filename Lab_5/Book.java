class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book has been borrowed successfully");
        } else {
            System.out.println("Book is currently not available");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book has been returned successfully");
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }

    public void checkAvailability() {
        if (isAvailable) {
            System.out.println("Book is available for borrowing");
        } else {
            System.out.println("Book is currently borrowed");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("ABSOLUTE JAVA", "Safeeullah Shaikh");
        book.displayBookDetails();
        book.borrowBook();
        book.checkAvailability();
        book.borrowBook();
        book.returnBook();
        book.checkAvailability();
        book.borrowBook();
    }
}
