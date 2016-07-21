package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzk.zza;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SensorRegistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzv();
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  private zzk zzaBh;
  int zzaBi;
  int zzaBj;
  private final long zzaBk;
  private final long zzaBl;
  private final List zzaBm;
  private final long zzaBn;
  private final List zzaBo;
  private DataType zzavT;
  private DataSource zzavU;
  private final long zzaxo;
  private final int zzaxp;
  
  SensorRegistrationRequest(int paramInt1, DataSource paramDataSource, DataType paramDataType, IBinder paramIBinder1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, PendingIntent paramPendingIntent, long paramLong3, int paramInt4, List paramList, long paramLong4, IBinder paramIBinder2)
  {
    mVersionCode = paramInt1;
    zzavU = paramDataSource;
    zzavT = paramDataType;
    if (paramIBinder1 == null) {}
    for (paramDataSource = null;; paramDataSource = zzk.zza.zzbt(paramIBinder1))
    {
      zzaBh = paramDataSource;
      long l = paramLong1;
      if (paramLong1 == 0L) {
        l = paramInt2;
      }
      zzaxo = l;
      zzaBl = paramLong3;
      paramLong1 = paramLong2;
      if (paramLong2 == 0L) {
        paramLong1 = paramInt3;
      }
      zzaBk = paramLong1;
      zzaBm = paramList;
      mPendingIntent = paramPendingIntent;
      zzaxp = paramInt4;
      zzaBo = Collections.emptyList();
      zzaBn = paramLong4;
      zzaAD = zzow.zza.zzbR(paramIBinder2);
      return;
    }
  }
  
  public SensorRegistrationRequest(DataSource paramDataSource, DataType paramDataType, zzk paramzzk, PendingIntent paramPendingIntent, long paramLong1, long paramLong2, long paramLong3, int paramInt, List paramList1, List paramList2, long paramLong4, zzow paramzzow)
  {
    mVersionCode = 6;
    zzavU = paramDataSource;
    zzavT = paramDataType;
    zzaBh = paramzzk;
    mPendingIntent = paramPendingIntent;
    zzaxo = paramLong1;
    zzaBl = paramLong2;
    zzaBk = paramLong3;
    zzaxp = paramInt;
    zzaBm = paramList1;
    zzaBo = paramList2;
    zzaBn = paramLong4;
    zzaAD = paramzzow;
  }
  
  public SensorRegistrationRequest(SensorRequest paramSensorRequest, zzk paramzzk, PendingIntent paramPendingIntent, zzow paramzzow)
  {
    this(paramSensorRequest.getDataSource(), paramSensorRequest.getDataType(), paramzzk, paramPendingIntent, paramSensorRequest.getSamplingRate(TimeUnit.MICROSECONDS), paramSensorRequest.getFastestRate(TimeUnit.MICROSECONDS), paramSensorRequest.getMaxDeliveryLatency(TimeUnit.MICROSECONDS), paramSensorRequest.getAccuracyMode(), null, Collections.emptyList(), paramSensorRequest.zzvc(), paramzzow);
  }
  
  private boolean zzb(SensorRegistrationRequest paramSensorRegistrationRequest)
  {
    return (zzw.equal(zzavU, zzavU)) && (zzw.equal(zzavT, zzavT)) && (zzaxo == zzaxo) && (zzaBl == zzaBl) && (zzaBk == zzaBk) && (zzaxp == zzaxp) && (zzw.equal(zzaBm, zzaBm));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SensorRegistrationRequest)) && (zzb((SensorRegistrationRequest)paramObject)));
  }
  
  public int getAccuracyMode()
  {
    return zzaxp;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAD == null) {
      return null;
    }
    return zzaAD.asBinder();
  }
  
  public DataSource getDataSource()
  {
    return zzavU;
  }
  
  public DataType getDataType()
  {
    return zzavT;
  }
  
  public PendingIntent getIntent()
  {
    return mPendingIntent;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavU, zzavT, zzaBh, Long.valueOf(zzaxo), Long.valueOf(zzaBl), Long.valueOf(zzaBk), Integer.valueOf(zzaxp), zzaBm });
  }
  
  public String toString()
  {
    return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", new Object[] { zzavT, zzavU, Long.valueOf(zzaxo), Long.valueOf(zzaBl), Long.valueOf(zzaBk) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzv.zza(this, paramParcel, paramInt);
  }
  
  public long zzuX()
  {
    return zzaBl;
  }
  
  public long zzuY()
  {
    return zzaBk;
  }
  
  public List zzuZ()
  {
    return zzaBm;
  }
  
  public long zzux()
  {
    return zzaxo;
  }
  
  public long zzva()
  {
    return zzaBn;
  }
  
  IBinder zzvb()
  {
    if (zzaBh == null) {
      return null;
    }
    return zzaBh.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SensorRegistrationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */