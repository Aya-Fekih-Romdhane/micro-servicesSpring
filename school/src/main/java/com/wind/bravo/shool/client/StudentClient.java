package com.wind.bravo.shool.client;

import com.wind.bravo.shool.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {
    @GetMapping("/school/{schoolId}")
    List<Student> getStudent(@PathVariable Integer schoolId);
}


