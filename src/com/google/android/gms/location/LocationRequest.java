package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public final class LocationRequest
  implements SafeParcelable
{
  public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
  public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
  public static final int PRIORITY_HIGH_ACCURACY = 100;
  public static final int PRIORITY_LOW_POWER = 104;
  public static final int PRIORITY_NO_POWER = 105;
  int mPriority;
  private final int mVersionCode;
  boolean zzaBr;
  long zzaND;
  long zzaNY;
  long zzaNZ;
  int zzaOa;
  float zzaOb;
  long zzaOc;
  
  public LocationRequest()
  {
    mVersionCode = 1;
    mPriority = 102;
    zzaNY = 3600000L;
    zzaNZ = 600000L;
    zzaBr = false;
    zzaND = Long.MAX_VALUE;
    zzaOa = Integer.MAX_VALUE;
    zzaOb = 0.0F;
    zzaOc = 0L;
  }
  
  LocationRequest(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, int paramInt3, float paramFloat, long paramLong4)
  {
    mVersionCode = paramInt1;
    mPriority = paramInt2;
    zzaNY = paramLong1;
    zzaNZ = paramLong2;
    zzaBr = paramBoolean;
    zzaND = paramLong3;
    zzaOa = paramInt3;
    zzaOb = paramFloat;
    zzaOc = paramLong4;
  }
  
  public static LocationRequest create()
  {
    return new LocationRequest();
  }
  
  private static void zzL(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("invalid interval: " + paramLong);
    }
  }
  
  private static void zzd(float paramFloat)
  {
    if (paramFloat < 0.0F) {
      throw new IllegalArgumentException("invalid displacement: " + paramFloat);
    }
  }
  
  private static void zzhs(int paramInt)
  {
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      throw new IllegalArgumentException("invalid quality: " + paramInt);
    }
  }
  
  public static String zzht(int paramInt)
  {
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      return "???";
    case 100: 
      return "PRIORITY_HIGH_ACCURACY";
    case 102: 
      return "PRIORITY_BALANCED_POWER_ACCURACY";
    case 104: 
      return "PRIORITY_LOW_POWER";
    }
    return "PRIORITY_NO_POWER";
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof LocationRequest)) {
        return false;
      }
      paramObject = (LocationRequest)paramObject;
    } while ((mPriority == mPriority) && (zzaNY == zzaNY) && (zzaNZ == zzaNZ) && (zzaBr == zzaBr) && (zzaND == zzaND) && (zzaOa == zzaOa) && (zzaOb == zzaOb));
    return false;
  }
  
  public final long getExpirationTime()
  {
    return zzaND;
  }
  
  public final long getFastestInterval()
  {
    return zzaNZ;
  }
  
  public final long getInterval()
  {
    return zzaNY;
  }
  
  public final long getMaxWaitTime()
  {
    long l2 = zzaOc;
    long l1 = l2;
    if (l2 < zzaNY) {
      l1 = zzaNY;
    }
    return l1;
  }
  
  public final int getNumUpdates()
  {
    return zzaOa;
  }
  
  public final int getPriority()
  {
    return mPriority;
  }
  
  public final float getSmallestDisplacement()
  {
    return zzaOb;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(mPriority), Long.valueOf(zzaNY), Long.valueOf(zzaNZ), Boolean.valueOf(zzaBr), Long.valueOf(zzaND), Integer.valueOf(zzaOa), Float.valueOf(zzaOb) });
  }
  
  public final LocationRequest setExpirationDuration(long paramLong)
  {
    long l = SystemClock.elapsedRealtime();
    if (paramLong > Long.MAX_VALUE - l) {}
    for (zzaND = Long.MAX_VALUE;; zzaND = (l + paramLong))
    {
      if (zzaND < 0L) {
        zzaND = 0L;
      }
      return this;
    }
  }
  
  public final LocationRequest setExpirationTime(long paramLong)
  {
    zzaND = paramLong;
    if (zzaND < 0L) {
      zzaND = 0L;
    }
    return this;
  }
  
  public final LocationRequest setFastestInterval(long paramLong)
  {
    zzL(paramLong);
    zzaBr = true;
    zzaNZ = paramLong;
    return this;
  }
  
  public final LocationRequest setInterval(long paramLong)
  {
    zzL(paramLong);
    zzaNY = paramLong;
    if (!zzaBr) {
      zzaNZ = ((zzaNY / 6.0D));
    }
    return this;
  }
  
  public final LocationRequest setMaxWaitTime(long paramLong)
  {
    zzL(paramLong);
    zzaOc = paramLong;
    return this;
  }
  
  public final LocationRequest setNumUpdates(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("invalid numUpdates: " + paramInt);
    }
    zzaOa = paramInt;
    return this;
  }
  
  public final LocationRequest setPriority(int paramInt)
  {
    zzhs(paramInt);
    mPriority = paramInt;
    return this;
  }
  
  public final LocationRequest setSmallestDisplacement(float paramFloat)
  {
    zzd(paramFloat);
    zzaOb = paramFloat;
    return this;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Request[").append(zzht(mPriority));
    if (mPriority != 105)
    {
      localStringBuilder.append(" requested=");
      localStringBuilder.append(zzaNY).append("ms");
    }
    localStringBuilder.append(" fastest=");
    localStringBuilder.append(zzaNZ).append("ms");
    if (zzaOc > zzaNY)
    {
      localStringBuilder.append(" maxWait=");
      localStringBuilder.append(zzaOc).append("ms");
    }
    if (zzaND != Long.MAX_VALUE)
    {
      long l1 = zzaND;
      long l2 = SystemClock.elapsedRealtime();
      localStringBuilder.append(" expireIn=");
      localStringBuilder.append(l1 - l2).append("ms");
    }
    if (zzaOa != Integer.MAX_VALUE) {
      localStringBuilder.append(" num=").append(zzaOa);
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    LocationRequestCreator.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.LocationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */