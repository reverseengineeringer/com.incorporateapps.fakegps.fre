package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest
{
  public static final int ACCURACY_MODE_DEFAULT = 2;
  public static final int ACCURACY_MODE_HIGH = 3;
  public static final int ACCURACY_MODE_LOW = 1;
  private final long zzaBk;
  private final long zzaBl;
  private final LocationRequest zzaBp;
  private final long zzaBq;
  private final DataType zzavT;
  private final DataSource zzavU;
  private final long zzaxo;
  private final int zzaxp;
  
  private SensorRequest(DataSource paramDataSource, LocationRequest paramLocationRequest)
  {
    zzaBp = paramLocationRequest;
    zzaxo = TimeUnit.MILLISECONDS.toMicros(paramLocationRequest.getInterval());
    zzaBl = TimeUnit.MILLISECONDS.toMicros(paramLocationRequest.getFastestInterval());
    zzaBk = zzaxo;
    zzavT = paramDataSource.getDataType();
    zzaxp = zza(paramLocationRequest);
    zzavU = paramDataSource;
    long l = paramLocationRequest.getExpirationTime();
    if (l == Long.MAX_VALUE)
    {
      zzaBq = Long.MAX_VALUE;
      return;
    }
    zzaBq = TimeUnit.MILLISECONDS.toMicros(l - SystemClock.elapsedRealtime());
  }
  
  private SensorRequest(SensorRequest.Builder paramBuilder)
  {
    zzavU = SensorRequest.Builder.zza(paramBuilder);
    zzavT = SensorRequest.Builder.zzb(paramBuilder);
    zzaxo = SensorRequest.Builder.zzc(paramBuilder);
    zzaBl = SensorRequest.Builder.zzd(paramBuilder);
    zzaBk = SensorRequest.Builder.zze(paramBuilder);
    zzaxp = SensorRequest.Builder.zzf(paramBuilder);
    zzaBp = null;
    zzaBq = SensorRequest.Builder.zzg(paramBuilder);
  }
  
  public static SensorRequest fromLocationRequest(DataSource paramDataSource, LocationRequest paramLocationRequest)
  {
    return new SensorRequest(paramDataSource, paramLocationRequest);
  }
  
  private static int zza(LocationRequest paramLocationRequest)
  {
    switch (paramLocationRequest.getPriority())
    {
    default: 
      return 2;
    case 100: 
      return 3;
    }
    return 1;
  }
  
  private boolean zza(SensorRequest paramSensorRequest)
  {
    return (zzw.equal(zzavU, zzavU)) && (zzw.equal(zzavT, zzavT)) && (zzaxo == zzaxo) && (zzaBl == zzaBl) && (zzaBk == zzaBk) && (zzaxp == zzaxp) && (zzw.equal(zzaBp, zzaBp)) && (zzaBq == zzaBq);
  }
  
  public static int zzfB(int paramInt)
  {
    int i = paramInt;
    switch (paramInt)
    {
    case 2: 
    default: 
      i = 2;
    }
    return i;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SensorRequest)) && (zza((SensorRequest)paramObject)));
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
  
  public long getFastestRate(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzaBl, TimeUnit.MICROSECONDS);
  }
  
  public long getMaxDeliveryLatency(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzaBk, TimeUnit.MICROSECONDS);
  }
  
  public long getSamplingRate(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzaxo, TimeUnit.MICROSECONDS);
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavU, zzavT, Long.valueOf(zzaxo), Long.valueOf(zzaBl), Long.valueOf(zzaBk), Integer.valueOf(zzaxp), zzaBp, Long.valueOf(zzaBq) });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("dataSource", zzavU).zzg("dataType", zzavT).zzg("samplingRateMicros", Long.valueOf(zzaxo)).zzg("deliveryLatencyMicros", Long.valueOf(zzaBk)).zzg("timeOutMicros", Long.valueOf(zzaBq)).toString();
  }
  
  public long zzvc()
  {
    return zzaBq;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SensorRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */