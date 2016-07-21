package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.zzi;

class zzv$2
  extends zzt.zza
{
  zzv$2(zzv paramzzv, GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, zzi paramzzi)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzare.zzsL().setContext(paramzzu.getContext());
    paramzzu.zzte().zza(new CloseContentsAndUpdateMetadataRequest(zzv.zza(zzard).getDriveId(), zzare.zzsL(), zzv.zza(zzard).getRequestId(), zzv.zza(zzard).zzsv(), zzarf), new zzbu(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzv.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */