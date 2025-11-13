public class Library {
    private Book[] books;

    public Library(){
        this.books = new Book[5];
    }

    public void addBook(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null){
            books[i] = book;
            System.out.println("Added successfully!!");
            return;
            }
        }
        System.out.println("Sorry! The library s full!!");
    }

    public void removeBook(int bookID){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getBookID() == bookID){
                books[i] = null;
                System.out.println("Removed successfully!!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void searchBook(int bookID){
        for (Book x : books){
            if (x != null && x.getBookID() == bookID){
                System.out.println("Your searched book is found!!");
                return;
            }
        }
        System.out.println("The book is not found!");
    }
    public void displayBooks(){
        for (Book book : books){
            if (book != null){
                System.out.println(book);
            }
        }
    }
}