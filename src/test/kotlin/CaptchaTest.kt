import org.junit.Assert
import org.junit.Test

class CaptchaTest {
    private val operatorDummy = 1
    private val rightOperandDummy = 1

    @Test
    fun firstPatternLeftShouldBeReturnOne() {
        val captcha = Captcha(1,1, operatorDummy, rightOperandDummy)
        Assert.assertEquals("One",captcha.getLeftOperand())
    }

    @Test
    fun firstPatternLeftShouldBeReturnFive() {
        val captcha = Captcha(1,5,operatorDummy,rightOperandDummy)
        Assert.assertEquals("Five",captcha.getLeftOperand())
    }

    @Test
    fun firstPatternLeftShouldBeReturnNine() {
        val captcha = Captcha(1,9,operatorDummy,rightOperandDummy)
        Assert.assertEquals("Nine",captcha.getLeftOperand())
    }
}
