package org.agdf.mesure

trait Result[F] {
  def name: String
  def result: F

  def stats: Map[String, Double]
  override def toString = stats.mkString(s"${name}: $result (", ", ", ")")
}
