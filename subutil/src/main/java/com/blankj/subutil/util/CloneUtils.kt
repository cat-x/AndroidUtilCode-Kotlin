package com.blankj.subutil.util

import java.io.*

/**
 * <pre>
 * author: Blankj
 * blog  : http://blankj.com
 * time  : 2018/01/30
 * desc  : 克隆相关工具类
</pre> *
 */
object CloneUtils {

    fun <T> deepClone(data: Serializable?): T? {
        return if (data == null) null else bytes2Object(serializable2Bytes(data as Serializable?)) as T?
    }

    private fun serializable2Bytes(serializable: Serializable?): ByteArray? {
        if (serializable == null) return null
        var baos: ByteArrayOutputStream? = null
        var oos: ObjectOutputStream? = null
        return try {
            baos = ByteArrayOutputStream()
            oos = ObjectOutputStream(baos)
            oos.writeObject(serializable)
            baos.toByteArray()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        } finally {
            try {
                oos?.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }

        }
    }

    private fun bytes2Object(bytes: ByteArray?): Any? {
        if (bytes == null) return null
        var ois: ObjectInputStream? = null
        return try {
            ois = ObjectInputStream(ByteArrayInputStream(bytes))
            ois.readObject()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        } finally {
            try {
                ois?.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }

        }
    }
}
