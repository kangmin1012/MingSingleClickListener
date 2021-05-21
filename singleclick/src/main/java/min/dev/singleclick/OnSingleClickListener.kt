package min.dev.singleclick

import android.os.SystemClock
import android.view.View

@Suppress("PrivatePropertyName")
abstract class OnSingleClickListener(interval: Long): View.OnClickListener {
    private var MIN_CLICK_INTERVAL: Long = 0
    private var lastClickTime: Long = 0

    init {
        MIN_CLICK_INTERVAL = interval
    }

    override fun onClick(v: View?) {
        val currentClickTime = SystemClock.uptimeMillis()
        val elapsedTime = currentClickTime - lastClickTime
        lastClickTime = currentClickTime

        if (elapsedTime < MIN_CLICK_INTERVAL)
            return

        onSingleClick(v)
    }

    abstract fun onSingleClick(v: View?)
}