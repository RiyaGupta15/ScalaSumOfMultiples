object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    var result: Set[Int] = Set()
    for(i <- 1 until limit) {
      for(number <- factors) {
        if(i%number == 0) {
          result = result.+(i)
        }
      }
    }
    result.sum
  }
}

