/**
 * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
 * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
 * для вывода информации о фигуре на экран.
 *
 * (3 балла)
 */

open class Point(val X: Double, val Y: Double) {
    open val area: Double
        get() = 0.0

    open fun display() {
        println("S = $area , X = $X , Y = $Y")
    }
}

class Circle(X: Double, Y: Double, val radius: Double) : Point(X, Y) {
    override val area: Double
        get() = kotlin.math.PI * radius * radius
}

class Square(X: Double, Y: Double, val sideLength: Double) : Point(X, Y) {
    override val area: Double
        get() = sideLength * sideLength
}

fun main() {
    val p = Point(34.0, 56.0)
    val c = Circle(46.0, 34.0, 7.0)
    val s = Square(46.0, 34.0, 8.0)
    p.display()
    c.display()
    s.display()
}
