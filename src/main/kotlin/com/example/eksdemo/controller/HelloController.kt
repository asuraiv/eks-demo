package com.example.eksdemo.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@RestController
class HelloController(
    @Value("\${service.name}")
    val serviceName: String?
) {

    @GetMapping("/hello")
    fun hello(): String {
        return "[$serviceName][Version 0.0.1] Receive message from ${InetAddress.getLocalHost().hostName}\n"
    }
}