public class Main {
    public static void main(String[] args) {
        University iab = new University(
                "IAB",
                "International Academy of Business",
                "IAB",
                1980,
                StudyProfile_enum.Major.LAW.getMajor()
        );

        Student student1 = new Student(
                "Иванов Кайрат Олегович",
                "IAB",
                2,
                3.2f);

        System.out.println(iab);
        System.out.println(student1);
    }
}