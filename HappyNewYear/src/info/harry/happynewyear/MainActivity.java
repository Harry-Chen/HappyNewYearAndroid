/**
 * Modifier: Harry Chen
 * Modify Date: 2013.12.29
 */
package info.harry.happynewyear;

import java.util.Calendar;

import info.harry.happynewyear.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends Activity {

	private WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_fullscreen);
		webView = (WebView) this.findViewById(R.id.webView);
		webView.loadUrl("file:///android_asset/wait.html");
		webView.getSettings().setJavaScriptEnabled(true);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		webView.destroy();
	}

	@Override
	protected void onStop() {
		super.onStop();
		if (Calendar.getInstance().get(Calendar.YEAR) >= 2014)
			Toast.makeText(this, R.string.wish_toast, Toast.LENGTH_LONG).show();
	}
}
