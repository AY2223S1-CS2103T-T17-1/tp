package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents an Assignment object that encapsulates the
 * Assignment's name, grade and weightage
 */
public class Assignment {

    public static final String GRADE_VALIDATION_REGEX = "\\d{1,5}" + "/" + "\\d{1,5}";

    public static final String WEIGHTAGE_VALIDATION_REGEX = "^(100|[1-9]?[0-9])$";

    public static final String GRADE_CONSTRAINTS =
            "Grade should be in the format [number]/[number], where the first number is greater "
                    + "or equal to the second number (max 99999).";

    public static final String WEIGHTAGE_CONSTRAINTS =
            "Weightage should be in terms of percentages, i.e. 0 - 100";

    private final String name;
    private final String grade;
    private final String weightage;

    /**
     * Constructs an {@code Assignment}.
     *
     * @param name An assignment name.
     * @param weightage A valid weightage.
     */

    public Assignment(String name, String weightage) {
        requireNonNull(name);
        requireNonNull(weightage);
        checkArgument(isValidWeightage(weightage), WEIGHTAGE_CONSTRAINTS);
        this.name = name;
        this.grade = "0/0";
        this.weightage = weightage;
    }

    /**
     * Constructs an {@code Assignment}.
     *
     * @param name An assignment name.
     * @param grade A valid grade.
     * @param weightage A valid weightage.
     */
    public Assignment(String name, String grade, String weightage) {
        requireNonNull(name);
        requireNonNull(grade);
        requireNonNull(weightage);
        checkArgument(isValidGrade(grade), GRADE_CONSTRAINTS);
        checkArgument(isValidWeightage(weightage), WEIGHTAGE_CONSTRAINTS);
        this.name = name;
        this.grade = grade;
        this.weightage = weightage;
    }
    /**
     * Returns if a given string is a valid grade.
     */
    public static boolean isValidGrade(String test) {

        if (!test.matches(GRADE_VALIDATION_REGEX)) {
            return false;
        } else {
            String[] split = test.split("/");
            return Integer.parseInt(split[0]) <= Integer.parseInt(split[1]);
        }
    }

    /**
     * Returns if a given string is a valid weightage.
     */
    public static boolean isValidWeightage(String test) {
        return test.matches(WEIGHTAGE_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return "(" + name + " Score: " + grade + " Weightage: " + weightage + "%" + ")";
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Assignment // instanceof handles nulls
                && name.equals(((Assignment) other).name)); // state check
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }



}
