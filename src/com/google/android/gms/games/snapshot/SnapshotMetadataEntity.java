package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzms;

public final class SnapshotMetadataEntity
  implements SafeParcelable, SnapshotMetadata
{
  public static final Parcelable.Creator CREATOR = new SnapshotMetadataEntityCreator();
  private final int mVersionCode;
  private final String zzaEp;
  private final GameEntity zzaJE;
  private final Uri zzaKQ;
  private final PlayerEntity zzaKT;
  private final String zzaKU;
  private final long zzaKV;
  private final long zzaKW;
  private final float zzaKX;
  private final String zzaKY;
  private final boolean zzaKZ;
  private final long zzaLa;
  private final String zzaLb;
  private final String zzapg;
  private final String zzaxl;
  
  SnapshotMetadataEntity(int paramInt, GameEntity paramGameEntity, PlayerEntity paramPlayerEntity, String paramString1, Uri paramUri, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, float paramFloat, String paramString5, boolean paramBoolean, long paramLong3, String paramString6)
  {
    mVersionCode = paramInt;
    zzaJE = paramGameEntity;
    zzaKT = paramPlayerEntity;
    zzaEp = paramString1;
    zzaKQ = paramUri;
    zzaKU = paramString2;
    zzaKX = paramFloat;
    zzapg = paramString3;
    zzaxl = paramString4;
    zzaKV = paramLong1;
    zzaKW = paramLong2;
    zzaKY = paramString5;
    zzaKZ = paramBoolean;
    zzaLa = paramLong3;
    zzaLb = paramString6;
  }
  
  public SnapshotMetadataEntity(SnapshotMetadata paramSnapshotMetadata)
  {
    mVersionCode = 6;
    zzaJE = new GameEntity(paramSnapshotMetadata.getGame());
    zzaKT = new PlayerEntity(paramSnapshotMetadata.getOwner());
    zzaEp = paramSnapshotMetadata.getSnapshotId();
    zzaKQ = paramSnapshotMetadata.getCoverImageUri();
    zzaKU = paramSnapshotMetadata.getCoverImageUrl();
    zzaKX = paramSnapshotMetadata.getCoverImageAspectRatio();
    zzapg = paramSnapshotMetadata.getTitle();
    zzaxl = paramSnapshotMetadata.getDescription();
    zzaKV = paramSnapshotMetadata.getLastModifiedTimestamp();
    zzaKW = paramSnapshotMetadata.getPlayedTime();
    zzaKY = paramSnapshotMetadata.getUniqueName();
    zzaKZ = paramSnapshotMetadata.hasChangePending();
    zzaLa = paramSnapshotMetadata.getProgressValue();
    zzaLb = paramSnapshotMetadata.getDeviceName();
  }
  
  static int zza(SnapshotMetadata paramSnapshotMetadata)
  {
    return zzw.hashCode(new Object[] { paramSnapshotMetadata.getGame(), paramSnapshotMetadata.getOwner(), paramSnapshotMetadata.getSnapshotId(), paramSnapshotMetadata.getCoverImageUri(), Float.valueOf(paramSnapshotMetadata.getCoverImageAspectRatio()), paramSnapshotMetadata.getTitle(), paramSnapshotMetadata.getDescription(), Long.valueOf(paramSnapshotMetadata.getLastModifiedTimestamp()), Long.valueOf(paramSnapshotMetadata.getPlayedTime()), paramSnapshotMetadata.getUniqueName(), Boolean.valueOf(paramSnapshotMetadata.hasChangePending()), Long.valueOf(paramSnapshotMetadata.getProgressValue()), paramSnapshotMetadata.getDeviceName() });
  }
  
  static boolean zza(SnapshotMetadata paramSnapshotMetadata, Object paramObject)
  {
    if (!(paramObject instanceof SnapshotMetadata)) {}
    do
    {
      return false;
      if (paramSnapshotMetadata == paramObject) {
        return true;
      }
      paramObject = (SnapshotMetadata)paramObject;
    } while ((!zzw.equal(((SnapshotMetadata)paramObject).getGame(), paramSnapshotMetadata.getGame())) || (!zzw.equal(((SnapshotMetadata)paramObject).getOwner(), paramSnapshotMetadata.getOwner())) || (!zzw.equal(((SnapshotMetadata)paramObject).getSnapshotId(), paramSnapshotMetadata.getSnapshotId())) || (!zzw.equal(((SnapshotMetadata)paramObject).getCoverImageUri(), paramSnapshotMetadata.getCoverImageUri())) || (!zzw.equal(Float.valueOf(((SnapshotMetadata)paramObject).getCoverImageAspectRatio()), Float.valueOf(paramSnapshotMetadata.getCoverImageAspectRatio()))) || (!zzw.equal(((SnapshotMetadata)paramObject).getTitle(), paramSnapshotMetadata.getTitle())) || (!zzw.equal(((SnapshotMetadata)paramObject).getDescription(), paramSnapshotMetadata.getDescription())) || (!zzw.equal(Long.valueOf(((SnapshotMetadata)paramObject).getLastModifiedTimestamp()), Long.valueOf(paramSnapshotMetadata.getLastModifiedTimestamp()))) || (!zzw.equal(Long.valueOf(((SnapshotMetadata)paramObject).getPlayedTime()), Long.valueOf(paramSnapshotMetadata.getPlayedTime()))) || (!zzw.equal(((SnapshotMetadata)paramObject).getUniqueName(), paramSnapshotMetadata.getUniqueName())) || (!zzw.equal(Boolean.valueOf(((SnapshotMetadata)paramObject).hasChangePending()), Boolean.valueOf(paramSnapshotMetadata.hasChangePending()))) || (!zzw.equal(Long.valueOf(((SnapshotMetadata)paramObject).getProgressValue()), Long.valueOf(paramSnapshotMetadata.getProgressValue()))) || (!zzw.equal(((SnapshotMetadata)paramObject).getDeviceName(), paramSnapshotMetadata.getDeviceName())));
    return true;
  }
  
  static String zzb(SnapshotMetadata paramSnapshotMetadata)
  {
    return zzw.zzy(paramSnapshotMetadata).zzg("Game", paramSnapshotMetadata.getGame()).zzg("Owner", paramSnapshotMetadata.getOwner()).zzg("SnapshotId", paramSnapshotMetadata.getSnapshotId()).zzg("CoverImageUri", paramSnapshotMetadata.getCoverImageUri()).zzg("CoverImageUrl", paramSnapshotMetadata.getCoverImageUrl()).zzg("CoverImageAspectRatio", Float.valueOf(paramSnapshotMetadata.getCoverImageAspectRatio())).zzg("Description", paramSnapshotMetadata.getDescription()).zzg("LastModifiedTimestamp", Long.valueOf(paramSnapshotMetadata.getLastModifiedTimestamp())).zzg("PlayedTime", Long.valueOf(paramSnapshotMetadata.getPlayedTime())).zzg("UniqueName", paramSnapshotMetadata.getUniqueName()).zzg("ChangePending", Boolean.valueOf(paramSnapshotMetadata.hasChangePending())).zzg("ProgressValue", Long.valueOf(paramSnapshotMetadata.getProgressValue())).zzg("DeviceName", paramSnapshotMetadata.getDeviceName()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final SnapshotMetadata freeze()
  {
    return this;
  }
  
  public final float getCoverImageAspectRatio()
  {
    return zzaKX;
  }
  
  public final Uri getCoverImageUri()
  {
    return zzaKQ;
  }
  
  public final String getCoverImageUrl()
  {
    return zzaKU;
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaxl, paramCharArrayBuffer);
  }
  
  public final String getDeviceName()
  {
    return zzaLb;
  }
  
  public final Game getGame()
  {
    return zzaJE;
  }
  
  public final long getLastModifiedTimestamp()
  {
    return zzaKV;
  }
  
  public final Player getOwner()
  {
    return zzaKT;
  }
  
  public final long getPlayedTime()
  {
    return zzaKW;
  }
  
  public final long getProgressValue()
  {
    return zzaLa;
  }
  
  public final String getSnapshotId()
  {
    return zzaEp;
  }
  
  public final String getTitle()
  {
    return zzapg;
  }
  
  public final String getUniqueName()
  {
    return zzaKY;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final boolean hasChangePending()
  {
    return zzaKZ;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SnapshotMetadataEntityCreator.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotMetadataEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */