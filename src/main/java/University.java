public class University {
    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;
    String mainProfile;

    public University(String id, String fullName, String shortName, int yearOfFoundation, String mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
    }

    private University(Builder builder) {
        id = builder.id;
        fullName = builder.fullName;
        shortName = builder.shortName;
        yearOfFoundation = builder.yearOfFoundation;
        mainProfile = builder.mainProfile;
    }


    public static final class Builder {
        private String id;
        private String fullName;
        private String shortName;
        private int yearOfFoundation;
        private String mainProfile;

        public Builder() {
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder fullName(String val) {
            fullName = val;
            return this;
        }

        public Builder shortName(String val) {
            shortName = val;
            return this;
        }

        public Builder yearOfFoundation(int val) {
            yearOfFoundation = val;
            return this;
        }

        public Builder mainProfile(String val) {
            mainProfile = val;
            return this;
        }

        public University build() {
            return new University(this);
        }
    }


    @Override
    public String toString() {
        return String.format(
                "%s, %s, %s, %s, %s",
                this.id,
                this.fullName,
                this.shortName,
                this.yearOfFoundation,
                this.mainProfile
        );
    }
}