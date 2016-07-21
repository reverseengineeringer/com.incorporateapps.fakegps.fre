package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.zzi;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.Query.Builder;
import com.google.android.gms.drive.query.SearchableField;
import com.google.android.gms.drive.zzh;
import com.google.android.gms.drive.zzh.zza;
import com.google.android.gms.internal.zznm;

public class zzy
  extends zzab
  implements DriveFolder
{
  public zzy(DriveId paramDriveId)
  {
    super(paramDriveId);
  }
  
  private int zza(DriveContents paramDriveContents, zzi paramzzi)
  {
    if (paramDriveContents == null)
    {
      if ((paramzzi != null) && (paramzzi.zztI())) {
        return 0;
      }
      return 1;
    }
    int i = paramDriveContents.zzsx().getRequestId();
    paramDriveContents.zzsy();
    return i;
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, int paramInt, zzh paramzzh)
  {
    zzi localzzi = zzi.zzdd(paramMetadataChangeSet.getMimeType());
    if ((localzzi != null) && (localzzi.zztI())) {}
    for (int i = 1;; i = 0) {
      return paramGoogleApiClient.zzb(new zzy.1(this, paramGoogleApiClient, paramMetadataChangeSet, paramInt, i, paramzzh));
    }
  }
  
  private MetadataChangeSet zza(MetadataChangeSet paramMetadataChangeSet, String paramString)
  {
    return paramMetadataChangeSet.zza(zznm.zzatE, paramString);
  }
  
  private Query zza(Query paramQuery)
  {
    Query.Builder localBuilder = new Query.Builder().addFilter(Filters.in(SearchableField.PARENTS, getDriveId()));
    if (paramQuery != null)
    {
      if (paramQuery.getFilter() != null) {
        localBuilder.addFilter(paramQuery.getFilter());
      }
      localBuilder.setPageToken(paramQuery.getPageToken());
      localBuilder.setSortOrder(paramQuery.getSortOrder());
    }
    return localBuilder.build();
  }
  
  private void zzb(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, zzh paramzzh)
  {
    if (paramMetadataChangeSet == null) {
      throw new IllegalArgumentException("MetadataChangeSet must be provided.");
    }
    paramMetadataChangeSet = zzi.zzdd(paramMetadataChangeSet.getMimeType());
    if ((paramMetadataChangeSet != null) && (paramMetadataChangeSet.isFolder())) {
      throw new IllegalArgumentException("May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder");
    }
    paramzzh.zzg(paramGoogleApiClient);
    if (paramDriveContents == null) {}
    do
    {
      return;
      if (!(paramDriveContents instanceof zzv)) {
        throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
      }
      if (paramDriveContents.getDriveId() != null) {
        throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
      }
    } while (!paramDriveContents.zzsz());
    throw new IllegalArgumentException("DriveContents are already closed.");
  }
  
  private void zzb(MetadataChangeSet paramMetadataChangeSet)
  {
    if (paramMetadataChangeSet == null) {
      throw new IllegalArgumentException("MetadataChangeSet must be provided.");
    }
    paramMetadataChangeSet = zzi.zzdd(paramMetadataChangeSet.getMimeType());
    if ((paramMetadataChangeSet != null) && (!paramMetadataChangeSet.zztH())) {
      throw new IllegalArgumentException("May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead.");
    }
  }
  
  public PendingResult createFile(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents)
  {
    zzb(paramMetadataChangeSet);
    return zza(paramGoogleApiClient, paramMetadataChangeSet, paramDriveContents, null);
  }
  
  public PendingResult createFile(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, ExecutionOptions paramExecutionOptions)
  {
    zzb(paramMetadataChangeSet);
    return zza(paramGoogleApiClient, paramMetadataChangeSet, paramDriveContents, zzh.zza(paramExecutionOptions));
  }
  
  public PendingResult createFolder(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    if (paramMetadataChangeSet == null) {
      throw new IllegalArgumentException("MetadataChangeSet must be provided.");
    }
    if ((paramMetadataChangeSet.getMimeType() != null) && (!paramMetadataChangeSet.getMimeType().equals("application/vnd.google-apps.folder"))) {
      throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
    }
    return paramGoogleApiClient.zzb(new zzy.2(this, paramGoogleApiClient, paramMetadataChangeSet));
  }
  
  public PendingResult listChildren(GoogleApiClient paramGoogleApiClient)
  {
    return queryChildren(paramGoogleApiClient, null);
  }
  
  public PendingResult queryChildren(GoogleApiClient paramGoogleApiClient, Query paramQuery)
  {
    return new zzs().query(paramGoogleApiClient, zza(paramQuery));
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, zzh paramzzh)
  {
    zzh localzzh = paramzzh;
    if (paramzzh == null) {
      localzzh = new zzh.zza().zzsH();
    }
    zzb(paramGoogleApiClient, paramMetadataChangeSet, paramDriveContents, localzzh);
    int i = zza(paramDriveContents, zzi.zzdd(paramMetadataChangeSet.getMimeType()));
    paramzzh = localzzh.zzsG();
    paramDriveContents = paramMetadataChangeSet;
    if (paramzzh != null) {
      paramDriveContents = zza(paramMetadataChangeSet, paramzzh);
    }
    return zza(paramGoogleApiClient, paramDriveContents, i, localzzh);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */