package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    ArrayList<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(ArrayList<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs){
            if (lab.getName().equals(labName)){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        try {
        Lab lab = getLab(labName);
        lab.setStatus(labStatus);
        } catch (NullPointerException e){
            throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    public String toString(){
        String result = "";
        labs.sort(new labCompare());
        for (int i = 0; i < labs.size(); i++){
            result +=  labs.get(i).getName() + " > " + labs.get(i).getStatus().toString();
            if (i < labs.size() - 1){
                result += "\n";
            }
        }
        return result;
    }

    public class labCompare implements Comparator<Lab> {

        @Override
        public int compare(Lab o1, Lab o2) {
            if (o1.getName().compareTo(o2.getName()) > 0){
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0){
                return -1;
            } else {
                return 0;
            }
        }
    }

}
