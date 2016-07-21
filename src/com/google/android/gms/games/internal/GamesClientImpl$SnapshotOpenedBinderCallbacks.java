package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.Contents;

final class GamesClientImpl$SnapshotOpenedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFr;
  
  public GamesClientImpl$SnapshotOpenedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFr = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zza(DataHolder paramDataHolder, Contents paramContents)
  {
    zzaFr.zzs(new GamesClientImpl.OpenSnapshotResultImpl(paramDataHolder, paramContents));
  }
  
  public final void zza(DataHolder paramDataHolder, String paramString, Contents paramContents1, Contents paramContents2, Contents paramContents3)
  {
    zzaFr.zzs(new GamesClientImpl.OpenSnapshotResultImpl(paramDataHolder, paramString, paramContents1, paramContents2, paramContents3));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.SnapshotOpenedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */