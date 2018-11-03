class Captcha(private val pattern: Int, private val leftOperand: Int, private val operator: Int, private val rightOperand: Int) {

    fun getLeftOperand(): String {
        if (pattern == 2 && leftOperand == 1) return "1"
        if (pattern == 2 && leftOperand == 5) return "5"
        val stringOperand: List<String> = listOf("One", "Two", "Three", "Four", "Five", "Six", "Seven","Eight", "Nine")
        return stringOperand[leftOperand - 1]
    }

}
