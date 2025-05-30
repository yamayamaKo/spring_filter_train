package com.example.filter_train.filter_train.filter

import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SampleFilterConfig {

    @Bean
    fun sampleFilter(): FilterRegistrationBean<SampleFilter> {
        val filterRegistrationBean = FilterRegistrationBean<SampleFilter>(SampleFilter())
        return filterRegistrationBean
    }

}