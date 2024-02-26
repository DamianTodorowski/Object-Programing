package healthcare;

 class Clinic extends Hospital {
    private double rating;

    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        if (rating <= 0.0 && rating >= 5.0) {
            this.rating = 3.0;
        }
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating <= 0.0 && rating >= 5.0) {
            this.rating = 3.0;
        }
        this.rating = rating;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ super.toString() + rating + ".";
    }


     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         if (!super.equals(o)) return false;

         Clinic clinic = (Clinic) o;

         return Double.compare(rating, clinic.rating) == 0;
     }


 }
