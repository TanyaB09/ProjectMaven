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
        universities.sort(universityComparator);
        String universitiesJson = JsonUtil.universityListToJson(universities);
        System.out.println(universitiesJson);
        List<University> universitiesFromJson = JsonUtil.jsonToUniversityList(universitiesJson);
        System.out.println(universities.size() == universitiesFromJson.size());
        universities.forEach(university -> {
            String universityJson = JsonUtil.universityToJson(university);
            System.out.println(universityJson);
            University universityFromJson = JsonUtil.jsonToUniversity(universityJson);
            System.out.println(universityFromJson);
        });

        List<Student> students =
                ExcelReader.readExcelStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                Comparator.getStudentComparator(StudentComparator_enum.FULL_NAME);
        students.sort(studentComparator);
        String studentsJson = JsonUtil.studentListToJson(students);
        System.out.println(studentsJson);
        List<Student> studentsFromJson = JsonUtil.jsonToStudentList(studentsJson);
        System.out.println(students.size() == studentsFromJson.size());
        students.forEach(student -> {
            String studentJson = JsonUtil.studentToJson(student);
            System.out.println(studentJson);
            Student studentFromJson = JsonUtil.jsonToStudent(studentJson);
            System.out.println(studentFromJson);
        });

    }
}