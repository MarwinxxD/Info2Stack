package a;

import java.util.LinkedList;

public class Student {
    LinkedList<DegreeProgram> degreeProgram = new LinkedList<>();

    public Student(DegreeProgram program) throws IllegalArgumentException {
        try {
            linkDegreeProgram(program);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void linkDegreeProgram(DegreeProgram program) throws IllegalArgumentException {
        if (!degreeProgram.contains(program)) {
            degreeProgram.add(program);
        } else {
            throw new IllegalArgumentException("this degree program is already linked");
        }
    }
}
