package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class zzx
  extends zzdd
{
  private static final String ID = zzad.zzcg.toString();
  private static final String VALUE = zzae.zzih.toString();
  private static final String zzbiL = zzae.zzes.toString();
  private final DataLayer zzbhN;
  
  public zzx(DataLayer paramDataLayer)
  {
    super(ID, new String[] { VALUE });
    zzbhN = paramDataLayer;
  }
  
  private void zza(zzag.zza paramzza)
  {
    if ((paramzza == null) || (paramzza == zzdf.zzHz())) {}
    do
    {
      return;
      paramzza = zzdf.zzg(paramzza);
    } while (paramzza == zzdf.zzHE());
    zzbhN.zzfX(paramzza);
  }
  
  private void zzb(zzag.zza paramzza)
  {
    if ((paramzza == null) || (paramzza == zzdf.zzHz())) {}
    for (;;)
    {
      return;
      paramzza = zzdf.zzl(paramzza);
      if ((paramzza instanceof List))
      {
        paramzza = ((List)paramzza).iterator();
        while (paramzza.hasNext())
        {
          Object localObject = paramzza.next();
          if ((localObject instanceof Map))
          {
            localObject = (Map)localObject;
            zzbhN.push((Map)localObject);
          }
        }
      }
    }
  }
  
  public void zzR(Map paramMap)
  {
    zzb((zzag.zza)paramMap.get(VALUE));
    zza((zzag.zza)paramMap.get(zzbiL));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */