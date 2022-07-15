package otherPackage;

public class Book {
    private String title;
    private int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    private Cinderella cinderela = new Cinderella();

    public void useCinderella(){
        cinderela.book();
    }

}
