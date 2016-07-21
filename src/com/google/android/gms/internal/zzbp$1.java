package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class zzbp$1
  extends zzbp
{
  zzbp$1(int paramInt, String paramString, Boolean paramBoolean)
  {
    super(paramInt, paramString, paramBoolean, null);
  }
  
  public final Boolean zzb(SharedPreferences paramSharedPreferences)
  {
    return Boolean.valueOf(paramSharedPreferences.getBoolean(getKey(), ((Boolean)zzdq()).booleanValue()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbp.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */