package healthcare;

import java.util.Objects;

 class Hospital {
    private String name;
    private String adress;
    private int patients;


    public Hospital(String name, String adress, int patients){
        this.name=name;
        this.adress = adress;
        this.patients=patients;
        if (name==null||name.isEmpty()){
            this.name="Centralny Szpital Kliniczny";
        }
        if(adress==null||adress.isEmpty()){
            this.adress="ul. Zdrowia 100, 00-001 Warszawa";
        }
    }

    public String getName() {
        if (name==null||name.isEmpty()){
            this.name="Centralny Szpital Kliniczny";
        }

        return name;
    }

    public void setName(String name) {
        if (name==null||name.isEmpty()){
            this.name="Centralny Szpital Kliniczny";
        }

        this.name = name;
    }

    public String getAdress() {
        if(adress==null||adress.isEmpty()){
            this.adress="ul. Zdrowia 100, 00-001 Warszawa";
        }
        return adress;
    }

    public void setAdress(String adress) {
        if(adress==null||adress.isEmpty()){
            this.adress="ul. Zdrowia 100, 00-001 Warszawa";
        }
        this.adress = adress;
    }

    public int getPatients() {
        return patients;
    }

    public void setPatients(int patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": Name: " +name +". Adress: "+ adress +". Number of patients: "+ patients+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hospital hospital = (Hospital) o;

        if (patients != hospital.patients) return false;
        if (!Objects.equals(name, hospital.name)) return false;
        return Objects.equals(adress, hospital.adress);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + patients;
        return result;
    }

    public int admitPatient(int value){
        int newpatients = patients + value;
        if(newpatients>100){
            newpatients = 1000;
        }
        return newpatients;
    }

    public static void checkCapacity(Hospital hospital){
        System.out.println("Aktualna liczba pacjentów:"+hospital.patients);
        int patientsleft = 1000 - hospital.patients;
        System.out.println("Do osiągnięcia limitu brakuje:"+patientsleft);
    }
}
