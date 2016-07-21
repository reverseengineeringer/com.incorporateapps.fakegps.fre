package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzn
  implements Parcelable.Creator
{
  static void zza(LocationRequestUpdateData paramLocationRequestUpdateData, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, zzaOU);
    zzb.zzc(paramParcel, 1000, paramLocationRequestUpdateData.getVersionCode());
    zzb.zza(paramParcel, 2, zzaOV, paramInt, false);
    zzb.zza(paramParcel, 3, paramLocationRequestUpdateData.zzyQ(), false);
    zzb.zza(paramParcel, 4, mPendingIntent, paramInt, false);
    zzb.zza(paramParcel, 5, paramLocationRequestUpdateData.zzyR(), false);
    zzb.zza(paramParcel, 6, paramLocationRequestUpdateData.zzyS(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public LocationRequestUpdateData zzeY(Parcel paramParcel)
  {
    IBinder localIBinder1 = null;
    int k = zza.zzau(paramParcel);
    int j = 0;
    int i = 1;
    IBinder localIBinder2 = null;
    PendingIntent localPendingIntent = null;
    IBinder localIBinder3 = null;
    LocationRequestInternal localLocationRequestInternal = null;
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
      case 1000: 
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localLocationRequestInternal = (LocationRequestInternal)zza.zza(paramParcel, m, LocationRequestInternal.CREATOR);
        break;
      case 3: 
        localIBinder3 = zza.zzq(paramParcel, m);
        break;
      case 4: 
        localPendingIntent = (PendingIntent)zza.zza(paramParcel, m, PendingIntent.CREATOR);
        break;
      case 5: 
        localIBinder2 = zza.zzq(paramParcel, m);
        break;
      case 6: 
        localIBinder1 = zza.zzq(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new LocationRequestUpdateData(j, i, localLocationRequestInternal, localIBinder3, localPendingIntent, localIBinder2, localIBinder1);
  }
  
  public LocationRequestUpdateData[] zzhE(int paramInt)
  {
    return new LocationRequestUpdateData[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */