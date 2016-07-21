package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public class Strategy
  implements SafeParcelable
{
  public static final Strategy BLE_ONLY;
  public static final Parcelable.Creator CREATOR = new zzd();
  public static final Strategy DEFAULT = new Strategy.Builder().build();
  public static final int DISCOVERY_MODE_BROADCAST = 1;
  public static final int DISCOVERY_MODE_DEFAULT = 3;
  public static final int DISCOVERY_MODE_SCAN = 2;
  public static final int DISTANCE_TYPE_DEFAULT = 0;
  public static final int DISTANCE_TYPE_EARSHOT = 1;
  public static final int TTL_SECONDS_DEFAULT = 300;
  public static final int TTL_SECONDS_INFINITE = Integer.MAX_VALUE;
  public static final int TTL_SECONDS_MAX = 86400;
  public static final Strategy zzbbK;
  final int mVersionCode;
  final int zzbbL;
  final int zzbbM;
  final int zzbbN;
  final boolean zzbbO;
  final int zzbbP;
  final int zzbbQ;
  
  static
  {
    Strategy localStrategy = new Strategy.Builder().zzjg(2).setTtlSeconds(Integer.MAX_VALUE).build();
    BLE_ONLY = localStrategy;
    zzbbK = localStrategy;
  }
  
  Strategy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6)
  {
    mVersionCode = paramInt1;
    zzbbL = paramInt2;
    if (paramInt2 == 0) {
      zzbbQ = paramInt6;
    }
    for (;;)
    {
      zzbbN = paramInt4;
      zzbbO = paramBoolean;
      if (!paramBoolean) {
        break;
      }
      zzbbP = 2;
      zzbbM = Integer.MAX_VALUE;
      return;
      switch (paramInt2)
      {
      default: 
        zzbbQ = 3;
        break;
      case 2: 
        zzbbQ = 1;
        break;
      case 3: 
        zzbbQ = 2;
      }
    }
    zzbbM = paramInt3;
    switch (paramInt5)
    {
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    default: 
      zzbbP = paramInt5;
      return;
    }
    zzbbP = -1;
  }
  
  private static String zzjd(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN:" + paramInt;
    case 0: 
      return "DEFAULT";
    }
    return "EARSHOT";
  }
  
  private static String zzje(int paramInt)
  {
    if (paramInt == -1) {
      return "DEFAULT";
    }
    ArrayList localArrayList = new ArrayList();
    if ((paramInt & 0x4) > 0) {
      localArrayList.add("AUDIO");
    }
    if ((paramInt & 0x2) > 0) {
      localArrayList.add("BLE");
    }
    if (localArrayList.isEmpty()) {
      return "UNKNOWN:" + paramInt;
    }
    return localArrayList.toString();
  }
  
  private static String zzjf(int paramInt)
  {
    if (paramInt == 3) {
      return "DEFAULT";
    }
    ArrayList localArrayList = new ArrayList();
    if ((paramInt & 0x1) > 0) {
      localArrayList.add("BROADCAST");
    }
    if ((paramInt & 0x2) > 0) {
      localArrayList.add("SCAN");
    }
    if (localArrayList.isEmpty()) {
      return "UNKNOWN:" + paramInt;
    }
    return localArrayList.toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof Strategy)) {
        return false;
      }
      paramObject = (Strategy)paramObject;
    } while ((mVersionCode == mVersionCode) && (zzbbQ == zzbbQ) && (zzbbM == zzbbM) && (zzbbN == zzbbN) && (zzbbP == zzbbP));
    return false;
  }
  
  public int hashCode()
  {
    return (((mVersionCode * 31 + zzbbQ) * 31 + zzbbM) * 31 + zzbbN) * 31 + zzbbP;
  }
  
  public String toString()
  {
    return "Strategy{ttlSeconds=" + zzbbM + ", distanceType=" + zzjd(zzbbN) + ", discoveryMedium=" + zzje(zzbbP) + ", discoveryMode=" + zzjf(zzbbQ) + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public int zzEr()
  {
    return zzbbP;
  }
  
  public int zzEs()
  {
    return zzbbQ;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.Strategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */