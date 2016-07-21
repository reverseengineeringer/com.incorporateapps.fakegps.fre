package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class zzbp$2
  extends zzbp
{
  zzbp$2(int paramInt, String paramString, Integer paramInteger)
  {
    super(paramInt, paramString, paramInteger, null);
  }
  
  public final Integer zzc(SharedPreferences paramSharedPreferences)
  {
    return Integer.valueOf(paramSharedPreferences.getInt(getKey(), ((Integer)zzdq()).intValue()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbp.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */