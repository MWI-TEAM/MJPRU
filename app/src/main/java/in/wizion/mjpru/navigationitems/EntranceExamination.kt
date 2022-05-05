package `in`.wizion.mjpru.navigationitems

import `in`.wizion.mjpru.R
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_entrance_examination.*


class EntranceExamination : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrance_examination)

        //to remove status bar
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }

        back_btn.setOnClickListener {
            super.onBackPressed()
        }

        val webSetting=webView.settings
        webSetting.javaScriptEnabled=true
        webView.loadUrl("https://entrance.mjpruonline.in/")
        webView.webViewClient= WebViewClient()
    }
}