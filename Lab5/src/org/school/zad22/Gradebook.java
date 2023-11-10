package org.school.zad22;

import java.util.ArrayList;

public class Gradebook
{
    private String firtstName;
    private String lastName;
    private ArrayList<Integer> grades=new ArrayList<Integer>();

        void Gradebook(String firtstName, String lastName){
            this.firtstName =firtstName;
            this.lastName = lastName;
        }
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public String getFirtstName() {
        return firtstName;
    }

    public void setFirtstName(String firtstName) {
        this.firtstName = firtstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Gradebook(String firtstName, String lastName)
    {
        this.firtstName = firtstName;
        this.lastName = lastName;
    }

    void addGrade(int ocena){
        this.grades.add(ocena);
    }

    void removeGrade(int index){
        this.grades.remove(index);
    }

    double averageGrade(){
        double avg;
        int sum=0;
        for(int i =0; i<grades.size();i++){
            sum += grades.get(i);
        }
        avg = (double) sum /grades.size();
        return avg;

    }
}



