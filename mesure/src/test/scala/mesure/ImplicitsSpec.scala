package org.agdf.mesure.test

import scala.language.{implicitConversions, reflectiveCalls, postfixOps}

import org.scalatest._
import prop._

import org.agdf.mesure.Implicits._

import org.scalacheck.Gen
import org.scalacheck.Prop.{ collect, classify }
import org.scalacheck.Arbitrary._

class ImplicitsSpec extends PropSpec with GeneratorDrivenPropertyChecks with Matchers {
    property("Any Int must be  equal to himself") {
    forAll { x: Int =>
      (x times) should be(x)
    }
  }

}