package Comparators;


import Enum.StudentComparator_enum;
import Enum.UniversityComparator_enum;

public class Comparator {

    private Comparator() {
    }

    public static StudentComparator getStudentComparator(StudentComparator_enum studentComparator_enum) {

        return switch (studentComparator_enum) {
            case UNIVERSITY_ID -> new StudentUniversityIdComparator();
            case FULL_NAME ->
                   new StudentFullNameComparator();
            case COURSE -> new StudentCourseComparator();
            case AVG_EXAM_SCORE -> new StudentAvgExamScoreComparator();
        };
    }

    public static UniversityComparator getUniversityComparator(UniversityComparator_enum universityComparator_enum) {

        return switch (universityComparator_enum) {
            case ID -> new UniversityIdComparator();
            case FULL_NAME ->
                   new UniversityFullNameComparator();
            case SHORT_NAME -> new UniversityShortNameComparator();
            case PROFILE -> new UniversityProfileComparator();
            case YEAR -> new UniversityYearComparator();
        };
    }
}
