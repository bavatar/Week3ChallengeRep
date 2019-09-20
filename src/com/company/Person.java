package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;
    private Address address;
    private ArrayList<Job> jobs;
    private ArrayList<String> skills;

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public void addSkills(String skill) {
        this.skills.add(skill);
    }

    public Person(){
        this.job = new Job();
        this.jobs = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.education = new Education();
        this.address = new Address();
    }

    public double getSalary() {
        return job.getSalary();
    }
    public void setSalary(double sal) {
        job.setSalary(sal);
    }

    @Override
    public String toString(){
        String outStr = "";
        outStr += getAddress().getName() + "\n" + getAddress().getEmail() + "\n\n";

        // Education
        outStr += education.toString();

        // Experience
        outStr += "Experience:\n";
        jobs = getJobs();
        for (Job j: jobs){
            outStr += j.toString() + "\n\n";
        }

        outStr += "Skills:\n";
        for (String s : skills){
            outStr += s + "\n";
        }
        return outStr;
    }

    public Job getJob() {
        return job;
    }
    public void setJob(Job job) {
        this.job = job;
    }

    public Education getEducation() {
        return education;
    }
    public void setEducation(Education education) {
        this.education = education;
    }

    public String getName(){
        return address.getName();
    }
    public void setName(String name){
        address.setName(name);
    }

    public void setPhone(String phone) {
        address.setPhone(phone);
    }
    public String getPhone() {
        return address.getPhone();
    }

    public String getEmail(){
        return address.getEmail();
    }
    public void setEmail(String email){
        address.setEmail(email);
    }

    public Address getAddress() {
        return address; // name conflict with address ... getAddress returns a String
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public void addJob(Job job){
        jobs.add(job);
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }
    public void setJobs(ArrayList<Job> jobs) {
        // Not needed as use addJob
        this.jobs = jobs;
    }
}
