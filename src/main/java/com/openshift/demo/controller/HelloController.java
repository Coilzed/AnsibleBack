package com.openshift.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.openshift.demo.entity.Text;
import com.openshift.demo.repository.TextRepository;

@Controller
public class HelloController {

    public static final long TEXT_ID = 1L;

    private TextRepository textRepository;

    public HelloController(TextRepository textRepository) {
        this.textRepository = textRepository;
    }

    @GetMapping("/hello")
    public ResponseEntity<?> handle() {
        Text text = textRepository.findById(TEXT_ID);
        return ResponseEntity.ok(text.getValue());
    }
}
