package task_book;

public class Title {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void show (){
        System.out.println("Назва: " + getTitle());
    }
}
