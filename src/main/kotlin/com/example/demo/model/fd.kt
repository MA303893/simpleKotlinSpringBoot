package com.example.demo.model

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.regex.*

object Solution {

    private val scanner = Scanner(System.`in`)

    fun rotateLeft(items: IntArray, times: Int): IntArray {
        val len = items.size
        if (len == times) {
            return items
        }
        val sub1 = Arrays.copyOfRange(items, 0, times)
        val sub2 = Arrays.copyOfRange(items, times, len)
        val result = IntArray(len)
        System.arraycopy(sub2, 0, result, 0, sub2.size)
        System.arraycopy(sub1, 0, result, sub2.size, sub1.size)
        return result
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val nd = scanner.nextLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

        val n = Integer.parseInt(nd[0])

        val d = Integer.parseInt(nd[1])

        val a = IntArray(n)

        val aItems = scanner.nextLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")

        for (i in 0 until n) {
            val aItem = Integer.parseInt(aItems[i])
            a[i] = aItem
        }

        scanner.close()

        val res = rotateLeft(a, d)
        for (i in res) {
            print(i)
            print(" ")
        }
    }
}