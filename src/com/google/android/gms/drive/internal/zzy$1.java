package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.zzh;

class zzy$1
  extends zzy.zzd
{
  zzy$1(zzy paramzzy, GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, int paramInt1, int paramInt2, zzh paramzzh)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzarm.zzsL().setContext(paramzzu.getContext());
    CreateFileRequest localCreateFileRequest = new CreateFileRequest(zzarq.getDriveId(), zzarm.zzsL(), zzarn, zzaro, zzarp);
    paramzzu.zzte().zza(localCreateFileRequest, new zzy.zza(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzy.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */