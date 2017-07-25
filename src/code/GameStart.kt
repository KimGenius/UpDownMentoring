package code

import utils.RandomUtil
import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    println("시작 범위를 설정하세요!")
    val startNum = scan.nextInt()
    println("끝 범위를 설정하세요!")
    val endNum = scan.nextInt()
    val randomNumber = RandomUtil.getRandom(startNum, endNum)
    var count = 0
    while (true) {
        println("맞춰보세요 ! : ")
        val num = scan.nextInt()
        count++
        if (num == randomNumber) break
        else {
            if (num < randomNumber) println("UP!")
            else println("DOWN!")
        }
    }
    println(message = """당신은 $count 번 만에 맞추셨습니다!""")
}
