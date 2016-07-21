package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(RegisterSectionInfo paramRegisterSectionInfo, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, name, false);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, zzUd, false);
    zzb.zza(paramParcel, 3, zzUe);
    zzb.zzc(paramParcel, 4, weight);
    zzb.zza(paramParcel, 5, zzUf);
    zzb.zza(paramParcel, 6, zzUg, false);
    zzb.zza(paramParcel, 7, zzUh, paramInt, false);
    zzb.zza(paramParcel, 8, zzUi, false);
    zzb.zza(paramParcel, 11, zzUj, false);
    zzb.zzI(paramParcel, i);
  }
  
  public RegisterSectionInfo[] zzaq(int paramInt)
  {
    return new RegisterSectionInfo[paramInt];
  }
  
  public RegisterSectionInfo zzx(Parcel paramParcel)
  {
    boolean bool1 = false;
    String str1 = null;
    int k = zza.zzau(paramParcel);
    int i = 1;
    int[] arrayOfInt = null;
    Feature[] arrayOfFeature = null;
    String str2 = null;
    boolean bool2 = false;
    String str3 = null;
    String str4 = null;
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
        str4 = zza.zzp(paramParcel, m);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        bool2 = zza.zzc(paramParcel, m);
        break;
      case 4: 
        i = zza.zzg(paramParcel, m);
        break;
      case 5: 
        bool1 = zza.zzc(paramParcel, m);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 7: 
        arrayOfFeature = (Feature[])zza.zzb(paramParcel, m, Feature.CREATOR);
        break;
      case 8: 
        arrayOfInt = zza.zzv(paramParcel, m);
        break;
      case 11: 
        str1 = zza.zzp(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new RegisterSectionInfo(j, str4, str3, bool2, i, bool1, str2, arrayOfFeature, arrayOfInt, str1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appdatasearch.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */