package com.google.android.gms.internal;

import android.content.Context;
import java.util.WeakHashMap;

public final class zzhk
{
  private WeakHashMap zzKm = new WeakHashMap();
  
  public final zzhj zzE(Context paramContext)
  {
    Object localObject = (zzhk.zza)zzKm.get(paramContext);
    if ((localObject != null) && (!((zzhk.zza)localObject).hasExpired()) && (((Boolean)zzbt.zzwL.get()).booleanValue())) {}
    for (localObject = new zzhj.zza(paramContext, zzKo).zzgI();; localObject = new zzhj.zza(paramContext).zzgI())
    {
      zzKm.put(paramContext, new zzhk.zza(this, (zzhj)localObject));
      return (zzhj)localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */