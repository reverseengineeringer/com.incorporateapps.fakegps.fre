package com.google.android.gms.internal;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzk;

public class zzdv
{
  private MutableContextWrapper zzAb;
  private final VersionInfoParcel zzpT;
  private final zzd zzpm;
  private final zzex zzpn;
  
  zzdv(Context paramContext, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    zzAb = new MutableContextWrapper(paramContext.getApplicationContext());
    zzpn = paramzzex;
    zzpT = paramVersionInfoParcel;
    zzpm = paramzzd;
  }
  
  public zzk zzX(String paramString)
  {
    return new zzk(zzAb, new AdSizeParcel(), paramString, zzpn, zzpT, zzpm);
  }
  
  public zzdv zzec()
  {
    return new zzdv(zzAb.getBaseContext(), zzpn, zzpT, zzpm);
  }
  
  public MutableContextWrapper zzed()
  {
    return zzAb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */