package com.ehsan.school.resource;

import com.ehsan.school.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentResource {

    private List<Student> students = Arrays.asList(
            new Student(1, "Ehsan"),
            new Student(2, "Jack")
    );

    @GetMapping
    public List<Student> getAll() {
        return students;
    }

}
