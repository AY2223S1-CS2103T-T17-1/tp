package seedu.address.model.person.position;

/**
 * Represents a Person's position in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPosition(int)}
 */
public abstract class Position {

    public static final String MESSAGE_CONSTRAINTS =
            "Positions should only contain integers from 0 to 2 inclusive";

    public final int value;

    public Position(int value) {
        this.value = value;
    }

    /**
     * Returns true if a given string is a valid position.
     */
    public static boolean isValidPosition(int test) {
        return (test >= 0) && (test <= 2);
    }

    /**
     * Class method that returns the type of position given by the value.
     * @param position
     * @return The desired Position descendant
     */
    public static Position buildPosition(Integer position) {
        switch(position) {
        case 0:
            return new Student();
        case 1:
            return new TeachingAssistant();
        default:
            return new Professor();
        }
    }

    public abstract String toString();

    public abstract boolean equals(Object other);

    public abstract int hashcode();
}
