package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzx;

public class BooleanResult
  implements Result
{
  private final Status zzUX;
  private final boolean zzagf;
  
  public BooleanResult(Status paramStatus, boolean paramBoolean)
  {
    zzUX = ((Status)zzx.zzb(paramStatus, "Status must not be null"));
    zzagf = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof BooleanResult)) {
        return false;
      }
      paramObject = (BooleanResult)paramObject;
    } while ((zzUX.equals(zzUX)) && (zzagf == zzagf));
    return false;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public boolean getValue()
  {
    return zzagf;
  }
  
  public final int hashCode()
  {
    int j = zzUX.hashCode();
    if (zzagf) {}
    for (int i = 1;; i = 0) {
      return i + (j + 527) * 31;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.BooleanResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */