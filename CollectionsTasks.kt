/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    val uniqueSet = mutableSetOf<String>()
    val result = mutableListOf<String>()

    for (element in array) {
        if (element in uniqueSet) {
            result.add("blahblah")
        } else {
            uniqueSet.add(element)
            result.add(element)
        }
    }

    return result
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    val words = text.split(" ")
    val uniqueSet = words.toSet()
    return uniqueSet.size
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = "apple banana apple orange"
    val count = uniqueWords(text)
    println(count)

    val modifiedList = replaceElements(text.split(' '))
    println(modifiedList)

}
