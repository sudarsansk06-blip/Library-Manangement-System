class Book {
    private String bookId;
    private String title;
    private String author;
    private BOOKSTATUS bookStatus;
    Librarian librarian = new Librarian();


    Book(String bookId, String title, String author, BOOKSTATUS bookStatus) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.bookStatus = bookStatus;
    }

    public String getbookId() {
        return bookId;
    }

    public String gettitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BOOKSTATUS getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BOOKSTATUS bookStatus) {
        this.bookStatus = bookStatus;
    }
}