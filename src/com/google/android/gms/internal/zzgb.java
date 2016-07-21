package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class zzgb
  implements zzfz
{
  private final Context mContext;
  final Set zzFr = Collections.synchronizedSet(new HashSet());
  
  public zzgb(Context paramContext)
  {
    mContext = paramContext;
  }
  
  public void zza(String paramString1, String paramString2, String paramString3)
  {
    zzin.zzaI("Fetching assets for the given html");
    zzir.zzMc.post(new zzgb.1(this, paramString2, paramString3));
  }
  
  public WebView zzfR()
  {
    WebView localWebView = new WebView(mContext);
    localWebView.getSettings().setJavaScriptEnabled(true);
    return localWebView;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */