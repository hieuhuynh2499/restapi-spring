package com.example.demo.controller;

import com.example.demo.entity.Tutorial;
import com.example.demo.reponsitory.TutorialsReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tutorials")
public class TutoirialController {
    @Autowired
    TutorialsReponsitory tutorialRepository;
    @GetMapping("")
    public ResponseEntity<List<Tutorial>> getAllTutorials() {
            List<Tutorial> tutorials = new ArrayList<Tutorial>();
            tutorialRepository.findAll().forEach(tutorials::add);
            return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }
    @PostMapping("/tutorial")
    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
            Tutorial _tutorial =
                    tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), false));
            return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
    }
}
