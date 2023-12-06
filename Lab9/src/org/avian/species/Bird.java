package org.avian.species;

 record Bird(String species, double wingSpan, boolean canMigrate) {
    public Bird{
        if(species==null){
            species="Unknown";
        }
    }
}
