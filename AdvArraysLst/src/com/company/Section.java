package com.company;

import java.util.ArrayList;

/**
 * Created by mr6900 on 2/21/2019.
 */
public class Section {
    //Gradebook gradebook = new Gradebook();
    Student student = new Student();
    ArrayList<String> students = new ArrayList<>();
    ArrayList<String> sectionAssignments = new ArrayList<>();



    //Creates a new student and adds the student to the currently active section
    //returns: True if it succeeds, false if it fails(a student with the same username already exists or there are no sections)
    public boolean addStudent(String firstName, String lastName, String userName, long phoneNumber){
        for(int i = 0; i <= students.size(); i++){
            if(userName.equals(students.get(i))){
                students.add(firstName + lastName + userName + phoneNumber);
                System.out.println("Student has been added");
                return true;
            }else{
                System.out.println("Username has been taken");
                System.exit(0);
            }
        }
        return false; //FIXME
    }

    //checks to make sure no student already has an assignment with the same assignment name first
    //if there is no existing assignment it creates a new assignment and adds the assignment to all
    // the students in the current section.
    //returns: True if successful and false if at least one student has the same assignment name or there are no sections
    public boolean addAssignmentToSection(String assignmentName, int pointsPossible){
        for(int i = 0; i < sectionAssignments.size(); i++){
            if(sectionAssignments.get(i) != student.studentAssignments.get(i)){
                student.studentAssignments.add(assignmentName + pointsPossible);
                return true;
            }else{
                System.out.println("A student already has this assignment");
            }
        }

        return false;//FIXME
    }
}
