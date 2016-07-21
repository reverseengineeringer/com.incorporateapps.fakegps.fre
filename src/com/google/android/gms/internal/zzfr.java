package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

public class zzfr
  extends zzfs
  implements zzdf
{
  private final Context mContext;
  DisplayMetrics zzDA;
  private float zzDB;
  int zzDC = -1;
  int zzDD = -1;
  private int zzDE;
  int zzDF = -1;
  int zzDG = -1;
  int zzDH = -1;
  int zzDI = -1;
  private final zzbl zzDz;
  private final zzjp zzpD;
  private final WindowManager zzsb;
  
  public zzfr(zzjp paramzzjp, Context paramContext, zzbl paramzzbl)
  {
    super(paramzzjp);
    zzpD = paramzzjp;
    mContext = paramContext;
    zzDz = paramzzbl;
    zzsb = ((WindowManager)paramContext.getSystemService("window"));
  }
  
  private void zzeQ()
  {
    zzDA = new DisplayMetrics();
    Display localDisplay = zzsb.getDefaultDisplay();
    localDisplay.getMetrics(zzDA);
    zzDB = zzDA.density;
    zzDE = localDisplay.getRotation();
  }
  
  private void zzeV()
  {
    int[] arrayOfInt = new int[2];
    zzpD.getLocationOnScreen(arrayOfInt);
    zzf(zzn.zzcS().zzc(mContext, arrayOfInt[0]), zzn.zzcS().zzc(mContext, arrayOfInt[1]));
  }
  
  private zzfq zzeY()
  {
    return new zzfq.zza().zzr(zzDz.zzdj()).zzq(zzDz.zzdk()).zzs(zzDz.zzdo()).zzt(zzDz.zzdl()).zzu(zzDz.zzdm()).zzeP();
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    zzeT();
  }
  
  void zzeR()
  {
    zzDC = zzn.zzcS().zzb(zzDA, zzDA.widthPixels);
    zzDD = zzn.zzcS().zzb(zzDA, zzDA.heightPixels);
    Object localObject = zzpD.zzhP();
    if ((localObject == null) || (((Activity)localObject).getWindow() == null))
    {
      zzDF = zzDC;
      zzDG = zzDD;
      return;
    }
    localObject = zzr.zzbC().zze((Activity)localObject);
    zzDF = zzn.zzcS().zzb(zzDA, localObject[0]);
    zzDG = zzn.zzcS().zzb(zzDA, localObject[1]);
  }
  
  void zzeS()
  {
    if (zzpD.zzaN().zzui)
    {
      zzDH = zzDC;
      zzDI = zzDD;
      return;
    }
    zzpD.measure(0, 0);
    zzDH = zzn.zzcS().zzc(mContext, zzpD.getMeasuredWidth());
    zzDI = zzn.zzcS().zzc(mContext, zzpD.getMeasuredHeight());
  }
  
  public void zzeT()
  {
    zzeQ();
    zzeR();
    zzeS();
    zzeW();
    zzeX();
    zzeV();
    zzeU();
  }
  
  void zzeU()
  {
    if (zzin.zzQ(2)) {
      zzin.zzaJ("Dispatching Ready Event.");
    }
    zzan(zzpD.zzhX().afmaVersion);
  }
  
  void zzeW()
  {
    zza(zzDC, zzDD, zzDF, zzDG, zzDB, zzDE);
  }
  
  void zzeX()
  {
    zzfq localzzfq = zzeY();
    zzpD.zzb("onDeviceFeaturesReceived", localzzfq.toJson());
  }
  
  public void zzf(int paramInt1, int paramInt2)
  {
    if ((mContext instanceof Activity)) {}
    for (int i = zzr.zzbC().zzh((Activity)mContext)[0];; i = 0)
    {
      zzc(paramInt1, paramInt2 - i, zzDH, zzDI);
      zzpD.zzhU().zze(paramInt1, paramInt2);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */