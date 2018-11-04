import org.junit.Assert
import org.junit.Test
import java.util.*

class CaptchaServiceTest {
    @Test
    fun toStringTest() {
        val stubRandomise = StubRandomizes()
        val captchaService = CaptchaService(stubRandomise)
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

