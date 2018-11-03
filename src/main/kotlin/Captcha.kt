class Captcha(private val pattern: Int, private val LeftOperand: Int,private val Operator: Int,private val RightOperand: Int) {

    fun getLeftOperand(): String {
        if (LeftOperand == 9) return "Nine"
        if (LeftOperand == 5) return "Five"
        return "One"
    }

}
