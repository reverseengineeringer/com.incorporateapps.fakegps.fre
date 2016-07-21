package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class SnapshotEntity
  implements SafeParcelable, Snapshot
{
  public static final Parcelable.Creator CREATOR = new SnapshotEntityCreator();
  private final int mVersionCode;
  private final SnapshotMetadataEntity zzaKL;
  private final SnapshotContentsEntity zzaKM;
  
  SnapshotEntity(int paramInt, SnapshotMetadata paramSnapshotMetadata, SnapshotContentsEntity paramSnapshotContentsEntity)
  {
    mVersionCode = paramInt;
    zzaKL = new SnapshotMetadataEntity(paramSnapshotMetadata);
    zzaKM = paramSnapshotContentsEntity;
  }
  
  public SnapshotEntity(SnapshotMetadata paramSnapshotMetadata, SnapshotContentsEntity paramSnapshotContentsEntity)
  {
    this(2, paramSnapshotMetadata, paramSnapshotContentsEntity);
  }
  
  private boolean isClosed()
  {
    return zzaKM.isClosed();
  }
  
  static boolean zza(Snapshot paramSnapshot, Object paramObject)
  {
    if (!(paramObject instanceof Snapshot)) {}
    do
    {
      return false;
      if (paramSnapshot == paramObject) {
        return true;
      }
      paramObject = (Snapshot)paramObject;
    } while ((!zzw.equal(((Snapshot)paramObject).getMetadata(), paramSnapshot.getMetadata())) || (!zzw.equal(((Snapshot)paramObject).getSnapshotContents(), paramSnapshot.getSnapshotContents())));
    return true;
  }
  
  static int zzb(Snapshot paramSnapshot)
  {
    return zzw.hashCode(new Object[] { paramSnapshot.getMetadata(), paramSnapshot.getSnapshotContents() });
  }
  
  static String zzc(Snapshot paramSnapshot)
  {
    zzw.zza localzza = zzw.zzy(paramSnapshot).zzg("Metadata", paramSnapshot.getMetadata());
    if (paramSnapshot.getSnapshotContents() != null) {}
    for (boolean bool = true;; bool = false) {
      return localzza.zzg("HasContents", Boolean.valueOf(bool)).toString();
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Snapshot freeze()
  {
    return this;
  }
  
  public final SnapshotMetadata getMetadata()
  {
    return zzaKL;
  }
  
  public final SnapshotContents getSnapshotContents()
  {
    if (isClosed()) {
      return null;
    }
    return zzaKM;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzb(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzc(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SnapshotEntityCreator.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */