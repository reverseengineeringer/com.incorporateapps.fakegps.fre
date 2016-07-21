package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzdh
  extends zzak
{
  private static final String ID = zzad.zzci.toString();
  private static final String zzbiQ = zzae.zzdV.toString();
  
  public zzdh()
  {
    super(ID, new String[] { zzbiQ });
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    return zzdf.zzR(zzdf.zzg((zzag.zza)paramMap.get(zzbiQ)).toUpperCase());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzdh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */