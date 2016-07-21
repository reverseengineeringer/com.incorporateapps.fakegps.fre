package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, versionCode);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, intentAction, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, url, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, mimeType, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, packageName, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, zzDK, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, zzDL, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 8, zzDM, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 9, intent, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public AdLauncherIntentInfoParcel zzf(Parcel paramParcel)
  {
    Intent localIntent = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
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
        str7 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str6 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 9: 
        localIntent = (Intent)zza.zza(paramParcel, k, Intent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new AdLauncherIntentInfoParcel(i, str7, str6, str5, str4, str3, str2, str1, localIntent);
  }
  
  public AdLauncherIntentInfoParcel[] zzv(int paramInt)
  {
    return new AdLauncherIntentInfoParcel[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */