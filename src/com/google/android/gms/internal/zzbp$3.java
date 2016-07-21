package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class zzbp$3
  extends zzbp
{
  zzbp$3(int paramInt, String paramString, Long paramLong)
  {
    super(paramInt, paramString, paramLong, null);
  }
  
  public final Long zzd(SharedPreferences paramSharedPreferences)
  {
    return Long.valueOf(paramSharedPreferences.getLong(getKey(), ((Long)zzdq()).longValue()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbp.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */