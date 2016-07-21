package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;

public final class PlayerLevel
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new PlayerLevelCreator();
  private final int mVersionCode;
  private final int zzaDa;
  private final long zzaDb;
  private final long zzaDc;
  
  PlayerLevel(int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    if (paramLong1 >= 0L)
    {
      bool1 = true;
      zzx.zza(bool1, "Min XP must be positive!");
      if (paramLong2 <= paramLong1) {
        break label69;
      }
    }
    label69:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "Max XP must be more than min XP!");
      mVersionCode = paramInt1;
      zzaDa = paramInt2;
      zzaDb = paramLong1;
      zzaDc = paramLong2;
      return;
      bool1 = false;
      break;
    }
  }
  
  public PlayerLevel(int paramInt, long paramLong1, long paramLong2)
  {
    this(1, paramInt, paramLong1, paramLong2);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PlayerLevel)) {}
    do
    {
      return false;
      if (this == paramObject) {
        return true;
      }
      paramObject = (PlayerLevel)paramObject;
    } while ((!zzw.equal(Integer.valueOf(((PlayerLevel)paramObject).getLevelNumber()), Integer.valueOf(getLevelNumber()))) || (!zzw.equal(Long.valueOf(((PlayerLevel)paramObject).getMinXp()), Long.valueOf(getMinXp()))) || (!zzw.equal(Long.valueOf(((PlayerLevel)paramObject).getMaxXp()), Long.valueOf(getMaxXp()))));
    return true;
  }
  
  public final int getLevelNumber()
  {
    return zzaDa;
  }
  
  public final long getMaxXp()
  {
    return zzaDc;
  }
  
  public final long getMinXp()
  {
    return zzaDb;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzaDa), Long.valueOf(zzaDb), Long.valueOf(zzaDc) });
  }
  
  public final String toString()
  {
    return zzw.zzy(this).zzg("LevelNumber", Integer.valueOf(getLevelNumber())).zzg("MinXp", Long.valueOf(getMinXp())).zzg("MaxXp", Long.valueOf(getMaxXp())).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    PlayerLevelCreator.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.PlayerLevel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */