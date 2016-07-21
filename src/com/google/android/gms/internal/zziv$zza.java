package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class zziv$zza
{
  public final int count;
  public final String name;
  public final double zzMs;
  public final double zzMt;
  public final double zzMu;
  
  public zziv$zza(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
  {
    name = paramString;
    zzMt = paramDouble1;
    zzMs = paramDouble2;
    zzMu = paramDouble3;
    count = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zza)) {}
    do
    {
      return false;
      paramObject = (zza)paramObject;
    } while ((!zzw.equal(name, name)) || (zzMs != zzMs) || (zzMt != zzMt) || (count != count) || (Double.compare(zzMu, zzMu) != 0));
    return true;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { name, Double.valueOf(zzMs), Double.valueOf(zzMt), Double.valueOf(zzMu), Integer.valueOf(count) });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("name", name).zzg("minBound", Double.valueOf(zzMt)).zzg("maxBound", Double.valueOf(zzMs)).zzg("percent", Double.valueOf(zzMu)).zzg("count", Integer.valueOf(count)).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zziv.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */