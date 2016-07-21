package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.concurrent.TimeUnit;

public class DataUpdateNotification
  implements SafeParcelable
{
  public static final String ACTION = "com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION";
  public static final Parcelable.Creator CREATOR = new zzh();
  public static final String EXTRA_DATA_UPDATE_NOTIFICATION = "vnd.google.fitness.data_udpate_notification";
  public static final int OPERATION_DELETE = 2;
  public static final int OPERATION_INSERT = 1;
  public static final int OPERATION_UPDATE = 3;
  final int mVersionCode;
  private final DataType zzavT;
  private final DataSource zzavU;
  private final long zzawF;
  private final long zzawG;
  private final int zzawH;
  
  DataUpdateNotification(int paramInt1, long paramLong1, long paramLong2, int paramInt2, DataSource paramDataSource, DataType paramDataType)
  {
    mVersionCode = paramInt1;
    zzawF = paramLong1;
    zzawG = paramLong2;
    zzawH = paramInt2;
    zzavU = paramDataSource;
    zzavT = paramDataType;
  }
  
  public static DataUpdateNotification getDataUpdateNotification(Intent paramIntent)
  {
    return (DataUpdateNotification)zzc.zza(paramIntent, "vnd.google.fitness.data_udpate_notification", CREATOR);
  }
  
  private boolean zza(DataUpdateNotification paramDataUpdateNotification)
  {
    return (zzawF == zzawF) && (zzawG == zzawG) && (zzawH == zzawH) && (zzw.equal(zzavU, zzavU)) && (zzw.equal(zzavT, zzavT));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataUpdateNotification)) && (zza((DataUpdateNotification)paramObject)));
  }
  
  public DataSource getDataSource()
  {
    return zzavU;
  }
  
  public DataType getDataType()
  {
    return zzavT;
  }
  
  public int getOperationType()
  {
    return zzawH;
  }
  
  public long getUpdateEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzawG, TimeUnit.NANOSECONDS);
  }
  
  public long getUpdateStartTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzawF, TimeUnit.NANOSECONDS);
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Long.valueOf(zzawF), Long.valueOf(zzawG), Integer.valueOf(zzawH), zzavU, zzavT });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("updateStartTimeNanos", Long.valueOf(zzawF)).zzg("updateEndTimeNanos", Long.valueOf(zzawG)).zzg("operationType", Integer.valueOf(zzawH)).zzg("dataSource", zzavU).zzg("dataType", zzavT).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public long zzup()
  {
    return zzawF;
  }
  
  public long zzuq()
  {
    return zzawG;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.DataUpdateNotification
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */