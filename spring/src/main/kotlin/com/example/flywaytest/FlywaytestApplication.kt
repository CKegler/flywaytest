package com.example.flywaytest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class FlywaytestApplication

fun main(args: Array<String>) {
	runApplication<FlywaytestApplication>(*args)
}
