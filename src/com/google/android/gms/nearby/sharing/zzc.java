package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(SharedContent paramSharedContent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramSharedContent.getVersionCode());
    zzb.zza(paramParcel, 3, paramSharedContent.getUri(), false);
    zzb.zza(paramParcel, 8, paramSharedContent.zzEL(), paramInt, false);
    zzb.zza(paramParcel, 9, paramSharedContent.zzEM(), paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SharedContent zzgs(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    ViewableItem[] arrayOfViewableItem = null;
    String str = null;
    int i = 0;
    LocalContent[] arrayOfLocalContent = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      case 2: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        i = zza.zzg(paramParcel, k);
        break;
      case 3: 
        str = zza.zzp(paramParcel, k);
        break;
      case 8: 
        arrayOfViewableItem = (ViewableItem[])zza.zzb(paramParcel, k, ViewableItem.CREATOR);
        break;
      case 9: 
        arrayOfLocalContent = (LocalContent[])zza.zzb(paramParcel, k, LocalContent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SharedContent(i, str, arrayOfViewableItem, arrayOfLocalContent);
  }
  
  public SharedContent[] zzjy(int paramInt)
  {
    return new SharedContent[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */