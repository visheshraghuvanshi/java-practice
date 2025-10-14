/** @author Vishesh
 * @version 1.0
 * @since 2025
 */

/**
 * Class for library Book
 */

public class Book {
    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     * Parametrized Constructor
     * @param s Book Name
     */

    public Book(String s) {}

    /**
     * issue a Book to a Student
     * @param roll roll number of a Student
     * @throws Exception If roll number is not available then throws exception
     */

    public void issue(int roll) throws Exception {}

    /**
     * Check if book is available
     * @param str Book Name
     * @return if Book is available returns true else false
     */

    public boolean available(String str) {
        return true;
    }

    /**
     * Get Book name
     * @param id book id
     * @return returns book name
     */

    public String getName(int id) {
        return "";
    }
}
