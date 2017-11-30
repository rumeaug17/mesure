package org.agdf.mesure

trait Collector {
    def collect[F](name: String, result: F, durations: Seq[Long]): Result[F]
  }