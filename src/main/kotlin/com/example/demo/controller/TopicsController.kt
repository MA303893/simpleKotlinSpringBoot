package com.example.demo.controller

import com.example.demo.model.Topic
import com.example.demo.service.TopicService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class TopicsController(@Autowired val topicService: TopicService) {

    @GetMapping("/topics")
    fun getTopics() = topicService.getAllTopics()


    @GetMapping("/topics/{id}")
    fun getTopic(@PathVariable id: String) = topicService.getTopic(id)

    @DeleteMapping("/topics/{id}")
    fun deleteTopic(@PathVariable id: String) = topicService.deleteTopic(id)

    @RequestMapping(method = [RequestMethod.POST], value = "/topics")
    fun addTopic(@RequestBody topic: Topic): Topic {
        return topicService.addTopic(topic)
    }
}