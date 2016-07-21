package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Set;

class zzgb$1$1
  extends WebViewClient
{
  zzgb$1$1(zzgb.1 param1, WebView paramWebView) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    zzin.zzaI("Loading assets have finished");
    zzFv.zzFu.zzFr.remove(zztj);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    zzin.zzaK("Loading assets have failed.");
    zzFv.zzFu.zzFr.remove(zztj);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgb.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */