import org.junit.Assert
import org.junit.Test

class RandomizesTest {
    @Test
    fun getPatternShouldBeReturn1or2() {
        val randomizes = Randomizes()
        Assert.assertTrue(randomizes.randomPattern < 3)
        Assert.assertTrue(randomizes.randomPattern > 0)
    }

}