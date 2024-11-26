package com.tschool.course_api.controllers;

import com.tschool.course_api.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tschool.course_api.services.TopicService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("")
    public List<Topic> getAllTopics() {
//        return "Hi";
        return topicService.getAllTopics();
    }

    @GetMapping("/{id}")
    public Optional<Topic> getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping("")
    public void addTopic(@RequestBody Topic topic) {
        System.out.println(topic.toString());
        topicService.addTopic(topic);
    }
}
