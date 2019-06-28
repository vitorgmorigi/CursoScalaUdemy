package com.rtjvm.scala.oop.filesystem

import com.rtjvm.scala.oop.files.Directory

class State(val root: Directory, val wd: Directory, val output: String) {
  def show: Unit = {
    print(State.SHELL_TOKEN)
  }

}

object State {
  val SHELL_TOKEN = "$ "

  
}
