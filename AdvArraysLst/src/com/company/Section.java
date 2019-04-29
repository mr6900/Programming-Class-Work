package com.company;

import java.util.ArrayList;

/**
 * Created by mr6900 on 2/21/2019.
 */
public class Section {
    //Gradebook gradebook = new Gradebook();
    private Student student;
    private String sectionName;
    private ArrayList<Student> students;
    ArrayList<Assignment> sectionAssignments;

    public Section(String sectionName){
        this.sectionName = sectionName;
        students = new ArrayList<>();
    }

    public String getSectionName(){
        return sectionName;
    }

    public int checkUsername(String username){
        int index = 0;
        while (index < students.size()){
            if(username.equalsIgnoreCase(students.get(index).getUsername())){
                return index;
            }
            index++;
        }
        return -1;
    }

    public boolean addStudent(String firstName, String lastName, String userName, long phoneNumber){
        int index = checkUsername(userName);
        if(index != -1){
            return false;
        }else{
            students.add(new Student(firstName, lastName, userName, phoneNumber));
            return true;
        }
    }


}
