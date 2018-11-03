import org.junit.Assert
import org.junit.Test

class CaptchaTest {
    @Test
    fun firstPatternLeftShouldBeReturnOne() {
        val captcha = Captcha(1,1,1,1)
        Assert.assertEquals("One",captcha.getLeft())
    }

    @Test
    fun firstPatternLeftShouldBeReturnFive() {
        val captcha = Captcha(1,5,1,1)
        Assert.assertEquals("Five",captcha.getLeft())
    }


}
