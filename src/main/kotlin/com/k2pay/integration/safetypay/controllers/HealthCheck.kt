package com.k2pay.integration.safetypay.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheck {

    @GetMapping("/health")
    fun check(): String {
        return "ok"
    }

}