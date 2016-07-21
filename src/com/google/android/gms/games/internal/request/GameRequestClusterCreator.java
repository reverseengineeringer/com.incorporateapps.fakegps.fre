package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;

public class GameRequestClusterCreator
  implements Parcelable.Creator
{
  static void zza(GameRequestCluster paramGameRequestCluster, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramGameRequestCluster.zzxF(), false);
    zzb.zzc(paramParcel, 1000, paramGameRequestCluster.getVersionCode());
    zzb.zzI(paramParcel, paramInt);
  }
  
  public GameRequestCluster zzeq(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localArrayList = zza.zzc(paramParcel, k, GameRequestEntity.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new GameRequestCluster(i, localArrayList);
  }
  
  public GameRequestCluster[] zzgF(int paramInt)
  {
    return new GameRequestCluster[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.request.GameRequestClusterCreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */