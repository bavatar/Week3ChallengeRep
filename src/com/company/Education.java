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
    private ArrayList<String> schools;

    public Education(){
        schools = new ArrayList<>();
        setSchools();
    }

    public void setSchools(){
        schools.add("UMD");
        Collections.addAll(schools, "Howard",
                "Georgetown", "American", "Catholic", "Montgomery College",
                "George Washington", "Johns Hopkins", "UMBC", "Towson");
    }

    public ArrayList<String> getSchools() {
        return schools;
    }

    @Override
    public String toString(){
        String str = "";
        for (String item : getSchools()){
            str += item + " ";
        }
        return "Education information: " + str;
    }

}
