package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzb
  extends zzak
{
  private static final String ID = zzad.zzbr.toString();
  private final zza zzbhC;
  
  public zzb(Context paramContext)
  {
    this(zza.zzaW(paramContext));
  }
  
  zzb(zza paramzza)
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
    paramMap = zzbhC.zzFQ();
    if (paramMap == null) {
      return zzdf.zzHF();
    }
    return zzdf.zzR(paramMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */