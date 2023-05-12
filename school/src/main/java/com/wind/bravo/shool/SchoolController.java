package com.wind.bravo.shool;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/school")
@RequiredArgsConstructor
public class SchoolController {

        private final SchoolService service;

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public void save(
                @RequestBody School school
        ){
            service.save(school);
        }

        @GetMapping
        public ResponseEntity<List<School>> getAll(){
            return ResponseEntity.ok( service.getAll());
        }
    @GetMapping("/{idschool}")
    public ResponseEntity<FullSchoolResponse> getAllschoolwithStudents(
            @PathVariable Integer idschool
    ){
        return ResponseEntity.ok( service.getByIdSchool(idschool));
    }
    }

