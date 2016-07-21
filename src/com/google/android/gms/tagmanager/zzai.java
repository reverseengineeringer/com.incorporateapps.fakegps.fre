package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzai
  extends zzak
{
  private static final String ID = zzad.zzbI.toString();
  private final zzcp zzbhO;
  
  public zzai(zzcp paramzzcp)
  {
    super(ID, new String[0]);
    zzbhO = paramzzcp;
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    paramMap = zzbhO.zzHe();
    if (paramMap == null) {
      return zzdf.zzHF();
    }
    return zzdf.zzR(paramMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */