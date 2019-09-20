package com.company;

public class Job {
    private String jobTitle = "";
    private double salary = 0.0;
    private int id = 0;
    private String companyName = "";
    private String startDate = "";
    private String endDate = "";
    private String descrDuties = "";

    public Job() {
    }

    public Job(String jobTitle, double salary, int id, String companyName, String startDate, String endDate, String descrDuties) {
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
        this.companyName = companyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.descrDuties = descrDuties;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        String outStr = "";
        outStr = getJobTitle() + "\n";
        outStr += getCompanyName() + ", " + getStartDate() + " - " + getEndDate() + "\n";
        outStr += "- " + getDescrDuties();
        //return "Job information: Title: " + getJobTitle() + "\t\tSalary: " + getSalary();
        return outStr;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescrDuties() {
        return descrDuties;
    }

    public void setDescrDuties(String descrDuties) {
        this.descrDuties = descrDuties;
    }
}
