package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import java.util.HashSet;
import java.util.Set;

public class zzb
  implements Parcelable.Creator
{
  static void zza(PersonEntity.AgeRangeEntity paramAgeRangeEntity, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    Set localSet = zzbeN;
    if (localSet.contains(Integer.valueOf(1))) {
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, mVersionCode);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 2, zzbge);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 3, zzbgf);
    }
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, paramInt);
  }
  
  public PersonEntity.AgeRangeEntity zzgF(Parcel paramParcel)
  {
    int k = 0;
    int m = zza.zzau(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = zza.zzat(paramParcel);
      switch (zza.zzca(n))
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        i = zza.zzg(paramParcel, n);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        j = zza.zzg(paramParcel, n);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3: 
        k = zza.zzg(paramParcel, n);
        localHashSet.add(Integer.valueOf(3));
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new PersonEntity.AgeRangeEntity(localHashSet, i, j, k);
  }
  
  public PersonEntity.AgeRangeEntity[] zzjM(int paramInt)
  {
    return new PersonEntity.AgeRangeEntity[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */