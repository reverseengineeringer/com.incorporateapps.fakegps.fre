package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(FrameMetadataParcel paramFrameMetadataParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zzc(paramParcel, 2, width);
    zzb.zzc(paramParcel, 3, height);
    zzb.zzc(paramParcel, 4, id);
    zzb.zza(paramParcel, 5, zzboe);
    zzb.zzc(paramParcel, 6, rotation);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public FrameMetadataParcel zzhn(Parcel paramParcel)
  {
    int i = 0;
    int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    long l = 0L;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < i1)
    {
      int i2 = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzca(i2))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, i2);
        break;
      case 1: 
        n = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i2);
        break;
      case 2: 
        m = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i2);
        break;
      case 3: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i2);
        break;
      case 4: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i2);
        break;
      case 5: 
        l = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, i2);
        break;
      case 6: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i2);
      }
    }
    if (paramParcel.dataPosition() != i1) {
      throw new zza.zza("Overread allowed size end=" + i1, paramParcel);
    }
    return new FrameMetadataParcel(n, m, k, j, l, i);
  }
  
  public FrameMetadataParcel[] zzkL(int paramInt)
  {
    return new FrameMetadataParcel[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.internal.client.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */