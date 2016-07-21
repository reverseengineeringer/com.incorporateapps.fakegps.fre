package com.google.android.gms.tagmanager;

import java.util.Arrays;

class zzw$zzb
{
  final byte[] zzbiK;
  final String zzvs;
  
  zzw$zzb(String paramString, byte[] paramArrayOfByte)
  {
    zzvs = paramString;
    zzbiK = paramArrayOfByte;
  }
  
  public String toString()
  {
    return "KeyAndSerialized: key = " + zzvs + " serialized hash = " + Arrays.hashCode(zzbiK);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzw.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */