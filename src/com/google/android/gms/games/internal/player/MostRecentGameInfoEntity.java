package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class MostRecentGameInfoEntity
  implements SafeParcelable, MostRecentGameInfo
{
  public static final MostRecentGameInfoEntityCreator CREATOR = new MostRecentGameInfoEntityCreator();
  private final int mVersionCode;
  private final String zzaIm;
  private final String zzaIn;
  private final long zzaIo;
  private final Uri zzaIp;
  private final Uri zzaIq;
  private final Uri zzaIr;
  
  MostRecentGameInfoEntity(int paramInt, String paramString1, String paramString2, long paramLong, Uri paramUri1, Uri paramUri2, Uri paramUri3)
  {
    mVersionCode = paramInt;
    zzaIm = paramString1;
    zzaIn = paramString2;
    zzaIo = paramLong;
    zzaIp = paramUri1;
    zzaIq = paramUri2;
    zzaIr = paramUri3;
  }
  
  public MostRecentGameInfoEntity(MostRecentGameInfo paramMostRecentGameInfo)
  {
    mVersionCode = 2;
    zzaIm = paramMostRecentGameInfo.zzxy();
    zzaIn = paramMostRecentGameInfo.zzxz();
    zzaIo = paramMostRecentGameInfo.zzxA();
    zzaIp = paramMostRecentGameInfo.zzxB();
    zzaIq = paramMostRecentGameInfo.zzxC();
    zzaIr = paramMostRecentGameInfo.zzxD();
  }
  
  static int zza(MostRecentGameInfo paramMostRecentGameInfo)
  {
    return zzw.hashCode(new Object[] { paramMostRecentGameInfo.zzxy(), paramMostRecentGameInfo.zzxz(), Long.valueOf(paramMostRecentGameInfo.zzxA()), paramMostRecentGameInfo.zzxB(), paramMostRecentGameInfo.zzxC(), paramMostRecentGameInfo.zzxD() });
  }
  
  static boolean zza(MostRecentGameInfo paramMostRecentGameInfo, Object paramObject)
  {
    if (!(paramObject instanceof MostRecentGameInfo)) {}
    do
    {
      return false;
      if (paramMostRecentGameInfo == paramObject) {
        return true;
      }
      paramObject = (MostRecentGameInfo)paramObject;
    } while ((!zzw.equal(((MostRecentGameInfo)paramObject).zzxy(), paramMostRecentGameInfo.zzxy())) || (!zzw.equal(((MostRecentGameInfo)paramObject).zzxz(), paramMostRecentGameInfo.zzxz())) || (!zzw.equal(Long.valueOf(((MostRecentGameInfo)paramObject).zzxA()), Long.valueOf(paramMostRecentGameInfo.zzxA()))) || (!zzw.equal(((MostRecentGameInfo)paramObject).zzxB(), paramMostRecentGameInfo.zzxB())) || (!zzw.equal(((MostRecentGameInfo)paramObject).zzxC(), paramMostRecentGameInfo.zzxC())) || (!zzw.equal(((MostRecentGameInfo)paramObject).zzxD(), paramMostRecentGameInfo.zzxD())));
    return true;
  }
  
  static String zzb(MostRecentGameInfo paramMostRecentGameInfo)
  {
    return zzw.zzy(paramMostRecentGameInfo).zzg("GameId", paramMostRecentGameInfo.zzxy()).zzg("GameName", paramMostRecentGameInfo.zzxz()).zzg("ActivityTimestampMillis", Long.valueOf(paramMostRecentGameInfo.zzxA())).zzg("GameIconUri", paramMostRecentGameInfo.zzxB()).zzg("GameHiResUri", paramMostRecentGameInfo.zzxC()).zzg("GameFeaturedUri", paramMostRecentGameInfo.zzxD()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    MostRecentGameInfoEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final long zzxA()
  {
    return zzaIo;
  }
  
  public final Uri zzxB()
  {
    return zzaIp;
  }
  
  public final Uri zzxC()
  {
    return zzaIq;
  }
  
  public final Uri zzxD()
  {
    return zzaIr;
  }
  
  public final MostRecentGameInfo zzxE()
  {
    return this;
  }
  
  public final String zzxy()
  {
    return zzaIm;
  }
  
  public final String zzxz()
  {
    return zzaIn;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.player.MostRecentGameInfoEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */