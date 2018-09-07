package com.example.demo.service

import com.example.demo.model.Topic
import org.springframework.stereotype.Service

@Service
class TopicService {
    private val topics: List<Topic> = listOf(
            Topic("kotlin", "Kotlin Lang", "Kotlin is great"),
            Topic("ruby", "Ruby", "Ruby is awesome!!!"),
            Topic("java", "Java", "hahahahaha, ;)")
    )

    fun getAllTopics() = topics

    fun getTopic(id: String) =  topics.filter { t -> t.id.equals(id) }.first()
}