package com.wind.bravo.shool;

import com.wind.bravo.shool.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepo repo;
    private final StudentClient studentClient;

        public void save (School school){
            repo.save(school);
        }
        public List<School> getAll(){
            return repo.findAll();
        }

    public FullSchoolResponse getByIdSchool(Integer idschool) {
            var school = repo.findById(idschool)
                    .orElse(
                            School
                                    .builder()
                                    .email("not found")
                                    .build()
                    );
            var students = studentClient.getStudent(idschool);
            return FullSchoolResponse.builder()
                    .email(school.getEmail())
                    .studentList(students)
                    .build();
    }
}