```scala
class MyClass(val value: Int) {
  def myMethod(other: MyClass): Int = {
    if (other eq null) 0  //This is wrong, it should be other == null 
    else value + other.value
  }
}
```