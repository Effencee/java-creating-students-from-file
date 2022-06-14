package z4;

import java.util.ArrayList;
import java.util.List;

public class StudentHelper {
    FileService fileService = new FileService();

    public List<Student> studentList(){
        List<String> list = fileService.readFromFile();
        List<Student> list1 = new ArrayList<>();
        for (String s: list) {
            list1.add(createStudent(s));
        }
        return list1;
    }

    private Student createStudent(String s){
        String[] s1 = s.split(";");
        Student student = new Student(s1[0], s1[1], s1[2], s1[3], studentGrades(s1[4]));
        return student;
    }

    private List<Double> studentGrades(String s){
        String[] spliter = s.split(",");
        List<Double> list = new ArrayList<>();
        for (String elem: spliter) {
            list.add(Double.parseDouble(elem));
        }
        return list;
    }

}
