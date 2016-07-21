package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class zzbp$4
  extends zzbp
{
  zzbp$4(int paramInt, String paramString1, String paramString2)
  {
    super(paramInt, paramString1, paramString2, null);
  }
  
  public final String zze(SharedPreferences paramSharedPreferences)
  {
    return paramSharedPreferences.getString(getKey(), (String)zzdq());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbp.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */