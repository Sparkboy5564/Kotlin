// simple stack creation
// 
class Stack
{
    private var count: Int = 0
    private val stack: MutableList<Int> = mutableListOf()
    
    fun push(int: Int)
    {
        stack.add(int)
        count++
    }
    fun top():Int
    {
        var temp: Int
        temp = count
        return stack[temp-1]
    }
    fun size(): Int
    {
        return count
    }
    
    fun pop()
    {
        if (count == 0){
            println("Empty stack!")
        }
        else
        {
            count --
        }
    }
}

fun main(args: Array<String>)
{
    var stack = Stack()
    stack.push(10)
    stack.push(20)
    stack.push(30)
    stack.push(44)
    
    println(stack.top())
    stack.pop()
    println(stack.top())
    stack.pop()
    println(stack.size())
    println(stack.top())
    stack.pop()
    println(stack.top())
    stack.pop()
    stack.pop()
    
}
