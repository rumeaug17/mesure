package org.agdf.mesure

package object Implicits {

  implicit class IntExt(val i: Int) extends AnyVal {
    def times: Int = i
  }
}