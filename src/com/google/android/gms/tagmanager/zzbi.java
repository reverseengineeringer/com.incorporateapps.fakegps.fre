package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzbi
  extends zzak
{
  private static final String ID = zzad.zzch.toString();
  private static final String zzbiQ = zzae.zzdV.toString();
  
  public zzbi()
  {
    super(ID, new String[] { zzbiQ });
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    return zzdf.zzR(zzdf.zzg((zzag.zza)paramMap.get(zzbiQ)).toLowerCase());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzbi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */