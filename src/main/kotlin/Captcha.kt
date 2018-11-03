class Captcha(private val pattern: Int, private val LeftOperand: Int,private val Operator: Int,private val RightOperand: Int) {

    fun getLeft(): String {
        if (LeftOperand == 5) return "Five"
        return "One"
    }

}
