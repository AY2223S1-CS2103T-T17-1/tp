package seedu.address.model.person.position;

/**
 * Represents the Professor position in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPosition(int)}
 */
public class Professor extends Position {

    public Professor() {
        super(2);
    }

    @Override
    public String toString() {
        return "Professor";
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
