package com.example.eksdemo.domain.hello

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun getMessage(name: String) = "Hello!, $name."
}