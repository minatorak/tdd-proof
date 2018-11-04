open class Captcha(private val pattern: Int, private val leftOperand: Int, private val operator: Int, private val rightOperand: Int) {

    private val stringOperand: List<String> = listOf("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")
    private val outScope = "Not support"

    fun getLeftOperand(): String = when (pattern) {
        1 -> stringOperand[leftOperand - 1]
        2 -> leftOperand.toString()
        else -> outScope
    }

    fun getOperator(): String = Operator(operator).getOperator()

    fun getRightOperand(): String = when (pattern) {
        1 -> rightOperand.toString()
        2 -> stringOperand[rightOperand - 1]
        else -> outScope
    }

    override fun toString(): String = "${getLeftOperand()} ${getOperator()} ${getRightOperand()}"
}
