package com.google.android.gms.internal;

import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.io.File;
import java.util.Set;

public class zzis$zzb
  extends zzis.zza
{
  public boolean zza(DownloadManager.Request paramRequest)
  {
    paramRequest.allowScanningByMediaScanner();
    paramRequest.setNotificationVisibility(1);
    return true;
  }
  
  public boolean zza(Context paramContext, WebSettings paramWebSettings)
  {
    super.zza(paramContext, paramWebSettings);
    if ((File)zzjb.zzb(new zzis.zzb.1(this, paramContext)) != null)
    {
      paramWebSettings.setAppCachePath(paramContext.getCacheDir().getAbsolutePath());
      paramWebSettings.setAppCacheMaxSize(0L);
      paramWebSettings.setAppCacheEnabled(true);
    }
    paramWebSettings.setDatabasePath(paramContext.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
    paramWebSettings.setDatabaseEnabled(true);
    paramWebSettings.setDomStorageEnabled(true);
    paramWebSettings.setDisplayZoomControls(false);
    paramWebSettings.setBuiltInZoomControls(true);
    paramWebSettings.setSupportZoom(true);
    paramWebSettings.setAllowContentAccess(false);
    return true;
  }
  
  public boolean zza(Window paramWindow)
  {
    paramWindow.setFlags(16777216, 16777216);
    return true;
  }
  
  public zzjq zzb(zzjp paramzzjp, boolean paramBoolean)
  {
    return new zzjw(paramzzjp, paramBoolean);
  }
  
  public Set zzf(Uri paramUri)
  {
    return paramUri.getQueryParameterNames();
  }
  
  public WebChromeClient zzk(zzjp paramzzjp)
  {
    return new zzjv(paramzzjp);
  }
  
  public boolean zzm(View paramView)
  {
    paramView.setLayerType(0, null);
    return true;
  }
  
  public boolean zzn(View paramView)
  {
    paramView.setLayerType(1, null);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzis.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */