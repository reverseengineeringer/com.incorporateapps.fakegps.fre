package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class SnapshotMetadataChangeEntity
  extends SnapshotMetadataChange
  implements SafeParcelable
{
  public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();
  private final int mVersionCode;
  private final Long zzaKO;
  private final Uri zzaKQ;
  private final Long zzaKR;
  private BitmapTeleporter zzaKS;
  private final String zzaxl;
  
  SnapshotMetadataChangeEntity()
  {
    this(5, null, null, null, null, null);
  }
  
  SnapshotMetadataChangeEntity(int paramInt, String paramString, Long paramLong1, BitmapTeleporter paramBitmapTeleporter, Uri paramUri, Long paramLong2)
  {
    mVersionCode = paramInt;
    zzaxl = paramString;
    zzaKR = paramLong1;
    zzaKS = paramBitmapTeleporter;
    zzaKQ = paramUri;
    zzaKO = paramLong2;
    if (zzaKS != null) {
      if (zzaKQ == null) {
        zzx.zza(bool1, "Cannot set both a URI and an image");
      }
    }
    while (zzaKQ == null) {
      for (;;)
      {
        return;
        bool1 = false;
      }
    }
    if (zzaKS == null) {}
    for (bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "Cannot set both a URI and an image");
      return;
    }
  }
  
  SnapshotMetadataChangeEntity(String paramString, Long paramLong1, BitmapTeleporter paramBitmapTeleporter, Uri paramUri, Long paramLong2)
  {
    this(5, paramString, paramLong1, paramBitmapTeleporter, paramUri, paramLong2);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final Bitmap getCoverImage()
  {
    if (zzaKS == null) {
      return null;
    }
    return zzaKS.zzqa();
  }
  
  public final Uri getCoverImageUri()
  {
    return zzaKQ;
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final Long getPlayedTimeMillis()
  {
    return zzaKR;
  }
  
  public final Long getProgressValue()
  {
    return zzaKO;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SnapshotMetadataChangeCreator.zza(this, paramParcel, paramInt);
  }
  
  public final BitmapTeleporter zzxU()
  {
    return zzaKS;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */