package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;

public class zzi
  implements Parcelable.Creator
{
  static void zza(CloseContentsRequest paramCloseContentsRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaql, paramInt, false);
    zzb.zza(paramParcel, 3, zzaqp, false);
    zzb.zzc(paramParcel, 4, zzaqn);
    zzb.zzI(paramParcel, i);
  }
  
  public CloseContentsRequest zzbg(Parcel paramParcel)
  {
    int k = zza.zzau(paramParcel);
    Boolean localBoolean = null;
    Contents localContents = null;
    int i = 0;
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
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localContents = (Contents)zza.zza(paramParcel, m, Contents.CREATOR);
        break;
      case 3: 
        localBoolean = zza.zzd(paramParcel, m);
        break;
      case 4: 
        j = zza.zzg(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new CloseContentsRequest(i, localContents, localBoolean, j);
  }
  
  public CloseContentsRequest[] zzcW(int paramInt)
  {
    return new CloseContentsRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */