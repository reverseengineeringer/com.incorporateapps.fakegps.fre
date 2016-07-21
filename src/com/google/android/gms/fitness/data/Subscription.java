package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class Subscription
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzs();
  private final int mVersionCode;
  private final DataType zzavT;
  private final DataSource zzavU;
  private final long zzaxo;
  private final int zzaxp;
  
  Subscription(int paramInt1, DataSource paramDataSource, DataType paramDataType, long paramLong, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzavU = paramDataSource;
    zzavT = paramDataType;
    zzaxo = paramLong;
    zzaxp = paramInt2;
  }
  
  private Subscription(Subscription.zza paramzza)
  {
    mVersionCode = 1;
    zzavT = Subscription.zza.zza(paramzza);
    zzavU = Subscription.zza.zzb(paramzza);
    zzaxo = Subscription.zza.zzc(paramzza);
    zzaxp = Subscription.zza.zzd(paramzza);
  }
  
  private boolean zza(Subscription paramSubscription)
  {
    return (zzw.equal(zzavU, zzavU)) && (zzw.equal(zzavT, zzavT)) && (zzaxo == zzaxo) && (zzaxp == zzaxp);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof Subscription)) && (zza((Subscription)paramObject)));
  }
  
  public int getAccuracyMode()
  {
    return zzaxp;
  }
  
  public DataSource getDataSource()
  {
    return zzavU;
  }
  
  public DataType getDataType()
  {
    return zzavT;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavU, zzavU, Long.valueOf(zzaxo), Integer.valueOf(zzaxp) });
  }
  
  public String toDebugString()
  {
    if (zzavU == null) {}
    for (String str = zzavT.getName();; str = zzavU.toDebugString()) {
      return String.format("Subscription{%s}", new Object[] { str });
    }
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("dataSource", zzavU).zzg("dataType", zzavT).zzg("samplingIntervalMicros", Long.valueOf(zzaxo)).zzg("accuracyMode", Integer.valueOf(zzaxp)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzs.zza(this, paramParcel, paramInt);
  }
  
  public long zzux()
  {
    return zzaxo;
  }
  
  public DataType zzuy()
  {
    if (zzavT == null) {
      return zzavU.getDataType();
    }
    return zzavT;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.Subscription
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */