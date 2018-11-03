class Captcha(private val pattern: Int, private val leftOperand: Int, private val operator: Int, private val rightOperand: Int) {

    fun getLeftOperand(): String {
        if (pattern == 2) return leftOperand.toString();
        val stringOperand: List<String> = listOf("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")
        return stringOperand[leftOperand - 1]
    }

    fun getOperator(): String {
        val operators = listOf("+", "*", "-")
        return operators[operator - 1]
    }

    fun getRightOperand(): String {
        return rightOperand.toString()
    }

}
