package com.example.filter_train.filter_train.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sample")
class SampleController {
    @GetMapping("/")
    fun index(): String {
        return "index"
    }

    @GetMapping("/{sampleId}/detail/")
    fun detail(@PathVariable("sampleId") sampleId: String): String {
        return "sampleId is ${sampleId}";
    }

    @GetMapping("/hoge/")
    fun hoge(): String {
        return "sample hoge"
    }
}