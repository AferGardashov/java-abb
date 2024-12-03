package homeworks.homework8;

import java.util.Objects;

public class BorrowRequest{

    public String borrowerName;

    public String isbn;


    public BorrowRequest(String borrowerName, String isbn) {
        this.borrowerName = borrowerName;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "BorrowRequest{" +
                "borrowerName='" + borrowerName + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

}
