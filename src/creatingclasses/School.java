package creatingclasses;

import java.util.Objects;

public class School {
    private final String nameOfSchool;
    private final int numberOfStudents;

    public School(String nameOfSchool, int numberOfStudents) {
        this.nameOfSchool = nameOfSchool;
        this.numberOfStudents = numberOfStudents;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return numberOfStudents == school.numberOfStudents && Objects.equals(nameOfSchool, school.nameOfSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSchool, numberOfStudents);
    }

    @Override
    public String toString() {
        return "School{" +
                "nameOfSchool='" + nameOfSchool + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
