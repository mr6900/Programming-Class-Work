package com.company;

import java.util.ArrayList;

/**
 * Created by mr6900 on 2/21/2019.
 */
public class Student {
    private Section section;
    private Gradebook gradebook;
    String firstName;
    String lastName;
    String Username;
    long phoneNumber;
    int tardyCount = 0;
    ArrayList<String> studentAssignments = new ArrayList<>();



    //creates a new assignment and adds it to the student specified by username.
    //Returns true if it succeeds and false if the student is not found or the student already has an assignment with the
    //same assignmentName or there are no sections
    public boolean addAssignmentToStudent(String username, String assignmentName, int pointsPossible){
        for(int i = 0; i < studentAssignments.size(); i++){
            if(username.equals(section.students.get(i)) || gradebook.sections.size() <= 0){
                studentAssignments.add(assignmentName + pointsPossible);
                return true;
            }else{
                System.out.println("You can not complete this function");
            }
        }
        return false; //FIXME
    }

}
