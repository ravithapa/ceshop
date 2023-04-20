package project.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.project1.model.ProgressData;
import project.project1.service.ProgressService;
@RestController
@RequestMapping("/api")
public class ProgressDataController {

    @Autowired
    ProgressService progressService;

    @GetMapping("/progress")
    public ProgressData getProgressData(
            @RequestParam("studentId") int studentId, @RequestParam("courseId") int courseId){
        return progressService.getProgressData(studentId, courseId);
    }

}
