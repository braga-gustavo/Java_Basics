
public class Title implements Comparable<Title>{

    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public Title(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());

    }

    @Override
    public String toString() {
        return "Title [name=" + name + ", author=" + author + "]";
    }

    

}
