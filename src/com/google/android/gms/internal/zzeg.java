package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public class zzeg
{
  private final Context mContext;
  private final String zzAY;
  private zzeg.zzb zzAZ;
  private zzeg.zzb zzBa;
  private zzeg.zze zzBb;
  private int zzBc = 1;
  private final VersionInfoParcel zzpT;
  private final Object zzpV = new Object();
  
  public zzeg(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString)
  {
    zzAY = paramString;
    mContext = paramContext.getApplicationContext();
    zzpT = paramVersionInfoParcel;
    zzAZ = new zzeg.zzc();
    zzBa = new zzeg.zzc();
  }
  
  public zzeg(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, zzeg.zzb paramzzb1, zzeg.zzb paramzzb2)
  {
    this(paramContext, paramVersionInfoParcel, paramString);
    zzAZ = paramzzb1;
    zzBa = paramzzb2;
  }
  
  private zzeg.zze zzep()
  {
    zzeg.zze localzze = new zzeg.zze(zzBa);
    zzir.runOnUiThread(new zzeg.1(this, localzze));
    return localzze;
  }
  
  protected zzed zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    return new zzef(paramContext, paramVersionInfoParcel, null);
  }
  
  protected zzeg.zze zzeq()
  {
    zzeg.zze localzze = zzep();
    localzze.zza(new zzeg.2(this, localzze), new zzeg.3(this, localzze));
    return localzze;
  }
  
  public zzeg.zzd zzer()
  {
    synchronized (zzpV)
    {
      zzeg.zzd localzzd1;
      if ((zzBb == null) || (zzBb.getStatus() == -1))
      {
        zzBc = 2;
        zzBb = zzeq();
        localzzd1 = zzBb.zzes();
        return localzzd1;
      }
      if (zzBc == 0)
      {
        localzzd1 = zzBb.zzes();
        return localzzd1;
      }
    }
    if (zzBc == 1)
    {
      zzBc = 2;
      zzeq();
      localzzd2 = zzBb.zzes();
      return localzzd2;
    }
    if (zzBc == 2)
    {
      localzzd2 = zzBb.zzes();
      return localzzd2;
    }
    zzeg.zzd localzzd2 = zzBb.zzes();
    return localzzd2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */