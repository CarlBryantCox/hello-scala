package com.chw.test.controller

import com.chw.test.mapper.UserScalaMapper
import javax.annotation.Resource
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RequestParam, RestController}

@RestController
@RequestMapping(Array("/scala"))
class UserScalaController @Resource() (val userScalaMapper:UserScalaMapper) {

  @GetMapping(Array("/getUser"))
  def getUser()={
    userScalaMapper.getUser(1)
  }

  @GetMapping(Array("/getUserById"))
  def getUserById(@RequestParam("id") id: Int)={
    userScalaMapper.getUserById(id)
  }
}
