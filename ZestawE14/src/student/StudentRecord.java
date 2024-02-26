package student;

public record StudentRecord(String name, String id, double gpa) {

    public StudentRecord {
        if(gpa<0.0 || gpa>4.0){
            throw new IllegalArgumentException("średnia ocen poza zakresem");
        }
    }

    public boolean isHonorStudent(){
        if(gpa>=3.5){
            return true;
        }
        return false;
    }


    public String printDetails() {
        return "StudentRecord{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
