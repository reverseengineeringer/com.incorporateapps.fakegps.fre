package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class SnapshotEntityCreator
  implements Parcelable.Creator
{
  static void zza(SnapshotEntity paramSnapshotEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramSnapshotEntity.getMetadata(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramSnapshotEntity.getVersionCode());
    zzb.zza(paramParcel, 3, paramSnapshotEntity.getSnapshotContents(), paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SnapshotEntity zzeB(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    SnapshotMetadataEntity localSnapshotMetadataEntity = null;
    int i = 0;
    SnapshotContentsEntity localSnapshotContentsEntity = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localSnapshotMetadataEntity = (SnapshotMetadataEntity)zza.zza(paramParcel, k, SnapshotMetadataEntity.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 3: 
        localSnapshotContentsEntity = (SnapshotContentsEntity)zza.zza(paramParcel, k, SnapshotContentsEntity.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SnapshotEntity(i, localSnapshotMetadataEntity, localSnapshotContentsEntity);
  }
  
  public SnapshotEntity[] zzgS(int paramInt)
  {
    return new SnapshotEntity[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotEntityCreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */