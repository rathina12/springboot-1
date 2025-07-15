package com.example.task_tracker.controllers;

import com.example.task_tracker.TaskService;
import com.example.task_tracker.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService service;

    @GetMapping
    public List<Task> getMapping(){
        return service.getMapping();
    }
    @GetMapping("/{id}")
    public Task getTaskById(int id){
        return service.getTaskById(id);
    }

    @PostMapping
    public String createTask(@RequestBody Task newtask){
        return service.createTask(newtask);
    }


    @PutMapping
    public String updateTask(@RequestBody Task updatedTask, @PathVariable int id){
        return service.updatedTask(updatedTask, id);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id){
        return service.deleteTask(id);
    }
}
