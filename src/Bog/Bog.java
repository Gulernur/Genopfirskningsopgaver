package Bog;

public class Bog {
    private String isbnNumber;
    private String title;
    private int year;

    public Bog(String isbnNumber, String title, int year) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.year = year;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "isbnNumber='" + isbnNumber + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
