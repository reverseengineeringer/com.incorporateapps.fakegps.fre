package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.ChangeListener;
import java.util.ArrayList;
import java.util.Set;

public class zzab
  implements DriveResource
{
  protected final DriveId zzaoz;
  
  public zzab(DriveId paramDriveId)
  {
    zzaoz = paramDriveId;
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new zzab.1(this, paramGoogleApiClient, paramBoolean));
  }
  
  public PendingResult addChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener)
  {
    return ((zzu)paramGoogleApiClient.zza(Drive.zzUI)).zza(paramGoogleApiClient, zzaoz, paramChangeListener);
  }
  
  public PendingResult addChangeSubscription(GoogleApiClient paramGoogleApiClient)
  {
    return ((zzu)paramGoogleApiClient.zza(Drive.zzUI)).zza(paramGoogleApiClient, zzaoz);
  }
  
  public PendingResult delete(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new zzab.5(this, paramGoogleApiClient));
  }
  
  public DriveId getDriveId()
  {
    return zzaoz;
  }
  
  public PendingResult getMetadata(GoogleApiClient paramGoogleApiClient)
  {
    return zza(paramGoogleApiClient, false);
  }
  
  public PendingResult listParents(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzab.2(this, paramGoogleApiClient));
  }
  
  public PendingResult removeChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener)
  {
    return ((zzu)paramGoogleApiClient.zza(Drive.zzUI)).zzb(paramGoogleApiClient, zzaoz, paramChangeListener);
  }
  
  public PendingResult removeChangeSubscription(GoogleApiClient paramGoogleApiClient)
  {
    return ((zzu)paramGoogleApiClient.zza(Drive.zzUI)).zzb(paramGoogleApiClient, zzaoz);
  }
  
  public PendingResult setParents(GoogleApiClient paramGoogleApiClient, Set paramSet)
  {
    if (paramSet == null) {
      throw new IllegalArgumentException("ParentIds must be provided.");
    }
    return paramGoogleApiClient.zzb(new zzab.3(this, paramGoogleApiClient, new ArrayList(paramSet)));
  }
  
  public PendingResult trash(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new zzab.6(this, paramGoogleApiClient));
  }
  
  public PendingResult untrash(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new zzab.7(this, paramGoogleApiClient));
  }
  
  public PendingResult updateMetadata(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    if (paramMetadataChangeSet == null) {
      throw new IllegalArgumentException("ChangeSet must be provided.");
    }
    return paramGoogleApiClient.zzb(new zzab.4(this, paramGoogleApiClient, paramMetadataChangeSet));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */