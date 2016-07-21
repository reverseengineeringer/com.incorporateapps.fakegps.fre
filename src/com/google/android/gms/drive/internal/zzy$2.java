package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

class zzy$2
  extends zzy.zzf
{
  zzy$2(zzy paramzzy, GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzarm.zzsL().setContext(paramzzu.getContext());
    paramzzu.zzte().zza(new CreateFolderRequest(zzarq.getDriveId(), zzarm.zzsL()), new zzy.zzb(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzy.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */