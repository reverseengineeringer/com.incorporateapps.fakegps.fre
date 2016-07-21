package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class PlayerStatsEntity
  implements SafeParcelable, PlayerStats
{
  public static final Parcelable.Creator CREATOR = new PlayerStatsEntityCreator();
  private final int mVersionCode;
  private final float zzaLd;
  private final float zzaLe;
  private final int zzaLf;
  private final int zzaLg;
  private final int zzaLh;
  private final float zzaLi;
  private final float zzaLj;
  private final Bundle zzaLk;
  private final float zzaLl;
  
  PlayerStatsEntity(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4, Bundle paramBundle, float paramFloat5)
  {
    mVersionCode = paramInt1;
    zzaLd = paramFloat1;
    zzaLe = paramFloat2;
    zzaLf = paramInt2;
    zzaLg = paramInt3;
    zzaLh = paramInt4;
    zzaLi = paramFloat3;
    zzaLj = paramFloat4;
    zzaLk = paramBundle;
    zzaLl = paramFloat5;
  }
  
  public PlayerStatsEntity(PlayerStats paramPlayerStats)
  {
    mVersionCode = 3;
    zzaLd = paramPlayerStats.getAverageSessionLength();
    zzaLe = paramPlayerStats.getChurnProbability();
    zzaLf = paramPlayerStats.getDaysSinceLastPlayed();
    zzaLg = paramPlayerStats.getNumberOfPurchases();
    zzaLh = paramPlayerStats.getNumberOfSessions();
    zzaLi = paramPlayerStats.getSessionPercentile();
    zzaLj = paramPlayerStats.getSpendPercentile();
    zzaLl = paramPlayerStats.getSpendProbability();
    zzaLk = paramPlayerStats.zzxV();
  }
  
  static int zza(PlayerStats paramPlayerStats)
  {
    return zzw.hashCode(new Object[] { Float.valueOf(paramPlayerStats.getAverageSessionLength()), Float.valueOf(paramPlayerStats.getChurnProbability()), Integer.valueOf(paramPlayerStats.getDaysSinceLastPlayed()), Integer.valueOf(paramPlayerStats.getNumberOfPurchases()), Integer.valueOf(paramPlayerStats.getNumberOfSessions()), Float.valueOf(paramPlayerStats.getSessionPercentile()), Float.valueOf(paramPlayerStats.getSpendPercentile()), Float.valueOf(paramPlayerStats.getSpendProbability()) });
  }
  
  static boolean zza(PlayerStats paramPlayerStats, Object paramObject)
  {
    if (!(paramObject instanceof PlayerStats)) {}
    do
    {
      return false;
      if (paramPlayerStats == paramObject) {
        return true;
      }
      paramObject = (PlayerStats)paramObject;
    } while ((!zzw.equal(Float.valueOf(((PlayerStats)paramObject).getAverageSessionLength()), Float.valueOf(paramPlayerStats.getAverageSessionLength()))) || (!zzw.equal(Float.valueOf(((PlayerStats)paramObject).getChurnProbability()), Float.valueOf(paramPlayerStats.getChurnProbability()))) || (!zzw.equal(Integer.valueOf(((PlayerStats)paramObject).getDaysSinceLastPlayed()), Integer.valueOf(paramPlayerStats.getDaysSinceLastPlayed()))) || (!zzw.equal(Integer.valueOf(((PlayerStats)paramObject).getNumberOfPurchases()), Integer.valueOf(paramPlayerStats.getNumberOfPurchases()))) || (!zzw.equal(Integer.valueOf(((PlayerStats)paramObject).getNumberOfSessions()), Integer.valueOf(paramPlayerStats.getNumberOfSessions()))) || (!zzw.equal(Float.valueOf(((PlayerStats)paramObject).getSessionPercentile()), Float.valueOf(paramPlayerStats.getSessionPercentile()))) || (!zzw.equal(Float.valueOf(((PlayerStats)paramObject).getSpendPercentile()), Float.valueOf(paramPlayerStats.getSpendPercentile()))) || (!zzw.equal(Float.valueOf(((PlayerStats)paramObject).getSpendProbability()), Float.valueOf(paramPlayerStats.getSpendProbability()))));
    return true;
  }
  
  static String zzb(PlayerStats paramPlayerStats)
  {
    return zzw.zzy(paramPlayerStats).zzg("AverageSessionLength", Float.valueOf(paramPlayerStats.getAverageSessionLength())).zzg("ChurnProbability", Float.valueOf(paramPlayerStats.getChurnProbability())).zzg("DaysSinceLastPlayed", Integer.valueOf(paramPlayerStats.getDaysSinceLastPlayed())).zzg("NumberOfPurchases", Integer.valueOf(paramPlayerStats.getNumberOfPurchases())).zzg("NumberOfSessions", Integer.valueOf(paramPlayerStats.getNumberOfSessions())).zzg("SessionPercentile", Float.valueOf(paramPlayerStats.getSessionPercentile())).zzg("SpendPercentile", Float.valueOf(paramPlayerStats.getSpendPercentile())).zzg("SpendProbability", Float.valueOf(paramPlayerStats.getSpendProbability())).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public float getAverageSessionLength()
  {
    return zzaLd;
  }
  
  public float getChurnProbability()
  {
    return zzaLe;
  }
  
  public int getDaysSinceLastPlayed()
  {
    return zzaLf;
  }
  
  public int getNumberOfPurchases()
  {
    return zzaLg;
  }
  
  public int getNumberOfSessions()
  {
    return zzaLh;
  }
  
  public float getSessionPercentile()
  {
    return zzaLi;
  }
  
  public float getSpendPercentile()
  {
    return zzaLj;
  }
  
  public float getSpendProbability()
  {
    return zzaLl;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zza(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    PlayerStatsEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public Bundle zzxV()
  {
    return zzaLk;
  }
  
  public PlayerStats zzxW()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.stats.PlayerStatsEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */