package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzv
  extends zzak
{
  private static final String ID = zzad.zzbz.toString();
  private static final String NAME = zzae.zzgo.toString();
  private static final String zzbiA = zzae.zzeY.toString();
  private final DataLayer zzbhN;
  
  public zzv(DataLayer paramDataLayer)
  {
    super(ID, new String[] { NAME });
    zzbhN = paramDataLayer;
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject = zzbhN.get(zzdf.zzg((zzag.zza)paramMap.get(NAME)));
    if (localObject == null)
    {
      paramMap = (zzag.zza)paramMap.get(zzbiA);
      if (paramMap != null) {
        return paramMap;
      }
      return zzdf.zzHF();
    }
    return zzdf.zzR(localObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */