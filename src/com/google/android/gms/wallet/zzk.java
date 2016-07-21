package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

public class zzk
  implements Parcelable.Creator
{
  static void zza(LoyaltyWalletObject paramLoyaltyWalletObject, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramLoyaltyWalletObject.getVersionCode());
    zzb.zza(paramParcel, 2, zzio, false);
    zzb.zza(paramParcel, 3, zzboP, false);
    zzb.zza(paramParcel, 4, zzboQ, false);
    zzb.zza(paramParcel, 5, zzboR, false);
    zzb.zza(paramParcel, 6, zzaQZ, false);
    zzb.zza(paramParcel, 7, zzboS, false);
    zzb.zza(paramParcel, 8, zzboT, false);
    zzb.zza(paramParcel, 9, zzboU, false);
    zzb.zza(paramParcel, 10, zzboV, false);
    zzb.zza(paramParcel, 11, zzboW, false);
    zzb.zzc(paramParcel, 12, state);
    zzb.zzc(paramParcel, 13, zzboX, false);
    zzb.zza(paramParcel, 14, zzboY, paramInt, false);
    zzb.zzc(paramParcel, 15, zzboZ, false);
    zzb.zza(paramParcel, 17, zzbpb, false);
    zzb.zza(paramParcel, 16, zzbpa, false);
    zzb.zza(paramParcel, 19, zzbpd);
    zzb.zzc(paramParcel, 18, zzbpc, false);
    zzb.zzc(paramParcel, 21, zzbpf, false);
    zzb.zzc(paramParcel, 20, zzbpe, false);
    zzb.zza(paramParcel, 23, zzbph, paramInt, false);
    zzb.zzc(paramParcel, 22, zzbpg, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LoyaltyWalletObject zzhy(Parcel paramParcel)
  {
    int k = zza.zzau(paramParcel);
    int j = 0;
    String str12 = null;
    String str11 = null;
    String str10 = null;
    String str9 = null;
    String str8 = null;
    String str7 = null;
    String str6 = null;
    String str5 = null;
    String str4 = null;
    String str3 = null;
    int i = 0;
    ArrayList localArrayList6 = zzmn.zzsa();
    TimeInterval localTimeInterval = null;
    ArrayList localArrayList5 = zzmn.zzsa();
    String str2 = null;
    String str1 = null;
    ArrayList localArrayList4 = zzmn.zzsa();
    boolean bool = false;
    ArrayList localArrayList3 = zzmn.zzsa();
    ArrayList localArrayList2 = zzmn.zzsa();
    ArrayList localArrayList1 = zzmn.zzsa();
    LoyaltyPoints localLoyaltyPoints = null;
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
        str12 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        str11 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        str10 = zza.zzp(paramParcel, m);
        break;
      case 5: 
        str9 = zza.zzp(paramParcel, m);
        break;
      case 6: 
        str8 = zza.zzp(paramParcel, m);
        break;
      case 7: 
        str7 = zza.zzp(paramParcel, m);
        break;
      case 8: 
        str6 = zza.zzp(paramParcel, m);
        break;
      case 9: 
        str5 = zza.zzp(paramParcel, m);
        break;
      case 10: 
        str4 = zza.zzp(paramParcel, m);
        break;
      case 11: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 12: 
        i = zza.zzg(paramParcel, m);
        break;
      case 13: 
        localArrayList6 = zza.zzc(paramParcel, m, WalletObjectMessage.CREATOR);
        break;
      case 14: 
        localTimeInterval = (TimeInterval)zza.zza(paramParcel, m, TimeInterval.CREATOR);
        break;
      case 15: 
        localArrayList5 = zza.zzc(paramParcel, m, LatLng.CREATOR);
        break;
      case 17: 
        str1 = zza.zzp(paramParcel, m);
        break;
      case 16: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 19: 
        bool = zza.zzc(paramParcel, m);
        break;
      case 18: 
        localArrayList4 = zza.zzc(paramParcel, m, LabelValueRow.CREATOR);
        break;
      case 21: 
        localArrayList2 = zza.zzc(paramParcel, m, TextModuleData.CREATOR);
        break;
      case 20: 
        localArrayList3 = zza.zzc(paramParcel, m, UriData.CREATOR);
        break;
      case 23: 
        localLoyaltyPoints = (LoyaltyPoints)zza.zza(paramParcel, m, LoyaltyPoints.CREATOR);
        break;
      case 22: 
        localArrayList1 = zza.zzc(paramParcel, m, UriData.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new LoyaltyWalletObject(j, str12, str11, str10, str9, str8, str7, str6, str5, str4, str3, i, localArrayList6, localTimeInterval, localArrayList5, str2, str1, localArrayList4, bool, localArrayList3, localArrayList2, localArrayList1, localLoyaltyPoints);
  }
  
  public LoyaltyWalletObject[] zzkW(int paramInt)
  {
    return new LoyaltyWalletObject[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */