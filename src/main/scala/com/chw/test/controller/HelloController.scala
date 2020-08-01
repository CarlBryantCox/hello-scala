package com.chw.test.controller

import java.util
import java.util.Date

import com.chw.test.dto.StudentDTO
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
  * Hello Scala
  */

@RestController
@RequestMapping(Array("/hello"))
class HelloController {

  @RequestMapping(Array("/sayHello"))
  def sayHello() = {
    val now = new Date
    val content = "Hello, ! Now is: " + now
    val json = new util.HashMap[String, String]
    json.put("content", content)
    json
  }

  @RequestMapping(Array("/newStudent"))
  def newStudent() = {
    val student = new StudentDTO
    student.setStudentId(1L)
    student.setStudentName("Carl")
    student.sayHello()
    student
  }

}
