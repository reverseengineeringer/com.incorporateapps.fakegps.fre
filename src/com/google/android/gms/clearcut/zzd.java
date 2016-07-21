package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public class zzd
  implements Parcelable.Creator
{
  static void zza(LogEventParcelable paramLogEventParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zza(paramParcel, 2, zzafh, paramInt, false);
    zzb.zza(paramParcel, 3, zzafi, false);
    zzb.zza(paramParcel, 4, zzafj, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LogEventParcelable zzaf(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    byte[] arrayOfByte = null;
    PlayLoggerContext localPlayLoggerContext = null;
    int i = 0;
    int[] arrayOfInt = null;
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
        localPlayLoggerContext = (PlayLoggerContext)zza.zza(paramParcel, k, PlayLoggerContext.CREATOR);
        break;
      case 3: 
        arrayOfByte = zza.zzs(paramParcel, k);
        break;
      case 4: 
        arrayOfInt = zza.zzv(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new LogEventParcelable(i, localPlayLoggerContext, arrayOfByte, arrayOfInt);
  }
  
  public LogEventParcelable[] zzbs(int paramInt)
  {
    return new LogEventParcelable[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.clearcut.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */