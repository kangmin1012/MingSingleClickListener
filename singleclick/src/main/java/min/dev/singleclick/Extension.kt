package min.dev.singleclick

import android.view.View

fun View.mingSingleClickListener(interval: Long = 500, onSingleClick: (v: View?) -> Unit) {
    this.setOnClickListener(object : OnSingleClickListener(interval) {
        override fun onSingleClick(v: View?) {
            onSingleClick(v)
        }
    })
}