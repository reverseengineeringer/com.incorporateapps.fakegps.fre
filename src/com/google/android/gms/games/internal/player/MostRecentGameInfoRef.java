package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class MostRecentGameInfoRef
  extends zzc
  implements MostRecentGameInfo
{
  private final PlayerColumnNames zzaDh;
  
  public MostRecentGameInfoRef(DataHolder paramDataHolder, int paramInt, PlayerColumnNames paramPlayerColumnNames)
  {
    super(paramDataHolder, paramInt);
    zzaDh = paramPlayerColumnNames;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return MostRecentGameInfoEntity.zza(this, paramObject);
  }
  
  public final int hashCode()
  {
    return MostRecentGameInfoEntity.zza(this);
  }
  
  public final String toString()
  {
    return MostRecentGameInfoEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((MostRecentGameInfoEntity)zzxE()).writeToParcel(paramParcel, paramInt);
  }
  
  public final long zzxA()
  {
    return getLong(zzaDh.zzaIM);
  }
  
  public final Uri zzxB()
  {
    return zzcA(zzaDh.zzaIN);
  }
  
  public final Uri zzxC()
  {
    return zzcA(zzaDh.zzaIO);
  }
  
  public final Uri zzxD()
  {
    return zzcA(zzaDh.zzaIP);
  }
  
  public final MostRecentGameInfo zzxE()
  {
    return new MostRecentGameInfoEntity(this);
  }
  
  public final String zzxy()
  {
    return getString(zzaDh.zzaIK);
  }
  
  public final String zzxz()
  {
    return getString(zzaDh.zzaIL);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.player.MostRecentGameInfoRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */