package com.chw.test.mapper

import com.chw.test.entity.User
import org.apache.ibatis.annotations.{Param, Select}

trait UserScalaMapper {

  @Select(Array("SELECT * FROM sys_user WHERE id = #{id}"))
  def getUser(@Param("id")id:Long):User

  def getUserById(@Param("id")id:Long):User

}
