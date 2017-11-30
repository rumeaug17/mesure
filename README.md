# mesure
little and simple benchmark tool for scala

Usage :

```scala
import org.agdf.mesure._
import org.agdf.mesure.Implicits._

val m1 = Mesure { code1 } named "Code 1" looping (10 times) ignoring (1 times) collect Average
val m2 = Mesure { code2 } named "Code 2" looping (10 times) ignoring (1 times) collect FullStats

Mesure.fancyPrint(m1, m2)("Average")
```

Output example with some Fibonacci implementations :

```
***** *****              Another mutable memoiza. | Mutable memoization (wa. |              Lazy stream |               Imperative |           Tail recursive | Immuable memoization (w. | State monad memoization. |                    Naive
Variation factor                           122,47 |                   136,28 |                   238,17 |                    13,44 |                    14,01 |                    11,32 |                    11,47 |                     2,70
Interquartile distance                       1,00 |                     1,00 |                     0,00 |                     5,00 |                     1,00 |                    31,00 |                    36,00 |                    16,00
Last decile                                  1,00 |                     2,00 |                    16,00 |                    46,00 |                    78,00 |                   237,00 |                   342,00 |                  2200,00
Variation interval 2                       100,00 |                    95,00 |                    85,00 |                    90,00 |                    95,00 |                    90,00 |                    90,00 |                    90,00
First quartile                               0,00 |                     0,00 |                     0,00 |                    31,00 |                    62,00 |                   173,00 |                   257,00 |                  2044,00
Variation interval 1                        60,00 |                    90,00 |                    85,00 |                    85,00 |                    75,00 |                    75,00 |                    75,00 |                    90,00
Population                                  20,00 |                    20,00 |                    20,00 |                    20,00 |                    20,00 |                    20,00 |                    20,00 |                    20,00
Last quartile                                1,00 |                     1,00 |                     0,00 |                    36,00 |                    63,00 |                   204,00 |                   293,00 |                  2060,00
Total                                        8,00 |                    14,00 |                    47,00 |                   692,00 |                  1233,00 |                  3813,00 |                  5549,00 |                 41384,00
Standard deviation                           0,49 |                     0,95 |                     5,60 |                     4,65 |                     8,64 |                    21,58 |                    31,83 |                    55,94
Average                                      0,40 |                     0,70 |                     2,35 |                    34,60 |                    61,65 |                   190,65 |                   277,45 |                  2069,20
First decile                                 0,00 |                     0,00 |                     0,00 |                    31,00 |                    47,00 |                   171,00 |                   249,00 |                  2042,00
Maximum                                      1,00 |                     4,00 |                    16,00 |                    47,00 |                    84,00 |                   239,00 |                   351,00 |                  2248,00
Interdecile distance                         1,00 |                     2,00 |                    16,00 |                    15,00 |                    31,00 |                    66,00 |                    93,00 |                   158,00
Median                                       0,00 |                     1,00 |                     0,00 |                    35,00 |                    62,00 |                   188,00 |                   265,00 |                  2046,00
Minimum                                      0,00 |                     0,00 |                     0,00 |                    27,00 |                    46,00 |                   157,00 |                   233,00 |                  2014,00
Variance                                     0,24 |                     0,91 |                    31,33 |                    21,64 |                    74,63 |                   465,63 |                  1012,95 |                  3129,56
```
