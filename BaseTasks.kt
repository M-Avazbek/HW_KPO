import kotlin.math.*

/**
Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
(0.5 балла)
Формат вывода:
" Фамилия:
Имя:
Отчество:
"
 */
fun askForInput() {
    print("Введите Фамилию: ")
    val lastName = readLine()

    print("Введите Имя: ")
    val firstName = readLine()

    print("Введите Отчество: ")
    val middleName = readLine()

    println("Фамилия: $lastName\nИмя: $firstName\nОтчество: $middleName")
}


/**
Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    val discriminant = b * b - 4 * a * c
    val sqrtD = sqrt(discriminant)

    val root1 = (-b + sqrtD) / (2 * a)
    val root2 = (-b - sqrtD) / (2 * a)

    return root1 to root2
}


/**
Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
(2 балла)
 */
fun printSameDigitNumbers() {
    for (number in 100 until 1000) {
        val digits = number.toString().toSet()
        if (digits.size == 1) {
            println(number)
        }
    }
}


// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first} ; X2 =${roots.second}")

    printSameDigitNumbers()
}
