package healthcare;

public class Hospital implements  Cloneable{
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
        return "Hospital{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            throw new InternalError(e.getMessage());
        }

    }
}
