package healthcare;

import java.util.Objects;

 class Clinic extends  Hospital{
    private String specialization;
    private int doctors;

    public Clinic(String name, String adress, int patients,String specialization, int doctors) {
        super(name, adress, patients);
        this.specialization =specialization;
        if(specialization==null||specialization.isEmpty()){
            this.specialization="ogólna";
        }
        this.doctors=doctors;
        if(doctors<=0){
            this.doctors=20;
        }

    }

    public String getSpecialization() {
        if(specialization==null||specialization.isEmpty()) {
            this.specialization = "ogólna";
        }
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if(specialization==null||specialization.isEmpty()) {
            this.specialization = "ogólna";
        }
        this.specialization = specialization;
    }

    public int getDoctors() {
        if(doctors<=0){
            this.doctors=20;
        }
        return doctors;
    }

    public void setDoctors(int doctors) {
        if(doctors<=0){
            this.doctors=20;
        }
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpecialization: " + specialization + ". Number of doctors: " + doctors + ".";
    }

    public void admitpatient(int value){
        int newpatients = getPatients() + value;
        if(newpatients>500){
            newpatients=500;
        }
        int adddoctors = doctors + 20;
        System.out.println("Liczba pacjentów:"+newpatients);
        System.out.println("Liczba lekarzy"+adddoctors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Clinic clinic = (Clinic) o;

        if (doctors != clinic.doctors) return false;
        return Objects.equals(specialization, clinic.specialization);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (specialization != null ? specialization.hashCode() : 0);
        result = 31 * result + doctors;
        return result;
    }
}
