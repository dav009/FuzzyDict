package com.github.dav009.utils

object Ngram{

  def apply(string:String)={
    val trigrams = ("££" + string + "££").toCharArray().sliding(3)
    trigrams.map(_.mkString("")).toList
  }

}
