package sports;

import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
       int nationalitycompare = o2.getNationality().compareTo(o1.getNationality());
       if(nationalitycompare!=0){
           return nationalitycompare;
       }
       return o2.getName().compareTo(o1.getName());
    }
}
