package com.github.dav009.examples

import com.github.dav009.fuzzy.simstring.{Cosine, FuzzyMap}


object FuzzyMapExample {

  def main(args:Array[String]): Unit ={

    println("Creating Map:")
    val fuzzyHash = FuzzyMap(List( ("Barack Obama", "ID1"),
                                   ("Barack O", "ID2"),
                                   ("Barack", "ID3"),
                                    ("Washington", "ID4")))

    println("\nget values of keys matching to \"Barack\" with 1.0 cosine similarity")
    println(fuzzyHash.get("Barack", 1.0, Cosine)) // Some(List(ID3))

    println("\nget values of keys matching to \"Barack\" with 0.5 cosine similarity")
    println(fuzzyHash.getMatches("Barack", 0.5, Cosine)) // Some(List((Barack,ID3), (Barack O,ID2), (Barack Obama,ID1)))

    println("\nTuples in FuzzyHash:")
    fuzzyHash.foreach(println(_))
  }
}
