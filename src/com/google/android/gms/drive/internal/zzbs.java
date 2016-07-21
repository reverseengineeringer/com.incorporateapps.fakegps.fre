package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbs
  implements Parcelable.Creator
{
  static void zza(SetPinnedDownloadPreferencesRequest paramSetPinnedDownloadPreferencesRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzasu, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SetPinnedDownloadPreferencesRequest zzbU(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    ParcelableTransferPreferences localParcelableTransferPreferences = null;
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
        localParcelableTransferPreferences = (ParcelableTransferPreferences)zza.zza(paramParcel, k, ParcelableTransferPreferences.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SetPinnedDownloadPreferencesRequest(i, localParcelableTransferPreferences);
  }
  
  public SetPinnedDownloadPreferencesRequest[] zzdP(int paramInt)
  {
    return new SetPinnedDownloadPreferencesRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzbs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */