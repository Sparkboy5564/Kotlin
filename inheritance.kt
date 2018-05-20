//shape interface ..

interface Shape 
{
    var side: Int
    var name: String
    
    fun getside(): Int{
        return side
    }
    
    fun getNameOfShape(): String
    {
        return name
    }
    
    fun printSide(): Unit
    
    fun area(): Int
    
}

// inheriting class

class Triangle(var side1: Int, var base: Int, var side2: Int) : Shape
{
    override var side = 3
    override var name = "Triangle"
    
    override fun area(): Int
    {
        var temp = base * side1; temp = temp /2
        return temp
    }
    
    override fun printSide(): Unit{
        println("Side 1: $side1, Base: $base, Side 2: $side2")
    }
   
}


class Square(var sides: Int): Shape
{
    override var side = 4
    override var name = "Square"
    
    override fun printSide(): Unit{
        println("A Square has 4 equal sides. the side has a value of $sides")
    }
    
    override fun area(): Int
    {
        var result = sides * sides
        return result
    }
    
    
}

// main function
fun main(args: Array<String>)
{
    var triangle = Triangle(10,10,10)
    triangle.printSide()
    println(triangle.area())
    println(triangle.getside())
    println(triangle.getNameOfShape())
    
    println()
    println("For square ")
    
    var square = Square(10)
    square.printSide()
    println(square.area())
    println(square.getside())
    println(square.getNameOfShape())
}
