package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.View.MeasureSpec;
import android.webkit.WebView;

public final class zzgo$zza
  extends AsyncTask
{
  private final WebView zzGp;
  private Bitmap zzGq;
  
  public zzgo$zza(zzgo paramzzgo, WebView paramWebView)
  {
    zzGp = paramWebView;
  }
  
  protected final void onPreExecute()
  {
    try
    {
      zzGq = Bitmap.createBitmap(zzgo.zza(zzGr), zzgo.zzb(zzGr), Bitmap.Config.ARGB_8888);
      zzGp.setVisibility(0);
      zzGp.measure(View.MeasureSpec.makeMeasureSpec(zzgo.zza(zzGr), 0), View.MeasureSpec.makeMeasureSpec(zzgo.zzb(zzGr), 0));
      zzGp.layout(0, 0, zzgo.zza(zzGr), zzgo.zzb(zzGr));
      Canvas localCanvas = new Canvas(zzGq);
      zzGp.draw(localCanvas);
      zzGp.invalidate();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected final Boolean zza(Void... paramVarArgs)
  {
    for (;;)
    {
      int i;
      int m;
      try
      {
        int n = zzGq.getWidth();
        int i1 = zzGq.getHeight();
        if ((n == 0) || (i1 == 0))
        {
          paramVarArgs = Boolean.valueOf(false);
          return paramVarArgs;
        }
        i = 0;
        j = 0;
        int k;
        if (i < n)
        {
          k = 0;
          if (k >= i1) {
            break label139;
          }
          m = j;
          if (zzGq.getPixel(i, k) != 0) {
            m = j + 1;
          }
        }
        else
        {
          if (j / (n * i1 / 100.0D) > 0.1D)
          {
            bool = true;
            paramVarArgs = Boolean.valueOf(bool);
            continue;
          }
          boolean bool = false;
          continue;
        }
        k += 10;
      }
      finally {}
      int j = m;
      continue;
      label139:
      i += 10;
    }
  }
  
  protected final void zza(Boolean paramBoolean)
  {
    zzgo.zzc(zzGr);
    if ((paramBoolean.booleanValue()) || (zzGr.zzgg()) || (zzgo.zzd(zzGr) <= 0L))
    {
      zzGr.zzGo = paramBoolean.booleanValue();
      zzgo.zze(zzGr).zza(zzGr.zzpD, true);
    }
    while (zzgo.zzd(zzGr) <= 0L) {
      return;
    }
    if (zzin.zzQ(2)) {
      zzin.zzaI("Ad not detected, scheduling another run.");
    }
    zzgo.zzg(zzGr).postDelayed(zzGr, zzgo.zzf(zzGr));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgo.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */