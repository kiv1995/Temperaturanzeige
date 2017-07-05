package shome.temperaturanzeige;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webViewTemp = (WebView) findViewById(R.id.view_temp);
        settings(webViewTemp);
        webViewTemp.loadUrl("http://kiv1995.ddns.net");
    }

    public void fensterAuf(View v){
        loadWebView("fenster_auf.php");
    }
    public void fensterZu(View v){
        loadWebView("fenster_zu.php");
    }
    public void loadWebView(String phpdoc){
        WebView web1 = (WebView) findViewById(R.id.webView);
        web1.loadUrl("http://" + getDomain() + "/" + getFolderString() + "/" + phpdoc);
    }
    public String getFolderString(){
        return "temp_yj3cp6gncub4wapk4ufc64hrc";
    }

    public String getDomain(){
        return "kiv1995.ddns.net";
    }
    public void settings(WebView view){
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(false);
        view.getSettings().setSupportZoom(false);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebSettings viewSettings = view.getSettings();
        viewSettings.setDomStorageEnabled(true);
    }
}
