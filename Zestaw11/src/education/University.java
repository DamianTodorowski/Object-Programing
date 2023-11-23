package education;

import java.util.Objects;

public class University extends School {

    private String type;
    private  int studies;

    public University(String name, String adress, int students, String type, int studies) {
        super(name, adress, students);
        this.type = type;
        if(type.isEmpty()){
           this. type = "university of technology";
        }
        this.studies = studies;
        if(studies<=0){
            this.studies=10;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
        this.studies = studies;
    }

    @Override
    public String toString() {
        return "Name: " + getName()+". " + "Adress: "+getAdress()+". "+"Number of students" +getStudents()+
                ". "+ "Type: "+ type +". "+ "Numbers of fields to study: "+ studies+". ";
    }


    public void recriutment(int value){
        int studentsAdd = getStudents()+value;
        if(studentsAdd>500){
            studentsAdd=500;
        }

        int newstudents = (int) Math.round(studentsAdd/10.0);
        studentsAdd+=newstudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        University that = (University) o;

        return studies == that.studies;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + studies;
        return result;
    }
}
