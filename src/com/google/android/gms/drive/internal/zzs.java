package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.CreateFileActivityBuilder;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.query.Query;
import java.util.List;

public class zzs
  implements DriveApi
{
  public PendingResult cancelPendingActions(GoogleApiClient paramGoogleApiClient, List paramList)
  {
    return ((zzu)paramGoogleApiClient.zza(Drive.zzUI)).cancelPendingActions(paramGoogleApiClient, paramList);
  }
  
  public PendingResult fetchDriveId(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new zzs.3(this, paramGoogleApiClient, paramString));
  }
  
  public DriveFolder getAppFolder(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = (zzu)paramGoogleApiClient.zza(Drive.zzUI);
    if (!paramGoogleApiClient.zzth()) {
      throw new IllegalStateException("Client is not yet connected");
    }
    paramGoogleApiClient = paramGoogleApiClient.zztg();
    if (paramGoogleApiClient != null) {
      return new zzy(paramGoogleApiClient);
    }
    return null;
  }
  
  public DriveFile getFile(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId)
  {
    if (paramDriveId == null) {
      throw new IllegalArgumentException("Id must be provided.");
    }
    if (!paramGoogleApiClient.isConnected()) {
      throw new IllegalStateException("Client must be connected");
    }
    return new zzw(paramDriveId);
  }
  
  public DriveFolder getFolder(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId)
  {
    if (paramDriveId == null) {
      throw new IllegalArgumentException("Id must be provided.");
    }
    if (!paramGoogleApiClient.isConnected()) {
      throw new IllegalStateException("Client must be connected");
    }
    return new zzy(paramDriveId);
  }
  
  public DriveFolder getRootFolder(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = (zzu)paramGoogleApiClient.zza(Drive.zzUI);
    if (!paramGoogleApiClient.zzth()) {
      throw new IllegalStateException("Client is not yet connected");
    }
    paramGoogleApiClient = paramGoogleApiClient.zztf();
    if (paramGoogleApiClient != null) {
      return new zzy(paramGoogleApiClient);
    }
    return null;
  }
  
  public PendingResult isAutobackupEnabled(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzs.5(this, paramGoogleApiClient));
  }
  
  public CreateFileActivityBuilder newCreateFileActivityBuilder()
  {
    return new CreateFileActivityBuilder();
  }
  
  public PendingResult newDriveContents(GoogleApiClient paramGoogleApiClient)
  {
    return zza(paramGoogleApiClient, 536870912);
  }
  
  public OpenFileActivityBuilder newOpenFileActivityBuilder()
  {
    return new OpenFileActivityBuilder();
  }
  
  public PendingResult query(GoogleApiClient paramGoogleApiClient, Query paramQuery)
  {
    if (paramQuery == null) {
      throw new IllegalArgumentException("Query must be provided.");
    }
    return paramGoogleApiClient.zza(new zzs.1(this, paramGoogleApiClient, paramQuery));
  }
  
  public PendingResult requestSync(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new zzs.4(this, paramGoogleApiClient));
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.zza(new zzs.2(this, paramGoogleApiClient, paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */