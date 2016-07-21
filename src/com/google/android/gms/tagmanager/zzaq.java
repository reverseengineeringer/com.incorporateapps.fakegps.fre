package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class zzaq
{
  private final long zzSL;
  private final long zzbiX;
  private final long zzbiY;
  private String zzbiZ;
  
  zzaq(long paramLong1, long paramLong2, long paramLong3)
  {
    zzbiX = paramLong1;
    zzSL = paramLong2;
    zzbiY = paramLong3;
  }
  
  long zzGD()
  {
    return zzbiX;
  }
  
  long zzGE()
  {
    return zzbiY;
  }
  
  String zzGF()
  {
    return zzbiZ;
  }
  
  void zzgf(String paramString)
  {
    if ((paramString == null) || (TextUtils.isEmpty(paramString.trim()))) {
      return;
    }
    zzbiZ = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzaq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */