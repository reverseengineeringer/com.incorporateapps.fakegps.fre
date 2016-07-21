package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public final class PlayerLevelInfo
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new PlayerLevelInfoCreator();
  private final int mVersionCode;
  private final long zzaDd;
  private final long zzaDe;
  private final PlayerLevel zzaDf;
  private final PlayerLevel zzaDg;
  
  PlayerLevelInfo(int paramInt, long paramLong1, long paramLong2, PlayerLevel paramPlayerLevel1, PlayerLevel paramPlayerLevel2)
  {
    if (paramLong1 != -1L) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzab(bool);
      zzx.zzz(paramPlayerLevel1);
      zzx.zzz(paramPlayerLevel2);
      mVersionCode = paramInt;
      zzaDd = paramLong1;
      zzaDe = paramLong2;
      zzaDf = paramPlayerLevel1;
      zzaDg = paramPlayerLevel2;
      return;
    }
  }
  
  public PlayerLevelInfo(long paramLong1, long paramLong2, PlayerLevel paramPlayerLevel1, PlayerLevel paramPlayerLevel2)
  {
    this(1, paramLong1, paramLong2, paramPlayerLevel1, paramPlayerLevel2);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PlayerLevelInfo)) {}
    do
    {
      return false;
      if (paramObject == this) {
        return true;
      }
      paramObject = (PlayerLevelInfo)paramObject;
    } while ((!zzw.equal(Long.valueOf(zzaDd), Long.valueOf(zzaDd))) || (!zzw.equal(Long.valueOf(zzaDe), Long.valueOf(zzaDe))) || (!zzw.equal(zzaDf, zzaDf)) || (!zzw.equal(zzaDg, zzaDg)));
    return true;
  }
  
  public final PlayerLevel getCurrentLevel()
  {
    return zzaDf;
  }
  
  public final long getCurrentXpTotal()
  {
    return zzaDd;
  }
  
  public final long getLastLevelUpTimestamp()
  {
    return zzaDe;
  }
  
  public final PlayerLevel getNextLevel()
  {
    return zzaDg;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Long.valueOf(zzaDd), Long.valueOf(zzaDe), zzaDf, zzaDg });
  }
  
  public final boolean isMaxLevel()
  {
    return zzaDf.equals(zzaDg);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    PlayerLevelInfoCreator.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.PlayerLevelInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */