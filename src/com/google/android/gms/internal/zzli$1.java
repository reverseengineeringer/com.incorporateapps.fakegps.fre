package com.google.android.gms.internal;

import com.google.android.gms.cast.Cast.CastApi;
import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.internal.zzo;
import java.io.IOException;

class zzli$1
  extends zzli.zzc
{
  zzli$1(zzli paramzzli, GameManagerClient paramGameManagerClient)
  {
    super(paramzzli, paramGameManagerClient);
  }
  
  public void execute()
  {
    try
    {
      zzli.zzc(zzacN).setMessageReceivedCallbacks(zzli.zzb(zzacN), zzacN.getNamespace(), new zzli.1.1(this));
      zzli.zzd(zzacN);
      zzli.zze(zzacN);
      zzli.zza(zzacN, null, 1100, null, zznW());
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      zznW().zza(-1L, 8, null);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzli.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */