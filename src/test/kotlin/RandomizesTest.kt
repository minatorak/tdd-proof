import org.junit.Assert
import org.junit.Test
import java.util.*

class RandomizesTest {
    @Test
    fun getPatternShouldBeOneCallRandomNextInt() {
        val spy007Random = Spy007Random(0)
        val randomizes = Randomizes(spy007Random)
        randomizes.randomPattern
        Assert.assertTrue(spy007Random.verifyThatNextIntHaveBeenOneCall())
    }

    @Test
    fun getPatternShouldBeReturn_1() {
        val spy007Random = Spy007Random(0)
        val random = Randomizes(spy007Random)
        Assert.assertEquals(1, random.randomPattern)
    }

    @Test
    fun getPatternShouldBeReturn_2() {
        val spy007Random = Spy007Random(1)
        val random = Randomizes(spy007Random)
        Assert.assertEquals(2, random.randomPattern)
    }

    class Spy007Random(private val mockNextInt: Int) : Random() {
        private var token: Int = 0

        override fun nextInt(bound: Int): Int {
            token += 1
            return mockNextInt
        }

        fun verifyThatNextIntHaveBeenOneCall(): Boolean {
            return token == 1
        }
    }
}
