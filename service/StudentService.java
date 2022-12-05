package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Student;

public interface StudentService {

    Student createStuent(Student student);

    Student findStudent(long id);

    Student editStudent(long id , Student student);

    void deleteStudent(long id);
}
