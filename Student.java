package com.stackroute.junitdemo2;

public class Student {
    public String check(int stuGrades[], int NumOfStudents) {
        for (int i = 0; i < NumOfStudents; i++)

            if (stuGrades[i] <=0 || stuGrades[i] >=100) {
                return "Error";
            }

        return "All marks are correct";
    }
}
