package vierzehn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.BiConsumer;

public class GradeTracker {
    HashMap<Integer, ArrayList<Double>> grades = new HashMap<> ();

    void addGrade(int enrolmentNumber, double grade) {
        if (!grades.containsKey(enrolmentNumber)) {
            grades.put(enrolmentNumber, new ArrayList<>());
            grades.get(enrolmentNumber).add(grade);
        } else {
            grades.get(enrolmentNumber).add(grade);
        }
    }

    double calculateAverageGrade(int enrolmentNumber) {
        double average = 0;

        if(grades.get(enrolmentNumber).isEmpty()) {
            return -1;
        }

        for (int i = 0; i < grades.get(enrolmentNumber).size(); i++) {
            average += grades.get(enrolmentNumber).get(i);
        }

        return average / grades.get(enrolmentNumber).size();
    }

    double calculateAverageAverageGrade() {
        double average = 0;

        Iterator<Integer> it= grades.keySet().iterator();

        while (it.hasNext()) {
            double next = calculateAverageGrade(it.next());
            if(next != -1) {
                average += next;
            }
        }

        if(average == 0) {
            return -1;
        }
        return average / grades.size();
    }
}
