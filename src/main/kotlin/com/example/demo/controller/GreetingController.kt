package com.example.demo.controller

import com.example.demo.model.Greeting
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@Controller
class GreetingController {
    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World", required = false) name: String, model: Model):String {
        model.addAttribute("greeting", Greeting(counter.incrementAndGet(),  name))
        return "greeting"
    }
}