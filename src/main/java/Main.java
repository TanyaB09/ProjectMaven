import Basis.Student;
import Basis.University;
import Enum.StudentComparator_enum;
import Enum.UniversityComparator_enum;
import Comparators.Comparator;
import Comparators.StudentComparator;
import Comparators.UniversityComparator;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<University> universities =
                ExcelReader.readExcelUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                Comparator.getUniversityComparator(UniversityComparator_enum.SHORT_NAME);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students =
                ExcelReader.readExcelStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                Comparator.getStudentComparator(StudentComparator_enum.FULL_NAME);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);

    }
}