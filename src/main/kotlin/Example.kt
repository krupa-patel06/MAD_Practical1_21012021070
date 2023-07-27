class Student(var no:Int,var name:String){
    // var name : String="";
    init {
        println("class called")
    }
    // constructor(n:Int,s:String):this(n)
    //{
    //  println("class called")
    // name=s;
    //}
    init {
        println("class called")
    }
}
fun main()
{
    var s1 = Student(11111,"Student")
    println(s1.no);
    println(s1.name);
}
