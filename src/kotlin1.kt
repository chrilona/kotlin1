fun main(){
    name()
    text("grace",54)
    println(two(30,6))
    println(one())
}
fun one() {
    var statement = "CodeHive"
    var x =statement[4]

    println(x)

}

fun two( x:Int, y:Int): Int {
    var div = 30/6
    return div

}
fun  text(name:String,age:Int) {
    println("My name is $name and iam $age years old")

}

fun name(){
    var title ="When is today?"
    println(title.length)
}