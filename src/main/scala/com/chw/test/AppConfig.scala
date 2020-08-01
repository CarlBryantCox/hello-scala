package com.chw.test

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@MapperScan(Array("com.chw.test.mapper"))
@SpringBootApplication
class AppConfig


object LightSwordApplication extends App {
  SpringApplication.run(classOf[AppConfig])
}