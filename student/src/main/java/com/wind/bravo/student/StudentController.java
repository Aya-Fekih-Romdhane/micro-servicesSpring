package com.wind.bravo.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Student student
    ){
        service.save(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>>  getAll(){
        return ResponseEntity.ok( service.getAll());
    }
    @GetMapping("/school/{idschool}")
    public ResponseEntity<List<Student>>  getAllstudentsByIdSchool(@PathVariable Integer idschool){
        return ResponseEntity.ok( service.getByIdSchool(idschool));
    }
}
