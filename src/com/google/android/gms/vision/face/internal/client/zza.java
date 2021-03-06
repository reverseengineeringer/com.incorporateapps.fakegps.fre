package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(FaceParcel paramFaceParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zzc(paramParcel, 2, id);
    zzb.zza(paramParcel, 3, centerX);
    zzb.zza(paramParcel, 4, centerY);
    zzb.zza(paramParcel, 5, width);
    zzb.zza(paramParcel, 6, height);
    zzb.zza(paramParcel, 7, zzbnP);
    zzb.zza(paramParcel, 8, zzbnQ);
    zzb.zza(paramParcel, 9, zzbnR, paramInt, false);
    zzb.zza(paramParcel, 10, zzbnS);
    zzb.zza(paramParcel, 11, zzbnT);
    zzb.zza(paramParcel, 12, zzbnU);
    zzb.zzI(paramParcel, i);
  }
  
  public FaceParcel zzhk(Parcel paramParcel)
  {
    int k = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    int i = 0;
    float f9 = 0.0F;
    float f8 = 0.0F;
    float f7 = 0.0F;
    float f6 = 0.0F;
    float f5 = 0.0F;
    float f4 = 0.0F;
    LandmarkParcel[] arrayOfLandmarkParcel = null;
    float f3 = 0.0F;
    float f2 = 0.0F;
    float f1 = 0.0F;
    while (paramParcel.dataPosition() < k)
    {
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzca(m))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 3: 
        f9 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 4: 
        f8 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 5: 
        f7 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 6: 
        f6 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 7: 
        f5 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 8: 
        f4 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 9: 
        arrayOfLandmarkParcel = (LandmarkParcel[])com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m, LandmarkParcel.CREATOR);
        break;
      case 10: 
        f3 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 11: 
        f2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 12: 
        f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new FaceParcel(j, i, f9, f8, f7, f6, f5, f4, arrayOfLandmarkParcel, f3, f2, f1);
  }
  
  public FaceParcel[] zzkH(int paramInt)
  {
    return new FaceParcel[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.internal.client.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */