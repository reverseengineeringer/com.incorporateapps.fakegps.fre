package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveFileRange;
import java.util.ArrayList;

public class zzay
  implements Parcelable.Creator
{
  static void zza(OnDownloadProgressResponse paramOnDownloadProgressResponse, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzasi);
    zzb.zza(paramParcel, 3, zzasj);
    zzb.zzc(paramParcel, 4, zzBc);
    zzb.zzc(paramParcel, 5, zzask, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public OnDownloadProgressResponse zzbB(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    int k = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    long l2 = 0L;
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
        break;
      case 2: 
        l2 = zza.zzi(paramParcel, m);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, m);
        break;
      case 4: 
        i = zza.zzg(paramParcel, m);
        break;
      case 5: 
        localArrayList = zza.zzc(paramParcel, m, DriveFileRange.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new OnDownloadProgressResponse(j, l2, l1, i, localArrayList);
  }
  
  public OnDownloadProgressResponse[] zzdw(int paramInt)
  {
    return new OnDownloadProgressResponse[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */