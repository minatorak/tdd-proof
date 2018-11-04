
class Operator(private val operator: Int) {
    fun getOperator(): String {
        if (operator == 1) return "+"
        if (operator == 2) return "*"
        return "-"
    }
}