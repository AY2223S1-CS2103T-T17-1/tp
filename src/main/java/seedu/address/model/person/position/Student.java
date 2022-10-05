package seedu.address.model.person.position;

/**
 * Represents the Student position in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPosition(int)}
 */
public class Student extends Position {

    public Student() {
        super(0);
    }

    @Override
    public String toString() {
        return "Student";
    }

    @Override
    public boolean equals(Object other) {
        return true;
    }

    @Override
    public int hashcode() {
        return 0;
    }
}
