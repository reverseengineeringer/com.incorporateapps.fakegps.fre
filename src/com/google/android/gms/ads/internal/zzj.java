package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs.zza;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzex;

public class zzj
  extends zzs.zza
{
  private final Context mContext;
  private zzq zzpK;
  private NativeAdOptionsParcel zzpP;
  private zzx zzpR;
  private final String zzpS;
  private final VersionInfoParcel zzpT;
  private zzcr zzpY;
  private zzcs zzpZ;
  private final zzd zzpm;
  private final zzex zzpn;
  private SimpleArrayMap zzqa;
  private SimpleArrayMap zzqb;
  
  public zzj(Context paramContext, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    mContext = paramContext;
    zzpS = paramString;
    zzpn = paramzzex;
    zzpT = paramVersionInfoParcel;
    zzqb = new SimpleArrayMap();
    zzqa = new SimpleArrayMap();
    zzpm = paramzzd;
  }
  
  public void zza(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    zzpP = paramNativeAdOptionsParcel;
  }
  
  public void zza(zzcr paramzzcr)
  {
    zzpY = paramzzcr;
  }
  
  public void zza(zzcs paramzzcs)
  {
    zzpZ = paramzzcs;
  }
  
  public void zza(String paramString, zzcu paramzzcu, zzct paramzzct)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }
    zzqb.put(paramString, paramzzcu);
    zzqa.put(paramString, paramzzct);
  }
  
  public void zzb(zzq paramzzq)
  {
    zzpK = paramzzq;
  }
  
  public void zzb(zzx paramzzx)
  {
    zzpR = paramzzx;
  }
  
  public zzr zzbn()
  {
    return new zzi(mContext, zzpS, zzpn, zzpT, zzpK, zzpY, zzpZ, zzqb, zzqa, zzpP, zzpR, zzpm);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */