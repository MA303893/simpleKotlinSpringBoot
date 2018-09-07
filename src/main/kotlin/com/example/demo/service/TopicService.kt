package com.example.demo.service

import com.example.demo.model.Topic
import org.springframework.stereotype.Service

@Service
class TopicService {
    private val topics: MutableList<Topic> = mutableListOf(
            Topic("kotlin", "Kotlin Lang", "Kotlin is great"),
            Topic("ruby", "Ruby", "Ruby is awesome!!!"),
            Topic("java", "Java", "hahahahaha, ;)")
    )

    fun getAllTopics() = topics

    fun getTopic(id: String) = topics.filter { t -> t.id.equals(id) }.first()

    fun deleteTopic(id: String): Topic {
        val topic = getTopic(id)
        topics.remove(topic)
        return topic
    }

    fun addTopic(topic: Topic): Topic {
        topics.add(topic)
        return topic
    }

    fun updateTopic(id: String, topic: Topic): Topic {
        val res = topics.forEachIndexed { index, t ->
            if (t.id.equals(id)) {
                topics.set(index, topic)
                return topics.get(index)
            }
        }
        throw Exception("Topic not found")
    }
}