package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zze
  extends zzak
{
  private static final String ID = zzad.zzbX.toString();
  private static final String zzbhD = zzae.zzex.toString();
  private static final String zzbhE = zzae.zzeA.toString();
  private final Context context;
  
  public zze(Context paramContext)
  {
    super(ID, new String[] { zzbhE });
    context = paramContext;
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject = (zzag.zza)paramMap.get(zzbhE);
    if (localObject == null) {
      return zzdf.zzHF();
    }
    localObject = zzdf.zzg((zzag.zza)localObject);
    paramMap = (zzag.zza)paramMap.get(zzbhD);
    if (paramMap != null) {}
    for (paramMap = zzdf.zzg(paramMap);; paramMap = null)
    {
      paramMap = zzax.zzf(context, (String)localObject, paramMap);
      if (paramMap == null) {
        break;
      }
      return zzdf.zzR(paramMap);
    }
    return zzdf.zzHF();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */