package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzin;

public class zze
{
  private boolean zzpA;
  private boolean zzpB;
  private zze.zza zzpz;
  
  public zze()
  {
    zzpB = ((Boolean)zzbt.zzvI.get()).booleanValue();
  }
  
  public zze(boolean paramBoolean)
  {
    zzpB = paramBoolean;
  }
  
  public void recordClick()
  {
    zzpA = true;
  }
  
  public void zza(zze.zza paramzza)
  {
    zzpz = paramzza;
  }
  
  public boolean zzbh()
  {
    return (!zzpB) || (zzpA);
  }
  
  public void zzq(String paramString)
  {
    zzin.zzaI("Action was blocked because no click was detected.");
    if (zzpz != null) {
      zzpz.zzr(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */