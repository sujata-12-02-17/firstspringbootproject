package com.techdenovo.app.firstspringbootproject.service;

import com.techdenovo.app.firstspringbootproject.controller.StudentController;
import com.techdenovo.app.firstspringbootproject.domain.Student;
import com.techdenovo.app.firstspringbootproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {       //get the data in present in db
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {            //insert the  new record into table

        return studentRepository.save(student);
    }

    public Student updateStudent(Student student, Long id) {
        Student studentExisting = studentRepository.findById(id).orElse(null);
        if (studentExisting != null) {
            studentExisting.setFirstName(student.getFirstName());
        } else {
            return null;
        }
        return studentRepository.save(student);
    }



    public String deleteStudent(Long id) {
        String msg;
        Student studentExisting = studentRepository.findById(id).orElse(null);
        if(studentExisting != null){
            studentRepository.deleteById(id);
            msg = "Successfully deleted";
        } else {
            msg = "No Data found";
        }

        return msg;

    }
}


