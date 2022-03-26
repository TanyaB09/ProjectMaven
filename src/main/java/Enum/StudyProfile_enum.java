package Enum;

public class StudyProfile_enum {

    public enum Major {
        ACCOUNTING("Бухгалтерский учет"),
        FINANCE("Финансы"),
        MARKETING("Маркетинг"),
        LAW("Юриспруденция"),
        ECONOMICS("Экономика");

        private final String profileName;

        Major(String profileName) {
            this.profileName = profileName;
        }

        public String getMajor() {
            return profileName;
        }
    }
}
