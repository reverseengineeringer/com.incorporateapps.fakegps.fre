package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class SnapshotMetadataRef
  extends zzc
  implements SnapshotMetadata
{
  private final Game zzaJc;
  private final Player zzaLc;
  
  public SnapshotMetadataRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    zzaJc = new GameRef(paramDataHolder, paramInt);
    zzaLc = new PlayerRef(paramDataHolder, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return SnapshotMetadataEntity.zza(this, paramObject);
  }
  
  public final SnapshotMetadata freeze()
  {
    return new SnapshotMetadataEntity(this);
  }
  
  public final float getCoverImageAspectRatio()
  {
    float f1 = getFloat("cover_icon_image_height");
    float f2 = getFloat("cover_icon_image_width");
    if (f1 == 0.0F) {
      return 0.0F;
    }
    return f2 / f1;
  }
  
  public final Uri getCoverImageUri()
  {
    return zzcA("cover_icon_image_uri");
  }
  
  public final String getCoverImageUrl()
  {
    return getString("cover_icon_image_url");
  }
  
  public final String getDescription()
  {
    return getString("description");
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("description", paramCharArrayBuffer);
  }
  
  public final String getDeviceName()
  {
    return getString("device_name");
  }
  
  public final Game getGame()
  {
    return zzaJc;
  }
  
  public final long getLastModifiedTimestamp()
  {
    return getLong("last_modified_timestamp");
  }
  
  public final Player getOwner()
  {
    return zzaLc;
  }
  
  public final long getPlayedTime()
  {
    return getLong("duration");
  }
  
  public final long getProgressValue()
  {
    return getLong("progress_value");
  }
  
  public final String getSnapshotId()
  {
    return getString("external_snapshot_id");
  }
  
  public final String getTitle()
  {
    return getString("title");
  }
  
  public final String getUniqueName()
  {
    return getString("unique_name");
  }
  
  public final boolean hasChangePending()
  {
    return getInteger("pending_change_count") > 0;
  }
  
  public final int hashCode()
  {
    return SnapshotMetadataEntity.zza(this);
  }
  
  public final String toString()
  {
    return SnapshotMetadataEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((SnapshotMetadataEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotMetadataRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */