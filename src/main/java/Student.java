public class Student {
    String fullName;
    String universityId;
    int currentCourseNumber;
    float avgExamScore;

    public Student(String fullName, String universityId, int currentCourseNumber, float avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    private Student(Builder builder) {
        fullName = builder.fullName;
        universityId = builder.universityId;
        currentCourseNumber = builder.currentCourseNumber;
        avgExamScore = builder.avgExamScore;
    }

    public static final class Builder {
        private String fullName;
        private String universityId;
        private int currentCourseNumber;
        private float avgExamScore;

        public Builder() {
        }

        public Builder fullName(String val) {
            fullName = val;
            return this;
        }

        public Builder universityId(String val) {
            universityId = val;
            return this;
        }

        public Builder currentCourseNumber(int val) {
            currentCourseNumber = val;
            return this;
        }

        public Builder avgExamScore(float val) {
            avgExamScore = val;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s, %s, %s, %s",
                this.fullName,
                this.universityId,
                this.currentCourseNumber,
                this.avgExamScore
        );
    }
}