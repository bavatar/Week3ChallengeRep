package com.company;

import java.util.Scanner;

import static java.lang.System.exit;

public class CompositionBasics {

    public static void main(String[] args) {
        School school;
        Job job;
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to enter a personal information record into your database? (Y)");
        String responseStr = sc.nextLine();
        if (!responseStr.equalsIgnoreCase("y")) {
            System.out.println("Program Closed");
            exit(0);
        }
        // Name
        Person person = new Person();
        System.out.println("What is your name?");
        responseStr = sc.nextLine();
        person.setName(responseStr);

        // Email
        System.out.println("What is your email address?");
        responseStr = sc.nextLine();
        person.setEmail(responseStr);

        // Education
        Education education = person.getEducation();
        int loopCnt = 0;
        while (true) {
            System.out.println("Would you like to add a school to your education record? (y)");
            responseStr = sc.nextLine();
            if (responseStr.equalsIgnoreCase("y")) {
                System.out.println("Which school name would you like to add?");
                responseStr = sc.nextLine();
                school = new School();
                school.setSchoolName(responseStr);

                System.out.println("Which year did you graduate from: " + responseStr + " ?");
                responseStr = sc.nextLine();
                school.setGradYr(responseStr);

                System.out.println("What was your Major?");
                responseStr = sc.nextLine();
                school.setMajor(responseStr);

                System.out.println("What was your Degree?");
                responseStr = sc.nextLine();
                school.setDegreeType(responseStr);

                education.addSchool(school);
                loopCnt++;
                //person.getEducation().getSchools();
//                person.getEducation().addSchool(responseStr);
            }
            else {
                if (loopCnt == 0){
                    System.out.println("A minimum of 1 educational achievement is required for this program.");
                    System.out.println("This program is closing.");
                    exit(0);
                }
                break;
            }

            System.out.println("Would you like to see all the schools currently in your education record? (y)");
            responseStr = sc.nextLine();
            if (responseStr.equalsIgnoreCase("y")) {
                //String all = person.getEducation().getSchools().toString();
                String all = person.toString();
                System.out.println("Full Record: \n" + all);
            }
        }

        loopCnt = 0;
        while (true) {
            if (loopCnt == 0) {
                System.out.println("Would you like to enter your work experience? (y)");
            } else {
                System.out.println("Would you like to enter additional work experience? (y)");
            }

            responseStr = sc.nextLine();
            if (responseStr.equalsIgnoreCase("y")) {
                job = new Job();
               //jobTitle, double salary, int id, String companyName, String startDate, String endDate, String descrDuties
                // person.getJob().setSalary(salary);
            }
            else {
                if (loopCnt == 0){
                    System.out.println("A minimum of 1 work experience entry is required for this program.");
                    System.out.println("This program is closing.");
                    exit(0);
                }
                break;
            }
//            System.out.println("Would you like to enter your job information? (y)");
//            responseStr = sc.nextLine();

            System.out.println("What is the company name that you worked for?");
            responseStr = sc.nextLine();
            job.setCompanyName(responseStr);

            System.out.println("What is your job title for company: " + responseStr + "?");
            responseStr = sc.nextLine();
            job.setJobTitle(responseStr);

            System.out.println("What was your start date?");
            responseStr = sc.nextLine();
            job.setStartDate(responseStr);

            System.out.println("What was your end date?");
            responseStr = sc.nextLine();
            job.setEndDate(responseStr);

            System.out.println("What were your duties on this job?");
            responseStr = sc.nextLine();
            job.setDescrDuties(responseStr);
            if (!(responseStr.equals(""))) {
                // At least one description is required
                person.addJob(job);
                loopCnt++;
            }
        }

        loopCnt = 0;
        while (true){
            if (loopCnt==0) {
                System.out.println("Would you like to enter some of your skills? (y) - at least 3 are required");
            }
            else
            {
                System.out.println("Would you like to enter more skills? (y)");
            }
            responseStr = sc.nextLine();
            if (responseStr.equalsIgnoreCase("y")) {
                //jobTitle, double salary, int id, String companyName, String startDate, String endDate, String descrDuties
                // person.getJob().setSalary(salary);
                System.out.println("What skill would you like to add?");
                responseStr = sc.nextLine();
                System.out.println("Is your level of skill in: " + responseStr + " (A)dvanced (I)ntermediate or (N)ovice?");
                String skillLevel = sc.nextLine();
                if (skillLevel.equalsIgnoreCase("a")) {
                    loopCnt++;
                    person.addSkills(responseStr + ",\tAdvanced");
                } else if (skillLevel.equalsIgnoreCase("i")) {
                    person.addSkills(responseStr + ",\tIntermediate");
                    loopCnt++;
                } else if (skillLevel.equalsIgnoreCase("n")) {
                    person.addSkills(responseStr + ",\tNovice");
                    loopCnt++;
                }
                else {
                    // Invalid choice of skill level
                    System.out.println("Your input for Skill Level was not recognized by this program.  Please retry.");
                }
            }
            else {
                if (loopCnt < 3){
                    System.out.println("A minimum of 3 skill entries are required for this program.");
                    System.out.println("This program is closing.");
                    exit(0);
                }
                break;
            }
        }

        System.out.println("Would you like to see a Summary of your Records?");
        responseStr = sc.nextLine();
        if (responseStr.equalsIgnoreCase("y")) {
            //String all = person.getEducation().getSchools().toString();
            String all = person.toString();
            System.out.println("********************************************** \n" + all);
        }
    }
}

