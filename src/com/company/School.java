package com.company;

public class School {
    private String degreeType;
    private String major;
    private String schoolName;
    private String gradYr;

    public School() {
    }

    public School(String degreeType, String major, String schoolName, String gradYr) {
        this.degreeType = degreeType;
        this.major = major;
        this.schoolName = schoolName;
        this.gradYr = gradYr;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getGradYr() {
        return gradYr;
    }

    public void setGradYr(String gradYr) {
        this.gradYr = gradYr;
    }
}
