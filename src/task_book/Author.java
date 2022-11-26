package task_book;

public class Author {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void show (){
        System.out.println("Автор: " + getAuthor());
    }
}
