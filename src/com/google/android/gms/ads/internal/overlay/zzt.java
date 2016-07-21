package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzbx;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zziv;
import com.google.android.gms.internal.zziv.zza;
import com.google.android.gms.internal.zziv.zzb;
import com.google.android.gms.internal.zzmq;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class zzt
{
  private final Context mContext;
  private final String zzEY;
  private final VersionInfoParcel zzEZ;
  private final zzbz zzFa;
  private final zzcb zzFb;
  private final zziv zzFc = new zziv.zzb().zza("min_1", Double.MIN_VALUE, 1.0D).zza("1_5", 1.0D, 5.0D).zza("5_10", 5.0D, 10.0D).zza("10_20", 10.0D, 20.0D).zza("20_30", 20.0D, 30.0D).zza("30_max", 30.0D, Double.MAX_VALUE).zzhA();
  private final long[] zzFd;
  private final String[] zzFe;
  private zzbz zzFf;
  private zzbz zzFg;
  private zzbz zzFh;
  private zzbz zzFi;
  private boolean zzFj;
  private zzi zzFk;
  private boolean zzFl;
  private boolean zzFm;
  private long zzFn = -1L;
  
  public zzt(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, zzcb paramzzcb, zzbz paramzzbz)
  {
    mContext = paramContext;
    zzEZ = paramVersionInfoParcel;
    zzEY = paramString;
    zzFb = paramzzcb;
    zzFa = paramzzbz;
    paramContext = (String)zzbt.zzvV.get();
    if (paramContext == null)
    {
      zzFe = new String[0];
      zzFd = new long[0];
      return;
    }
    paramContext = TextUtils.split(paramContext, ",");
    zzFe = new String[paramContext.length];
    zzFd = new long[paramContext.length];
    int i = 0;
    while (i < paramContext.length) {
      try
      {
        zzFd[i] = Long.parseLong(paramContext[i]);
        i += 1;
      }
      catch (NumberFormatException paramVersionInfoParcel)
      {
        for (;;)
        {
          zzin.zzd("Unable to parse frame hash target time number.", paramVersionInfoParcel);
          zzFd[i] = -1L;
        }
      }
    }
  }
  
  private void zzc(zzi paramzzi)
  {
    long l1 = ((Long)zzbt.zzvW.get()).longValue();
    long l2 = paramzzi.getCurrentPosition();
    int i = 0;
    for (;;)
    {
      if (i < zzFe.length)
      {
        if ((zzFe[i] == null) && (l1 > Math.abs(l2 - zzFd[i]))) {
          zzFe[i] = zza(paramzzi);
        }
      }
      else {
        return;
      }
      i += 1;
    }
  }
  
  private void zzfN()
  {
    if ((zzFh != null) && (zzFi == null))
    {
      zzbx.zza(zzFb, zzFh, new String[] { "vff" });
      zzbx.zza(zzFb, zzFa, new String[] { "vtt" });
      zzFi = zzbx.zzb(zzFb);
    }
    long l = zzr.zzbG().nanoTime();
    if ((zzFj) && (zzFm) && (zzFn != -1L))
    {
      double d = TimeUnit.SECONDS.toNanos(1L) / (l - zzFn);
      zzFc.zza(d);
    }
    zzFm = zzFj;
    zzFn = l;
  }
  
  public void onStop()
  {
    if ((((Boolean)zzbt.zzvU.get()).booleanValue()) && (!zzFl))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("type", "native-player-metrics");
      localBundle.putString("request", zzEY);
      localBundle.putString("player", zzFk.zzeZ());
      Object localObject = zzFc.getBuckets().iterator();
      while (((Iterator)localObject).hasNext())
      {
        zziv.zza localzza = (zziv.zza)((Iterator)localObject).next();
        localBundle.putString("fps_c_" + name, Integer.toString(count));
        localBundle.putString("fps_p_" + name, Double.toString(zzMu));
      }
      int i = 0;
      while (i < zzFd.length)
      {
        localObject = zzFe[i];
        if (localObject != null) {
          localBundle.putString("fh_" + Long.valueOf(zzFd[i]), (String)localObject);
        }
        i += 1;
      }
      zzr.zzbC().zza(mContext, zzEZ.afmaVersion, "gmob-apps", localBundle, true);
      zzFl = true;
    }
  }
  
  String zza(TextureView paramTextureView)
  {
    paramTextureView = paramTextureView.getBitmap(8, 8);
    long l2 = 0L;
    long l1 = 63L;
    int i = 0;
    while (i < 8)
    {
      long l3 = l1;
      int j = 0;
      l1 = l2;
      l2 = l3;
      if (j < 8)
      {
        int k = paramTextureView.getPixel(j, i);
        int m = Color.blue(k);
        int n = Color.red(k);
        if (Color.green(k) + (m + n) > 128) {}
        for (l3 = 1L;; l3 = 0L)
        {
          l1 |= l3 << (int)l2;
          l2 -= 1L;
          j += 1;
          break;
        }
      }
      i += 1;
      l3 = l1;
      l1 = l2;
      l2 = l3;
    }
    return String.format("%016X", new Object[] { Long.valueOf(l2) });
  }
  
  public void zza(zzi paramzzi)
  {
    zzbx.zza(zzFb, zzFa, new String[] { "vpc" });
    zzFf = zzbx.zzb(zzFb);
    zzFk = paramzzi;
  }
  
  public void zzb(zzi paramzzi)
  {
    zzfN();
    zzc(paramzzi);
  }
  
  public void zzfO()
  {
    zzFj = true;
    if ((zzFg != null) && (zzFh == null))
    {
      zzbx.zza(zzFb, zzFg, new String[] { "vfp" });
      zzFh = zzbx.zzb(zzFb);
    }
  }
  
  public void zzfP()
  {
    zzFj = false;
  }
  
  public void zzfz()
  {
    if ((zzFf == null) || (zzFg != null)) {
      return;
    }
    zzbx.zza(zzFb, zzFf, new String[] { "vfr" });
    zzFg = zzbx.zzb(zzFb);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */