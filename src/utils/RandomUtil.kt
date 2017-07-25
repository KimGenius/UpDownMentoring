package utils

import java.util.*

object RandomUtil {
    var rand = Random()
    fun getRandom(startNum: Int, endNum: Int): Int {
        return rand.nextInt(endNum - startNum + 1) + startNum
    }
}