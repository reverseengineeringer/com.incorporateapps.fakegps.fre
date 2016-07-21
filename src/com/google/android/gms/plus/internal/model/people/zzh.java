package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzh
  implements Parcelable.Creator
{
  static void zza(PersonEntity.OrganizationsEntity paramOrganizationsEntity, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    Set localSet = zzbeN;
    if (localSet.contains(Integer.valueOf(1))) {
      zzb.zzc(paramParcel, 1, mVersionCode);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      zzb.zza(paramParcel, 2, zzbgp, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      zzb.zza(paramParcel, 3, zzaxl, true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      zzb.zza(paramParcel, 4, zzbfk, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      zzb.zza(paramParcel, 5, zzbgq, true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      zzb.zza(paramParcel, 6, mName, true);
    }
    if (localSet.contains(Integer.valueOf(7))) {
      zzb.zza(paramParcel, 7, zzbgr);
    }
    if (localSet.contains(Integer.valueOf(8))) {
      zzb.zza(paramParcel, 8, zzbfA, true);
    }
    if (localSet.contains(Integer.valueOf(9))) {
      zzb.zza(paramParcel, 9, zzapg, true);
    }
    if (localSet.contains(Integer.valueOf(10))) {
      zzb.zzc(paramParcel, 10, zzabB);
    }
    zzb.zzI(paramParcel, paramInt);
  }
  
  public PersonEntity.OrganizationsEntity zzgL(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int k = zza.zzau(paramParcel);
    HashSet localHashSet = new HashSet();
    String str2 = null;
    boolean bool = false;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = zza.zzg(paramParcel, m);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        str7 = zza.zzp(paramParcel, m);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3: 
        str6 = zza.zzp(paramParcel, m);
        localHashSet.add(Integer.valueOf(3));
        break;
      case 4: 
        str5 = zza.zzp(paramParcel, m);
        localHashSet.add(Integer.valueOf(4));
        break;
      case 5: 
        str4 = zza.zzp(paramParcel, m);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, m);
        localHashSet.add(Integer.valueOf(6));
        break;
      case 7: 
        bool = zza.zzc(paramParcel, m);
        localHashSet.add(Integer.valueOf(7));
        break;
      case 8: 
        str2 = zza.zzp(paramParcel, m);
        localHashSet.add(Integer.valueOf(8));
        break;
      case 9: 
        str1 = zza.zzp(paramParcel, m);
        localHashSet.add(Integer.valueOf(9));
        break;
      case 10: 
        i = zza.zzg(paramParcel, m);
        localHashSet.add(Integer.valueOf(10));
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new PersonEntity.OrganizationsEntity(localHashSet, j, str7, str6, str5, str4, str3, bool, str2, str1, i);
  }
  
  public PersonEntity.OrganizationsEntity[] zzjS(int paramInt)
  {
    return new PersonEntity.OrganizationsEntity[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */