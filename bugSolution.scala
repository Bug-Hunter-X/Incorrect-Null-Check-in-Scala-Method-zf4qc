```scala
class MyClass(val value: Int) {
  def myMethod(other: MyClass): Int = {
    if (other == null) 0 
    else value + other.value
  }
}
```