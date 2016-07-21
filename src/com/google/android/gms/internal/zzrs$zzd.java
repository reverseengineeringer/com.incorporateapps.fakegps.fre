package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzdf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzrs$zzd
{
  private String zzadc = "";
  private final List zzbmj = new ArrayList();
  private final Map zzbmk = new HashMap();
  private int zzbml = 0;
  
  public zzrs.zzc zzHN()
  {
    return new zzrs.zzc(zzbmj, zzbmk, zzadc, zzbml, null);
  }
  
  public zzd zzb(zzrs.zze paramzze)
  {
    zzbmj.add(paramzze);
    return this;
  }
  
  public zzd zzc(zzrs.zza paramzza)
  {
    String str = zzdf.zzg((zzag.zza)paramzza.zzHI().get(zzae.zzfR.toString()));
    List localList = (List)zzbmk.get(str);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      zzbmk.put(str, localObject);
    }
    ((List)localObject).add(paramzza);
    return this;
  }
  
  public zzd zzgD(String paramString)
  {
    zzadc = paramString;
    return this;
  }
  
  public zzd zzko(int paramInt)
  {
    zzbml = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrs.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */