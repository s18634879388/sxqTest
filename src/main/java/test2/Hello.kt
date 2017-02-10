package test2

/**
 * Created by Administrator on 2016/10/19.
 */

fun main(args:Array<String>){
    println("=====================")
    var a:Int=max(1,2);
    println("The Max Number is ${a}")
    round()
    round1()
    whenExample(1L)
    rangesExample(100,10)

    println(mapExample())

//    if(args.size==0)
//        return
//    else
//    print("Hello word!${args[0]}")
}
//if 判断
fun max(a:Int,b:Int):Int{
    if(a>b)
        return a
    else
        return b
}
//返回可空变量
fun parseInrt(str:String):Int?{
    return null
}
//for循环
fun round(){
    var a :Array<Int> = arrayOf(1,5,6)
    for(x in a)
        println("x is ${x}")
}
//while 循环
fun round1(){
    var i:Int = 1
    while(i<5) {
        println("while i is ${i}")
        i = i + 1
    }
}
//when表达式
fun whenExample(obj:Any){
    when(obj){
        1 -> println("this is 1")
        "one" -> println("this is one")
        is Long ->println("Long")
    }
}
//ranges
fun rangesExample(a:Int,b:Int){
    if(a in 1..b){
        println("yes!")
    }else{
        println("No!")
    }
}

fun mapExample():Map<String,Int?>{
//    var timestamp : Integer?;
    return mapOf( "timestamp" to null, "limit" to 5)
}
