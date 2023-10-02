package creatingclasses;

import java.util.Objects;

public class Book {
   private final int numberOfPages;
   private final int numberOfWords;

    public Book(int numberOfPages, int numberOfWords) {
        this.numberOfPages = numberOfPages;
        this.numberOfWords = numberOfWords;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && numberOfWords == book.numberOfWords;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfPages, numberOfWords);
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                ", numberOfWords=" + numberOfWords +
                '}';
    }
}
