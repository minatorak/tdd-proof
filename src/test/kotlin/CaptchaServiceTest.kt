import org.junit.Assert
import org.junit.Test
import java.util.*

class CaptchaServiceTest {
    @Test
    fun toStringTest() {
        val mockRandomise = StubRandomizes()
        val spy007 = Captcha(mockRandomise.pattern, mockRandomise.operand, mockRandomise.operator, mockRandomise.operand)
        val captchaService = CaptchaService(spy007)
        Assert.assertEquals("One + 1", captchaService.getCaptcha())
    }

    class StubRandomizes : Randomizes(Random()) {

        override fun getPattern(): Int {
            return 1
        }

        override fun getOperator(): Int {
            return 1
        }

        override fun getOperand(): Int {
            return 1
        }
    }
}

