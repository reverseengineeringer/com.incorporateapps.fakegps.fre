package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzq
  extends zzak
{
  private static final String ID = zzad.zzbA.toString();
  private final String zzadc;
  
  public zzq(String paramString)
  {
    super(ID, new String[0]);
    zzadc = paramString;
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    if (zzadc == null) {
      return zzdf.zzHF();
    }
    return zzdf.zzR(zzadc);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */