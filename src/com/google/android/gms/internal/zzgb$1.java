package com.google.android.gms.internal;

import android.webkit.WebView;
import java.util.Set;

class zzgb$1
  implements Runnable
{
  zzgb$1(zzgb paramzzgb, String paramString1, String paramString2) {}
  
  public void run()
  {
    WebView localWebView = zzFu.zzfR();
    localWebView.setWebViewClient(new zzgb.1.1(this, localWebView));
    zzFu.zzFr.add(localWebView);
    localWebView.loadDataWithBaseURL(zzFs, zzFt, "text/html", "UTF-8", null);
    zzin.zzaI("Fetching assets finished.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgb.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */