class CaptchaService(private val randomizes: Randomizes) {

    fun getCaptcha(): String {
        return Captcha(randomizes.pattern, randomizes.operand, randomizes.operator, randomizes.operand).toString()
    }
}
