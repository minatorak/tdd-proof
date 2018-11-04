import org.junit.Assert
import org.junit.Test
import java.util.*

class RandomizesTest {
    @Test
    fun getPatternShouldBeOneCallRandomNextInt() {
        val spy007Random = Spy007Random()
        val randomizes = Randomizes(spy007Random)
        randomizes.randomPattern
        Assert.assertTrue(spy007Random.verifyThatNextIntHaveBeenOneCall())
    }

    @Test
    fun getOperandShouldBeOneCallRandom() {
        val spy007Random = Spy007Random()
        val random = Randomizes(spy007Random)
        random.operand
        Assert.assertTrue(spy007Random.verifyThatNextIntHaveBeenOneCall())
    }

    @Test
    fun getOperatorShouldBeOneCallRandom() {
        val spy007Random = Spy007Random()
        val random = Randomizes(spy007Random)
        random.operator
        Assert.assertTrue(spy007Random.verifyThatNextIntHaveBeenOneCall())
    }

    class Spy007Random : Random() {
        private var token: Int = 0

        override fun nextInt(bound: Int): Int {
            token += 1
            return 0
        }

        fun verifyThatNextIntHaveBeenOneCall(): Boolean {
            return token == 1
        }
    }
}
