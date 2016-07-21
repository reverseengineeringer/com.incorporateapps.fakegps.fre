package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

class zzab$4
  extends zzab.zzd
{
  zzab$4(zzab paramzzab, GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    super(paramzzab, paramGoogleApiClient, null);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzarm.zzsL().setContext(paramzzu.getContext());
    paramzzu.zzte().zza(new UpdateMetadataRequest(zzary.zzaoz, zzarm.zzsL()), new zzab.zzb(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzab.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */