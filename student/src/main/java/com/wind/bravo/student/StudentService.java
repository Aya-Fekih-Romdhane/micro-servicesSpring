package com.wind.bravo.student;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo repo;

    public void save (Student student){
        repo.save(student);
    }
    public List<Student> getAll(){
        return repo.findAll();
    }

    public List<Student> getByIdSchool(Integer idschool) {
        return repo.findBySchoolId(idschool);
    }
}
