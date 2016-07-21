package com.google.android.gms.internal;

import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class zzis
{
  public static zzis zzP(int paramInt)
  {
    if (paramInt >= 19) {
      return new zzis.zzg();
    }
    if (paramInt >= 18) {
      return new zzis.zze();
    }
    if (paramInt >= 17) {
      return new zzis.zzd();
    }
    if (paramInt >= 16) {
      return new zzis.zzf();
    }
    if (paramInt >= 14) {
      return new zzis.zzc();
    }
    if (paramInt >= 11) {
      return new zzis.zzb();
    }
    if (paramInt >= 9) {
      return new zzis.zza();
    }
    return new zzis();
  }
  
  public String getDefaultUserAgent(Context paramContext)
  {
    return "";
  }
  
  public boolean isAttachedToWindow(View paramView)
  {
    return (paramView.getWindowToken() != null) || (paramView.getWindowVisibility() != 8);
  }
  
  public Drawable zza(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    return new BitmapDrawable(paramContext.getResources(), paramBitmap);
  }
  
  public String zza(SslError paramSslError)
  {
    return "";
  }
  
  public void zza(View paramView, Drawable paramDrawable)
  {
    paramView.setBackgroundDrawable(paramDrawable);
  }
  
  public void zza(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeGlobalOnLayoutListener(paramOnGlobalLayoutListener);
  }
  
  public boolean zza(DownloadManager.Request paramRequest)
  {
    return false;
  }
  
  public boolean zza(Context paramContext, WebSettings paramWebSettings)
  {
    return false;
  }
  
  public boolean zza(Window paramWindow)
  {
    return false;
  }
  
  public zzjq zzb(zzjp paramzzjp, boolean paramBoolean)
  {
    return new zzjq(paramzzjp, paramBoolean);
  }
  
  public void zzb(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramActivity = paramActivity.getWindow();
    if ((paramActivity != null) && (paramActivity.getDecorView() != null) && (paramActivity.getDecorView().getViewTreeObserver() != null)) {
      zza(paramActivity.getDecorView().getViewTreeObserver(), paramOnGlobalLayoutListener);
    }
  }
  
  public Set zzf(Uri paramUri)
  {
    if (paramUri.isOpaque()) {
      return Collections.emptySet();
    }
    paramUri = paramUri.getEncodedQuery();
    if (paramUri == null) {
      return Collections.emptySet();
    }
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    int j = 0;
    int i;
    do
    {
      int k = paramUri.indexOf('&', j);
      i = k;
      if (k == -1) {
        i = paramUri.length();
      }
      int m = paramUri.indexOf('=', j);
      if (m <= i)
      {
        k = m;
        if (m != -1) {}
      }
      else
      {
        k = i;
      }
      localLinkedHashSet.add(Uri.decode(paramUri.substring(j, k)));
      i += 1;
      j = i;
    } while (i < paramUri.length());
    return Collections.unmodifiableSet(localLinkedHashSet);
  }
  
  public int zzhv()
  {
    return 0;
  }
  
  public int zzhw()
  {
    return 1;
  }
  
  public int zzhx()
  {
    return 5;
  }
  
  public ViewGroup.LayoutParams zzhy()
  {
    return new ViewGroup.LayoutParams(-2, -2);
  }
  
  public boolean zzi(zzjp paramzzjp)
  {
    if (paramzzjp == null) {
      return false;
    }
    paramzzjp.onPause();
    return true;
  }
  
  public boolean zzj(zzjp paramzzjp)
  {
    if (paramzzjp == null) {
      return false;
    }
    paramzzjp.onResume();
    return true;
  }
  
  public WebChromeClient zzk(zzjp paramzzjp)
  {
    return null;
  }
  
  public boolean zzm(View paramView)
  {
    return false;
  }
  
  public boolean zzn(View paramView)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzis
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */