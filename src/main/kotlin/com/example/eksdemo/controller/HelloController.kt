package com.example.eksdemo.controller

import com.example.eksdemo.dto.Hello
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(): Hello {
        return Hello(
            msg = "Hello!",
            from = InetAddress.getLocalHost().hostName
        )
    }
}