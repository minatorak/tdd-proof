class CaptchaService(private val captcha: Captcha) {

    fun getCaptcha(): String {
        return captcha.toString()
    }
}
