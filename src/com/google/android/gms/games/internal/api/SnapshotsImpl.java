package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder;
import com.google.android.gms.games.snapshot.Snapshots;

public final class SnapshotsImpl
  implements Snapshots
{
  public final PendingResult commitAndClose(GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange)
  {
    return paramGoogleApiClient.zzb(new SnapshotsImpl.3(this, paramGoogleApiClient, paramSnapshot, paramSnapshotMetadataChange));
  }
  
  public final PendingResult delete(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata)
  {
    return paramGoogleApiClient.zzb(new SnapshotsImpl.4(this, paramGoogleApiClient, paramSnapshotMetadata));
  }
  
  public final void discardAndClose(GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot)
  {
    Games.zzh(paramGoogleApiClient).zza(paramSnapshot);
  }
  
  public final int getMaxCoverImageSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwQ();
  }
  
  public final int getMaxDataSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwP();
  }
  
  public final Intent getSelectSnapshotIntent(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    return Games.zzh(paramGoogleApiClient).zza(paramString, paramBoolean1, paramBoolean2, paramInt);
  }
  
  public final SnapshotMetadata getSnapshotFromBundle(Bundle paramBundle)
  {
    if ((paramBundle == null) || (!paramBundle.containsKey("com.google.android.gms.games.SNAPSHOT_METADATA"))) {
      return null;
    }
    return (SnapshotMetadata)paramBundle.getParcelable("com.google.android.gms.games.SNAPSHOT_METADATA");
  }
  
  public final PendingResult load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new SnapshotsImpl.1(this, paramGoogleApiClient, paramBoolean));
  }
  
  public final PendingResult open(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata)
  {
    return open(paramGoogleApiClient, paramSnapshotMetadata.getUniqueName(), false);
  }
  
  public final PendingResult open(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata, int paramInt)
  {
    return open(paramGoogleApiClient, paramSnapshotMetadata.getUniqueName(), false, paramInt);
  }
  
  public final PendingResult open(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    return open(paramGoogleApiClient, paramString, paramBoolean, -1);
  }
  
  public final PendingResult open(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean, int paramInt)
  {
    return paramGoogleApiClient.zzb(new SnapshotsImpl.2(this, paramGoogleApiClient, paramString, paramBoolean, paramInt));
  }
  
  public final PendingResult resolveConflict(GoogleApiClient paramGoogleApiClient, String paramString, Snapshot paramSnapshot)
  {
    SnapshotMetadata localSnapshotMetadata = paramSnapshot.getMetadata();
    SnapshotMetadataChange localSnapshotMetadataChange = new SnapshotMetadataChange.Builder().fromMetadata(localSnapshotMetadata).build();
    return resolveConflict(paramGoogleApiClient, paramString, localSnapshotMetadata.getSnapshotId(), localSnapshotMetadataChange, paramSnapshot.getSnapshotContents());
  }
  
  public final PendingResult resolveConflict(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents)
  {
    return paramGoogleApiClient.zzb(new SnapshotsImpl.5(this, paramGoogleApiClient, paramString1, paramString2, paramSnapshotMetadataChange, paramSnapshotContents));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.SnapshotsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */