package com.company;

import java.util.ArrayList;

/**
 * Created by mr6900 on 2/21/2019.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String Username;
    private long phoneNumber;
    int tardyCount = 0;
    ArrayList<Assignment> studentAssignments = new ArrayList<>();


    public Student(){
       firstName = firstName;
       lastName = lastName;
       Username = Username;

    }
    public String getUsername(){
        return Username;
    }
}
