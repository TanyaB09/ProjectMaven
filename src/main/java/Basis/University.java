package Basis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class University {
    @XmlElement(name = "universityId")
    private String id;

    @XmlElement(name = "universityName")
    private String fullName;

    @XmlTransient
    private String shortName;

    @XmlTransient
    private int yearOfFoundation;

    @XmlElement(name = "universityProfile")
    private String mainProfile;

    public University() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getShortName() {
        return shortName;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public University setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

    public String getMainProfile() {
        return mainProfile;
    }

    public University setMainProfile(String mainProfile) {
        this.mainProfile = mainProfile;
        return this;
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