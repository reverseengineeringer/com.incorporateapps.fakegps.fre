package com.google.android.gms.common.internal;

import java.util.Arrays;

public final class zzw
{
  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static int hashCode(Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static zzw.zza zzy(Object paramObject)
  {
    return new zzw.zza(paramObject, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */