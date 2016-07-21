package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzc
  extends zzak
{
  private static final String ID = zzad.zzbs.toString();
  private final zza zzbhC;
  
  public zzc(Context paramContext)
  {
    this(zza.zzaW(paramContext));
  }
  
  zzc(zza paramzza)
  {
    super(ID, new String[0]);
    zzbhC = paramzza;
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    if (!zzbhC.isLimitAdTrackingEnabled()) {}
    for (boolean bool = true;; bool = false) {
      return zzdf.zzR(Boolean.valueOf(bool));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */