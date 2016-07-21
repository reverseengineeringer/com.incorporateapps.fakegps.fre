package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.zzw;
import java.net.URI;
import java.net.URISyntaxException;

public class zzjy
  extends WebViewClient
{
  private final zzgo zzGs;
  private final String zzOl = zzaR(paramString);
  private boolean zzOm = false;
  private final zzjp zzpD;
  
  public zzjy(zzgo paramzzgo, zzjp paramzzjp, String paramString)
  {
    zzpD = paramzzjp;
    zzGs = paramzzgo;
  }
  
  private String zzaR(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return paramString;
      try
      {
        if (paramString.endsWith("/"))
        {
          String str = paramString.substring(0, paramString.length() - 1);
          return str;
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        zzin.e(localIndexOutOfBoundsException.getMessage());
      }
    }
    return paramString;
  }
  
  public void onLoadResource(WebView paramWebView, String paramString)
  {
    zzin.zzaI("JavascriptAdWebViewClient::onLoadResource: " + paramString);
    if (!zzaQ(paramString)) {
      zzpD.zzhU().onLoadResource(zzpD.getWebView(), paramString);
    }
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    zzin.zzaI("JavascriptAdWebViewClient::onPageFinished: " + paramString);
    if (!zzOm)
    {
      zzGs.zzge();
      zzOm = true;
    }
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    zzin.zzaI("JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + paramString);
    if (zzaQ(paramString))
    {
      zzin.zzaI("shouldOverrideUrlLoading: received passback url");
      return true;
    }
    return zzpD.zzhU().shouldOverrideUrlLoading(zzpD.getWebView(), paramString);
  }
  
  protected boolean zzaQ(String paramString)
  {
    paramString = zzaR(paramString);
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return false;
      try
      {
        Object localObject1 = new URI(paramString);
        if ("passback".equals(((URI)localObject1).getScheme()))
        {
          zzin.zzaI("Passback received");
          zzGs.zzgf();
          return true;
        }
        if (!TextUtils.isEmpty(zzOl))
        {
          Object localObject2 = new URI(zzOl);
          paramString = ((URI)localObject2).getHost();
          String str = ((URI)localObject1).getHost();
          localObject2 = ((URI)localObject2).getPath();
          localObject1 = ((URI)localObject1).getPath();
          if ((zzw.equal(paramString, str)) && (zzw.equal(localObject2, localObject1)))
          {
            zzin.zzaI("Passback received");
            zzGs.zzgf();
            return true;
          }
        }
      }
      catch (URISyntaxException paramString)
      {
        zzin.e(paramString.getMessage());
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */