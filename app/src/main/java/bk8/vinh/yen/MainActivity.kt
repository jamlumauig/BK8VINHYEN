package bk8.vinh.yen

import android.net.Uri
import android.os.Bundle
import com.wishland.soler.ui.AdsActivity
import com.wishland.soler.ui.WebViewActivity

class MainActivity : AdsActivity("BK8VINHYEN") {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onAdsLinkLoaded(adsLink: String) {
        startActivity(WebViewActivity.createIntent(this, adsLink))
        finish()
    }
    private val uri: Uri = Uri.parse("file:///android_asset/tennis.html")
    override fun onAdsFallback() {
        startActivity(WebViewActivity.createIntent(this, uri.toString()))
        finish()
    }
}