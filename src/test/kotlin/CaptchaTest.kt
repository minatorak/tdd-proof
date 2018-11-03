import org.junit.Assert
import org.junit.Test

class CaptchaTest {
    private val operatorDummy = 1
    private val rightOperandDummy = 1
    private val patternDummy = 1
    private val leftOperandDummy = 1

    @Test
    fun firstPatternLeftShouldBeReturnOne() {
        val captcha = Captcha(1, 1, operatorDummy, rightOperandDummy)
        Assert.assertEquals("One", captcha.getLeftOperand())
    }

    @Test
    fun firstPatternLeftShouldBeReturnFive() {
        val captcha = Captcha(1, 5, operatorDummy, rightOperandDummy)
        Assert.assertEquals("Five", captcha.getLeftOperand())
    }

    @Test
    fun firstPatternLeftShouldBeReturnNine() {
        val captcha = Captcha(1, 9, operatorDummy, rightOperandDummy)
        Assert.assertEquals("Nine", captcha.getLeftOperand())
    }

    @Test
    fun secondPatternLeftShouldBeReturn_1() {
        val captcha = Captcha(2, 1, operatorDummy, rightOperandDummy)
        Assert.assertEquals("1", captcha.getLeftOperand())
    }

    @Test
    fun secondPatternLeftShouldBeReturn_5() {
        val captcha = Captcha(2, 5, operatorDummy, rightOperandDummy)
        Assert.assertEquals("5", captcha.getLeftOperand())
    }

    @Test
    fun secondPatternLeftShouldBeReturn_9() {
        val captcha = Captcha(2, 9, operatorDummy, rightOperandDummy)
        Assert.assertEquals("9", captcha.getLeftOperand())
    }

    @Test
    fun operator_1_ShouldBeReturnPlus() {
        val captcha = Captcha(patternDummy, leftOperandDummy, 1, rightOperandDummy)
        Assert.assertEquals("+", captcha.getOperator())
    }

    @Test
    fun operator_2_ShouldBeReturnMultiplier() {
        val captcha = Captcha(patternDummy, leftOperandDummy, 2, rightOperandDummy)
        Assert.assertEquals("*", captcha.getOperator())
    }

    @Test
    fun operator_3_ShouldBeReturnMinus() {
        val captcha = Captcha(patternDummy, leftOperandDummy, 3, rightOperandDummy)
        Assert.assertEquals("-", captcha.getOperator())
    }

    @Test
    fun firstPatternRightShouldBeReturn_1() {
        val captcha = Captcha(1, leftOperandDummy, operatorDummy, 1)
        Assert.assertEquals("1", captcha.getRightOperand())
    }

    @Test
    fun firstPatternRightShouldBeReturn_5() {
        val captcha = Captcha(1, leftOperandDummy, operatorDummy, 5)
        Assert.assertEquals("5", captcha.getRightOperand())
    }

    @Test
    fun firstPatternRightShouldBeReturn_9() {
        val captcha = Captcha(1, leftOperandDummy, operatorDummy, 9)
        Assert.assertEquals("9", captcha.getRightOperand())
    }

    @Test
    fun secondPatternRightShouldBeReturnOne() {
        val captcha = Captcha(2, leftOperandDummy, operatorDummy, 1)
        Assert.assertEquals("One", captcha.getRightOperand())
    }

    @Test
    fun secondPatternRightShouldBeReturnFive() {
        val captcha = Captcha(2, leftOperandDummy, operatorDummy, 5)
        Assert.assertEquals("Five", captcha.getRightOperand())
    }

    @Test
    fun secondPatternRightShouldBeReturnNine() {
        val captcha = Captcha(2, leftOperandDummy, operatorDummy, 9)
        Assert.assertEquals("Nine", captcha.getRightOperand())
    }
}
