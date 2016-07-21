package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;

final class GamesClientImpl$SignOutCompleteBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  public GamesClientImpl$SignOutCompleteBinderCallbacks(zza.zzb paramzzb)
  {
    zzamC = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzwr()
  {
    Status localStatus = GamesStatusCodes.zzgc(0);
    zzamC.zzs(localStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.SignOutCompleteBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */