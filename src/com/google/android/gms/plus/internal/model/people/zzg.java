package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzg
  implements Parcelable.Creator
{
  static void zza(PersonEntity.NameEntity paramNameEntity, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    Set localSet = zzbeN;
    if (localSet.contains(Integer.valueOf(1))) {
      zzb.zzc(paramParcel, 1, mVersionCode);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      zzb.zza(paramParcel, 2, zzbfl, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      zzb.zza(paramParcel, 3, zzbgl, true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      zzb.zza(paramParcel, 4, zzbfo, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      zzb.zza(paramParcel, 5, zzbgm, true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      zzb.zza(paramParcel, 6, zzbgn, true);
    }
    if (localSet.contains(Integer.valueOf(7))) {
      zzb.zza(paramParcel, 7, zzbgo, true);
    }
    zzb.zzI(paramParcel, paramInt);
  }
  
  public PersonEntity.NameEntity zzgK(Parcel paramParcel)
  {
    String str1 = null;
    int j = zza.zzau(paramParcel);
    HashSet localHashSet = new HashSet();
    int i = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
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
        str6 = zza.zzp(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3: 
        str5 = zza.zzp(paramParcel, k);
        localHashSet.add(Integer.valueOf(3));
        break;
      case 4: 
        str4 = zza.zzp(paramParcel, k);
        localHashSet.add(Integer.valueOf(4));
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, k);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, k);
        localHashSet.add(Integer.valueOf(6));
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, k);
        localHashSet.add(Integer.valueOf(7));
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new PersonEntity.NameEntity(localHashSet, i, str6, str5, str4, str3, str2, str1);
  }
  
  public PersonEntity.NameEntity[] zzjR(int paramInt)
  {
    return new PersonEntity.NameEntity[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */