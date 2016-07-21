package com.google.android.gms.cast;

import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;

public final class Cast$CastOptions
  implements Api.ApiOptions.HasOptions
{
  final CastDevice zzZL;
  final Cast.Listener zzZM;
  private final int zzZN;
  
  private Cast$CastOptions(Cast.CastOptions.Builder paramBuilder)
  {
    zzZL = zzZO;
    zzZM = zzZP;
    zzZN = Cast.CastOptions.Builder.zza(paramBuilder);
  }
  
  public static Cast.CastOptions.Builder builder(CastDevice paramCastDevice, Cast.Listener paramListener)
  {
    return new Cast.CastOptions.Builder(paramCastDevice, paramListener);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.Cast.CastOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */