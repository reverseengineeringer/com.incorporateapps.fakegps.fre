package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzmn;
import java.util.ArrayList;

public class zzc
  implements Parcelable.Creator
{
  static void zza(LabelValueRow paramLabelValueRow, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramLabelValueRow.getVersionCode());
    zzb.zza(paramParcel, 2, zzbqF, false);
    zzb.zza(paramParcel, 3, zzbqG, false);
    zzb.zzc(paramParcel, 4, zzbqH, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public LabelValueRow zzhQ(Parcel paramParcel)
  {
    String str2 = null;
    int j = zza.zzau(paramParcel);
    ArrayList localArrayList = zzmn.zzsa();
    int i = 0;
    String str1 = null;
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
        str1 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localArrayList = zza.zzc(paramParcel, k, LabelValue.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new LabelValueRow(i, str1, str2, localArrayList);
  }
  
  public LabelValueRow[] zzlr(int paramInt)
  {
    return new LabelValueRow[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.wobs.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */