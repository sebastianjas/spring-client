package com.example.springclient;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentService {

    private static final Map<String, String> DEPT_NAMES =
            Map.of("001", "Technology",
            "002", "Operations",
            "003", "IT");

    @GetMapping
    public String getDepartmentName(@RequestParam("code") String code) {
        return DEPT_NAMES.getOrDefault(code, "Unknown department");
    }
}

