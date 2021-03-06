package com.blankj.androidutilcode.feature.core.toast

import android.os.Handler
import android.os.Looper
import android.support.annotation.StringRes
import android.widget.TextView
import android.widget.Toast

import com.blankj.androidutilcode.R
import com.blankj.androidutilcode.UtilsApp
import com.blankj.utilcode.util.ToastUtils

/**
 * <pre>
 * author: Blankj
 * blog  : http://blankj.com
 * time  : 2017/08/31
 * desc  : 自定义 Toast
</pre> *
 */
object CustomToast {

    private val HANDLER = Handler(Looper.getMainLooper())

    fun showShort(text: CharSequence) {
        show(text, Toast.LENGTH_SHORT)
    }

    fun showShort(@StringRes resId: Int) {
        show(resId, Toast.LENGTH_SHORT)
    }

    fun showShort(@StringRes resId: Int, vararg args: Any) {
        show(resId, Toast.LENGTH_SHORT, *args)
    }

    fun showShort(format: String, vararg args: Any) {
        show(format, Toast.LENGTH_SHORT, *args)
    }

    fun showLong(text: CharSequence) {
        show(text, Toast.LENGTH_LONG)
    }

    fun showLong(@StringRes resId: Int) {
        show(resId, Toast.LENGTH_LONG)
    }

    fun showLong(@StringRes resId: Int, vararg args: Any) {
        show(resId, Toast.LENGTH_LONG, *args)
    }

    fun showLong(format: String, vararg args: Any) {
        show(format, Toast.LENGTH_LONG, *args)
    }

    private fun show(@StringRes resId: Int, duration: Int) {
        show(UtilsApp.instance.resources.getString(resId), duration)
    }

    private fun show(@StringRes resId: Int, duration: Int, vararg args: Any) {
        show(String.format(UtilsApp.instance.resources.getString(resId), *args), duration)
    }

    private fun show(format: String, duration: Int, vararg args: Any) {
        show(text = String.format(format, *args), duration = duration)
    }

    private fun show(text: CharSequence, duration: Int) {
        HANDLER.post {
            val toastView: TextView
            if (duration == Toast.LENGTH_SHORT) {
                toastView = ToastUtils.showCustomShort(R.layout.toast_custom) as TextView
            } else {
                toastView = ToastUtils.showCustomLong(R.layout.toast_custom) as TextView
            }
            toastView.text = text
        }
    }

    fun cancel() {
        ToastUtils.cancel()
    }
}
