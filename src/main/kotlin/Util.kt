fun exampleOf(title: String, function: () -> Unit) {
    println(title)
    function.invoke()
}