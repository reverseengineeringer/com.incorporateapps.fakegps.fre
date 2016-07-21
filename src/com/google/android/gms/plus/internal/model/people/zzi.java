package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzi
  implements Parcelable.Creator
{
  static void zza(PersonEntity.PlacesLivedEntity paramPlacesLivedEntity, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    Set localSet = zzbeN;
    if (localSet.contains(Integer.valueOf(1))) {
      zzb.zzc(paramParcel, 1, mVersionCode);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      zzb.zza(paramParcel, 2, zzbgr);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      zzb.zza(paramParcel, 3, mValue, true);
    }
    zzb.zzI(paramParcel, paramInt);
  }
  
  public PersonEntity.PlacesLivedEntity zzgM(Parcel paramParcel)
  {
    boolean bool = false;
    int j = zza.zzau(paramParcel);
    HashSet localHashSet = new HashSet();
    String str = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        i = zza.zzg(paramParcel, k);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        bool = zza.zzc(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3: 
        str = zza.zzp(paramParcel, k);
        localHashSet.add(Integer.valueOf(3));
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new PersonEntity.PlacesLivedEntity(localHashSet, i, bool, str);
  }
  
  public PersonEntity.PlacesLivedEntity[] zzjT(int paramInt)
  {
    return new PersonEntity.PlacesLivedEntity[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */