package se.lexicon.dao;

import se.lexicon.model.Student;

import java.util.List;

public interface StudentDao {
    public Student save(Student student);
    public Student findByEmail(String email);
    List<Student> findByName(String name);
    Student findById(int id);
    List<Student> findAll();
    boolean delete(Student student);
}
