package com.chw.test.dto

import scala.beans.BeanProperty

class TeacherDTO {

  @BeanProperty
  var id:Long=_
  @BeanProperty
  var teacherName:String=_

  def this(id:Long,teacherName:String)={
    this
    this.id=id
    this.teacherName=teacherName
  }


}
