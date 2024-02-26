package healthcare;

import java.util.Objects;

class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        if(name==null){
            this.name="";
        }
        this.name = name;
        if(capacity<=0){
            this.capacity=50.0;
        }
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "Name:" + name + '.' +
                "Capacity:" + capacity +
                '.';
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         Hospital hospital = (Hospital) o;

         if (Double.compare(capacity, hospital.capacity) != 0) return false;
         return Objects.equals(name, hospital.name);
     }


 }
