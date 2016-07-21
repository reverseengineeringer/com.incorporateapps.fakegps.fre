package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzc
  implements Parcelable.Creator
{
  static void zza(ScopeDetail paramScopeDetail, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, version);
    zzb.zza(paramParcel, 2, description, false);
    zzb.zza(paramParcel, 3, zzYw, false);
    zzb.zza(paramParcel, 4, zzYx, false);
    zzb.zza(paramParcel, 5, zzYy, false);
    zzb.zza(paramParcel, 6, zzYz, false);
    zzb.zzb(paramParcel, 7, zzYA, false);
    zzb.zza(paramParcel, 8, zzYB, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ScopeDetail zzY(Parcel paramParcel)
  {
    FACLData localFACLData = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
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
        break;
      case 2: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        localArrayList = zza.zzD(paramParcel, k);
        break;
      case 8: 
        localFACLData = (FACLData)zza.zza(paramParcel, k, FACLData.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new ScopeDetail(i, str5, str4, str3, str2, str1, localArrayList, localFACLData);
  }
  
  public ScopeDetail[] zzaV(int paramInt)
  {
    return new ScopeDetail[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.firstparty.shared.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */