fun main(args: Array<String>) {
    val array = intArrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3)
    val n = array.size
    var temp = 0
    for (i in 0 until n)
    {
        println("Действие"+ (i+i))
    for (j in 1 until n -i){
        println("Сравнения"+ array[j-1]+ "и"+array[j])
       if(array[j-1]>array[j]){
           temp = array[j-1]
           array[j-1] = array[j]
           array[j] = temp
           println(array[j].toString() + "больше, чем " + array[j-1])
           println("Замена элементов: Новый массив после замены")
           println(array.contentToString())
       }
    }
    }
}



