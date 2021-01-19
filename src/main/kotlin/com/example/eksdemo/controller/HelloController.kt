package com.example.eksdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(): String {
        return "[Version 0.0.6] Receive message from ${InetAddress.getLocalHost().hostName}\n"
    }
}