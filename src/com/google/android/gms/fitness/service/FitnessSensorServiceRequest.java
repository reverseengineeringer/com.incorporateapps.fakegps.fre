package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzk.zza;
import java.util.concurrent.TimeUnit;

public class FitnessSensorServiceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  public static final int UNSPECIFIED = -1;
  private final int mVersionCode;
  private final long zzaBR;
  private final long zzaBS;
  private final zzk zzaBh;
  private final DataSource zzavU;
  
  FitnessSensorServiceRequest(int paramInt, DataSource paramDataSource, IBinder paramIBinder, long paramLong1, long paramLong2)
  {
    mVersionCode = paramInt;
    zzavU = paramDataSource;
    zzaBh = zzk.zza.zzbt(paramIBinder);
    zzaBR = paramLong1;
    zzaBS = paramLong2;
  }
  
  private boolean zza(FitnessSensorServiceRequest paramFitnessSensorServiceRequest)
  {
    return (zzw.equal(zzavU, zzavU)) && (zzaBR == zzaBR) && (zzaBS == zzaBS);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof FitnessSensorServiceRequest)) && (zza((FitnessSensorServiceRequest)paramObject)));
  }
  
  public long getBatchInterval(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzaBS, TimeUnit.MICROSECONDS);
  }
  
  public DataSource getDataSource()
  {
    return zzavU;
  }
  
  public SensorEventDispatcher getDispatcher()
  {
    return new zzb(zzaBh);
  }
  
  public long getSamplingRate(TimeUnit paramTimeUnit)
  {
    if (zzaBR == -1L) {
      return -1L;
    }
    return paramTimeUnit.convert(zzaBR, TimeUnit.MICROSECONDS);
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavU, Long.valueOf(zzaBR), Long.valueOf(zzaBS) });
  }
  
  public String toString()
  {
    return String.format("FitnessSensorServiceRequest{%s}", new Object[] { zzavU });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public long zzux()
  {
    return zzaBR;
  }
  
  IBinder zzvb()
  {
    return zzaBh.asBinder();
  }
  
  public long zzvs()
  {
    return zzaBS;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.service.FitnessSensorServiceRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */