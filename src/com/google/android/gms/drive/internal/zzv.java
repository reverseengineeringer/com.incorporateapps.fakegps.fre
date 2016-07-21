package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.zzi;
import com.google.android.gms.drive.zzi.zza;
import com.google.android.gms.internal.zzna;
import java.io.InputStream;
import java.io.OutputStream;

public class zzv
  implements DriveContents
{
  private boolean mClosed = false;
  private final Contents zzara;
  private boolean zzarb = false;
  private boolean zzarc = false;
  
  public zzv(Contents paramContents)
  {
    zzara = ((Contents)zzx.zzz(paramContents));
  }
  
  public PendingResult commit(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    return zza(paramGoogleApiClient, paramMetadataChangeSet, null);
  }
  
  public PendingResult commit(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, ExecutionOptions paramExecutionOptions)
  {
    if (paramExecutionOptions == null) {}
    for (paramExecutionOptions = null;; paramExecutionOptions = zzi.zzb(paramExecutionOptions)) {
      return zza(paramGoogleApiClient, paramMetadataChangeSet, paramExecutionOptions);
    }
  }
  
  public void discard(GoogleApiClient paramGoogleApiClient)
  {
    if (zzsz()) {
      throw new IllegalStateException("DriveContents already closed.");
    }
    zzsy();
    ((zzv.4)paramGoogleApiClient.zzb(new zzv.4(this, paramGoogleApiClient))).setResultCallback(new zzv.3(this));
  }
  
  public DriveId getDriveId()
  {
    return zzara.getDriveId();
  }
  
  public InputStream getInputStream()
  {
    if (zzsz()) {
      throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
    }
    if (zzara.getMode() != 268435456) {
      throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
    }
    if (zzarb) {
      throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
    }
    zzarb = true;
    return zzara.getInputStream();
  }
  
  public int getMode()
  {
    return zzara.getMode();
  }
  
  public OutputStream getOutputStream()
  {
    if (zzsz()) {
      throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
    }
    if (zzara.getMode() != 536870912) {
      throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
    }
    if (zzarc) {
      throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
    }
    zzarc = true;
    return zzara.getOutputStream();
  }
  
  public ParcelFileDescriptor getParcelFileDescriptor()
  {
    if (zzsz()) {
      throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
    }
    return zzara.getParcelFileDescriptor();
  }
  
  public PendingResult reopenForWrite(GoogleApiClient paramGoogleApiClient)
  {
    if (zzsz()) {
      throw new IllegalStateException("DriveContents already closed.");
    }
    if (zzara.getMode() != 268435456) {
      throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
    }
    zzsy();
    return paramGoogleApiClient.zza(new zzv.1(this, paramGoogleApiClient));
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, zzi paramzzi)
  {
    zzi localzzi = paramzzi;
    if (paramzzi == null) {
      localzzi = new zzi.zza().zzsJ();
    }
    if (zzara.getMode() == 268435456) {
      throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
    }
    if ((ExecutionOptions.zzcv(localzzi.zzsD())) && (!zzara.zzsv())) {
      throw new IllegalStateException("DriveContents must be valid for conflict detection.");
    }
    localzzi.zzg(paramGoogleApiClient);
    if (zzsz()) {
      throw new IllegalStateException("DriveContents already closed.");
    }
    if (getDriveId() == null) {
      throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
    }
    if (paramMetadataChangeSet != null) {}
    for (;;)
    {
      zzsy();
      return paramGoogleApiClient.zzb(new zzv.2(this, paramGoogleApiClient, paramMetadataChangeSet, localzzi));
      paramMetadataChangeSet = MetadataChangeSet.zzapd;
    }
  }
  
  public Contents zzsx()
  {
    return zzara;
  }
  
  public void zzsy()
  {
    zzna.zza(zzara.getParcelFileDescriptor());
    mClosed = true;
  }
  
  public boolean zzsz()
  {
    return mClosed;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */