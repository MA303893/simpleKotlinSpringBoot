package com.example.demo.controller

import com.example.demo.model.Topic
import com.example.demo.service.TopicService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TopicsController(@Autowired val topicService: TopicService) {

    @GetMapping("/topics")
    fun getTopics() = topicService.getAllTopics()


    @GetMapping("/topics/{id}")
    fun getTopic(@PathVariable id: String) = topicService.getTopic(id)
}