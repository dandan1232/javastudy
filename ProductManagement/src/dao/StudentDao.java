package dao;

import entity.Student;

import java.util.List;

public interface StudentDao {
    int add(Student student);
    int delete(Student student);

    int delete(int studentid);
    List<Student> getByID(String grade);

    List<Student> getAll();
}
