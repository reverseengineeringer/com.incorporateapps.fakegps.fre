package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

class zzbf$2
  implements Runnable
{
  ValueCallback zzth = new zzbf.2.1(this);
  
  zzbf$2(zzbf paramzzbf, zzbc paramzzbc, WebView paramWebView, boolean paramBoolean) {}
  
  public void run()
  {
    if (zztj.getSettings().getJavaScriptEnabled()) {}
    try
    {
      zztj.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zzth);
      return;
    }
    catch (Throwable localThrowable)
    {
      zzth.onReceiveValue("");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbf.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */