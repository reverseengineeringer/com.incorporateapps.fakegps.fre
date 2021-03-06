package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(DocumentId paramDocumentId, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, zzTJ, false);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, zzTK, false);
    zzb.zza(paramParcel, 3, zzTL, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public DocumentId[] zzaj(int paramInt)
  {
    return new DocumentId[paramInt];
  }
  
  public DocumentId zzs(Parcel paramParcel)
  {
    String str3 = null;
    int j = zza.zzau(paramParcel);
    String str1 = null;
    int i = 0;
    String str2 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str3 = zza.zzp(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new DocumentId(i, str1, str2, str3);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appdatasearch.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */