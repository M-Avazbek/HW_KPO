/**
Задание 1: Сформировать целочисленный массив A из N элементов
при помощи ввода значений с клавиатуры (N вводит пользователь).
Вывести массив на экран. (1 балл)
 */



fun makeArray(n_value: Int):  Array<Int> {
    val arr = Array<Int> (n_value) {0}
    var i: Int = 0
    while (i < n_value) {
        print("Bведите число ${i+1}: ")
        arr[i] = readLine()!!.toInt()
        i += 1
    }
    return arr
}


/**
Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>): Array<Int> {
    val sortedList: Array<Int> = arr.sortedArray()
    return sortedList

}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    print("Введите значение N: ")
    val n_value:Int = readLine()!!.toInt()
    val arr = sortArrayDesc(makeArray(n_value))

    for (item in arr) print("${item} ")
}
