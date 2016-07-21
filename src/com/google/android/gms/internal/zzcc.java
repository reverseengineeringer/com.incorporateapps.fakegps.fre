package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

public final class zzcc
  extends zzce.zza
{
  private final zzg zzxE;
  private final String zzxF;
  private final String zzxG;
  
  public zzcc(zzg paramzzg, String paramString1, String paramString2)
  {
    zzxE = paramzzg;
    zzxF = paramString1;
    zzxG = paramString2;
  }
  
  public final String getContent()
  {
    return zzxG;
  }
  
  public final void recordClick()
  {
    zzxE.zzbd();
  }
  
  public final void recordImpression()
  {
    zzxE.zzbe();
  }
  
  public final void zzb(zzd paramzzd)
  {
    if (paramzzd == null) {
      return;
    }
    zzxE.zzc((View)zze.zzp(paramzzd));
  }
  
  public final String zzdF()
  {
    return zzxF;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzcc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */