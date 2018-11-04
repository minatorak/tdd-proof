import org.junit.Assert
import org.junit.Test

class OperatorTest {
    @Test
    fun input_1_ShouldReturnPlus() {
        val operator = Operator(1)
        Assert.assertEquals("+", operator.getOperator())
    }

    @Test
    fun input_2_ShouldReturnMultiplier() {
        val operator = Operator(2)
        Assert.assertEquals("*", operator.getOperator())
    }

    @Test
    fun input_3_ShouldReturnMinus() {
        val operator = Operator(3)
        Assert.assertEquals("-", operator.getOperator())
    }
}
