package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zza
  implements Parcelable.Creator
{
  static void zza(ComparisonFilter paramComparisonFilter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 1, zzaug, paramInt, false);
    zzb.zza(paramParcel, 2, zzauh, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ComparisonFilter zzcl(Parcel paramParcel)
  {
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    Operator localOperator = null;
    int i = 0;
    MetadataBundle localMetadataBundle = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzca(k))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1000: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 1: 
        localOperator = (Operator)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, Operator.CREATOR);
        break;
      case 2: 
        localMetadataBundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, MetadataBundle.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new ComparisonFilter(i, localOperator, localMetadataBundle);
  }
  
  public ComparisonFilter[] zzeg(int paramInt)
  {
    return new ComparisonFilter[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */