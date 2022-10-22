fun main(){
    some{
        println("Welcome to the session")
    }
}

fun some(block : ()-> Unit){
    block()
}
