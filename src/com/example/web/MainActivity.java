package com.example.web;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Remove notification bar.
				 this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				            WindowManager.LayoutParams.FLAG_FULLSCREEN);
				
				WebView webView = (WebView) findViewById(R.id.Web1);
				webView.setWebViewClient(new WebViewClient());// retira o navegador google
				webView.getSettings().setJavaScriptEnabled(true);// ativa o javascript
				webView.getSettings().setDomStorageEnabled(true);// ativa o cash da pagina
				webView.loadUrl("https://login.kasadecora.com.br/");
	}
}
