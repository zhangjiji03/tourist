package com.qbk.data.algorithm;

/**
 * 位运算
 *
 *  &	与	两个位都为1时，结果才为1
 *  |	或	两个位都为0时，结果才为0
 *  ^	异或	两个位相同为0，相异为1
 *  ~	取反	0变1，1变0
 *  <<	左移	各二进位全部左移若干位，高位丢弃，低位补0
 *  >>	右移	各二进位全部右移若干位，对无符号数，高位补0，有符号数，各编译器处理方法不一样，有的补符号位（算术右移），有的补0（逻辑右移）
 *
 */
public class BitOperation {

    private static byte sequenceOffset;

    public static void main(String[] args) {

        //sequenceOffset = 1;

        //0
        System.out.println(sequenceOffset);

        // ~0 & 1 = 1
        // ~1 & 1 = 0
        sequenceOffset = (byte) (~sequenceOffset & 1);

        System.out.println(sequenceOffset);
    }
}
