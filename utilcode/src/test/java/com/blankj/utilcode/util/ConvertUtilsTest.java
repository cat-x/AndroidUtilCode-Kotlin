package com.blankj.utilcode.util;


import com.blankj.utilcode.constant.MemoryConstants;
import com.blankj.utilcode.constant.TimeConstants;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2016/08/13
 *     desc  : ConvertUtils 单元测试
 * </pre>
 */
public class ConvertUtilsTest {

    private byte[] mBytes    = new byte[]{0x00, 0x08, (byte) 0xdb, 0x33, 0x45, (byte) 0xab, 0x02, 0x23};
    private String hexString = "0008DB3345AB0223";

    private char[] mChars1 = new char[]{'0', '1', '2'};
    private byte[] mBytes1 = new byte[]{48, 49, 50};

    @Test
    public void bytes2HexString() throws Exception {
        assertEquals(
                hexString,
                ConvertUtils.Companion.bytes2HexString(mBytes)
        );
    }

    @Test
    public void hexString2Bytes() throws Exception {
        assertTrue(
                Arrays.equals(
                        mBytes,
                        ConvertUtils.Companion.hexString2Bytes(hexString)
                )
        );
    }

    @Test
    public void chars2Bytes() throws Exception {
        assertTrue(
                Arrays.equals(
                        mBytes1,
                        ConvertUtils.Companion.chars2Bytes(mChars1)
                )
        );
    }

    @Test
    public void bytes2Chars() throws Exception {
        assertTrue(
                Arrays.equals(
                        mChars1,
                        ConvertUtils.Companion.bytes2Chars(mBytes1)
                )
        );
    }

    @Test
    public void byte2MemorySize() throws Exception {
        assertEquals(
                1024,
                ConvertUtils.Companion.byte2MemorySize(MemoryConstants.INSTANCE.getGB(), MemoryConstants.INSTANCE.getMB()),
                0.001
        );
    }

    @Test
    public void byte2FitMemorySize() throws Exception {
        assertEquals(
                "3.098MB",
                ConvertUtils.Companion.byte2FitMemorySize(1024 * 1024 * 3 + 1024 * 100)
        );
    }

    @Test
    public void millis2FitTimeSpan() throws Exception {
        long millis = 6 * TimeConstants.INSTANCE.getDAY()
                + 6 * TimeConstants.INSTANCE.getHOUR()
                + 6 * TimeConstants.INSTANCE.getMIN()
                + 6 * TimeConstants.INSTANCE.getSEC()
                + 6;
        assertEquals(
                "6天6小时6分钟6秒6毫秒",
                ConvertUtils.Companion.millis2FitTimeSpan(millis, 7)
        );
        assertEquals(
                "6天6小时6分钟6秒",
                ConvertUtils.Companion.millis2FitTimeSpan(millis, 4)
        );
        assertEquals(
                "6天6小时6分钟",
                ConvertUtils.Companion.millis2FitTimeSpan(millis, 3)
        );
        assertEquals(
                "25天24分钟24秒24毫秒",
                ConvertUtils.Companion.millis2FitTimeSpan(millis * 4, 5)
        );
    }

    @Test
    public void bytes2Bits_bits2Bytes() throws Exception {
        assertEquals(
                "0111111111111010",
                ConvertUtils.Companion.bytes2Bits(new byte[]{0x7F, (byte) 0xFA})
        );
        assertEquals(
                "0111111111111010",
                ConvertUtils.Companion.bytes2Bits(ConvertUtils.Companion.bits2Bytes("111111111111010"))
        );
    }

    @Test
    public void inputStream2Bytes_bytes2InputStream() throws Exception {
        String string = "this is test string";
        assertTrue(
                Arrays.equals(
                        string.getBytes("UTF-8"),
                        ConvertUtils.Companion.inputStream2Bytes(ConvertUtils.Companion.bytes2InputStream(string.getBytes("UTF-8")))
                )
        );
    }

    @Test
    public void inputStream2String_string2InputStream() throws Exception {
        String string = "this is test string";
        assertEquals(
                string,
                ConvertUtils.Companion.inputStream2String(ConvertUtils.Companion.string2InputStream(string, "UTF-8"), "UTF-8")
        );
    }
}