class Captcha(private val pattern: Int, private val leftOperand: Int, private val operator: Int, private val rightOperand: Int) {

    private val stringOperand: List<String> = listOf("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")

    fun getLeftOperand(): String {
        if (pattern == 2) return leftOperand.toString()
        return stringOperand[leftOperand - 1]
    }

    fun getOperator(): String {
        val operators = listOf("+", "*", "-")
        return operators[operator - 1]
    }

    fun getRightOperand(): String {
        if (pattern == 2) {
            if (rightOperand == 1) return "One"
            if (rightOperand == 5) return "Five"
            if (rightOperand == 9) return "Nine"
        }
        return rightOperand.toString()
    }

}
