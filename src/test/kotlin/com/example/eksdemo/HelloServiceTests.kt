package com.example.eksdemo

import com.example.eksdemo.domain.hello.HelloService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HelloServiceTests {

    @Test
    fun testGetMessage() {

        val service = HelloService()

        val message = service.getMessage(name = "John")

        assertEquals("Hello!, John.", message)
    }
}
