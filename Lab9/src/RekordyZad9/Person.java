package RekordyZad9;

 record Person(String FirstName,int age) {
    public Person {
        if(age<=0){
            age=0;
        }
    }
}

