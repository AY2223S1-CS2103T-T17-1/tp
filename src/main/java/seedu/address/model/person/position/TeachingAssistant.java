package seedu.address.model.person.position;

/**
 * Represents the Teaching Assistant position in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPosition(int)}
 */
public class TeachingAssistant extends Position {

    public TeachingAssistant() {
        super(1);
    }

    @Override
    public String toString() {
        return "Teaching Assistant";
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
