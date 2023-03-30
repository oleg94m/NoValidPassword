package HomeTask3;

public class Book {
    private String autor;
    private  String name;
    private String years;

    public Book(String autor, String name, int years) {
        this.autor = autor;
        this.name = name;
        this.years = String.valueOf(years);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }
    public void printBook() {
        Runnable printTitle = new Runnable() {
            @Override
            public void run() {
                System.out.println("Title: " + name);
            }
        };
        printTitle.run();

        Runnable printAuthor = () -> System.out.println("Author: " + autor);
        printAuthor.run();

        Runnable printYear = () -> System.out.println("Year: " + years);
        printYear.run();
    }
}
