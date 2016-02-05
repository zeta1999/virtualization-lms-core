package scala.virtualization.lms
package internal

import scala.collection.{immutable,mutable}
import scala.reflect._

trait AbstractAnalyzer extends Traversal
trait IterativeAnalyzer extends AbstractAnalyzer with IterativeTraversal

trait Analyzing extends MetadataExp { self =>
  type Analyzer = Traversal { val IR: self.type }

  var analyzers: Map[Datakey[_], Analyzer] = Map.empty
  var validData: List[Datakey[_]] = Nil
}