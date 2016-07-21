package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class DataLayer$zza
{
  public final Object zzNc;
  public final String zzvs;
  
  DataLayer$zza(String paramString, Object paramObject)
  {
    zzvs = paramString;
    zzNc = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zza)) {}
    do
    {
      return false;
      paramObject = (zza)paramObject;
    } while ((!zzvs.equals(zzvs)) || (!zzNc.equals(zzNc)));
    return true;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Integer[] { Integer.valueOf(zzvs.hashCode()), Integer.valueOf(zzNc.hashCode()) });
  }
  
  public final String toString()
  {
    return "Key: " + zzvs + " value: " + zzNc.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.DataLayer.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */