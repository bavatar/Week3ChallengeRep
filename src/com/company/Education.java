/*Create an Education class and make an instance of the Education class
a member of the Person class.
Your education class should include a list of last 10 schools attended.
Create a toString() override for both Job and Education that outputs the
information in the class to the console.
The toString() override for Person should use the toString() methods
for the Job and Education member objects.*/

package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Education {
    //public String[] schoolArray = new String[4];
    private School school;
    private ArrayList<School> schools;

    public Education(){
        this.schools = new ArrayList<>();
        //setSchools();
    }

    public void setSchools(){
        //school
//        schools.add("George Washington");
//        Collections.addAll(schools,"Howard", "Catholic", "Montgomery College", "Johns Hopkins");
    }

    public void addSchool(School school){
        schools.add(school);
    }

    public ArrayList<School> getSchools() {
        return schools;
    }

    @Override
    public String toString(){
        String str = "";
        for (School s : getSchools()){
            str += s.getDegreeType() +  " in " + s.getMajor() + "\n" + s.getSchoolName() + ", " +  s.getGradYr() + "\n\n";
        }
        return "Education: \n" + str;
    }
}
