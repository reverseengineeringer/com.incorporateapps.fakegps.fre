package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzns;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DataPoint
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzd();
  private final int mVersionCode;
  private final DataSource zzavU;
  private long zzawj;
  private long zzawk;
  private final Value[] zzawl;
  private DataSource zzawm;
  private long zzawn;
  private long zzawo;
  
  DataPoint(int paramInt, DataSource paramDataSource1, long paramLong1, long paramLong2, Value[] paramArrayOfValue, DataSource paramDataSource2, long paramLong3, long paramLong4)
  {
    mVersionCode = paramInt;
    zzavU = paramDataSource1;
    zzawm = paramDataSource2;
    zzawj = paramLong1;
    zzawk = paramLong2;
    zzawl = paramArrayOfValue;
    zzawn = paramLong3;
    zzawo = paramLong4;
  }
  
  private DataPoint(DataSource paramDataSource)
  {
    mVersionCode = 4;
    zzavU = ((DataSource)zzx.zzb(paramDataSource, "Data source cannot be null"));
    paramDataSource = paramDataSource.getDataType().getFields();
    zzawl = new Value[paramDataSource.size()];
    paramDataSource = paramDataSource.iterator();
    int i = 0;
    while (paramDataSource.hasNext())
    {
      Field localField = (Field)paramDataSource.next();
      zzawl[i] = new Value(localField.getFormat());
      i += 1;
    }
  }
  
  public DataPoint(DataSource paramDataSource1, DataSource paramDataSource2, RawDataPoint paramRawDataPoint)
  {
    this(4, paramDataSource1, zza(Long.valueOf(zzawj), 0L), zza(Long.valueOf(zzawk), 0L), zzawl, paramDataSource2, zza(Long.valueOf(zzawn), 0L), zza(Long.valueOf(zzawo), 0L));
  }
  
  DataPoint(List paramList, RawDataPoint paramRawDataPoint)
  {
    this(zza(paramList, zzaxg), zza(paramList, zzaxh), paramRawDataPoint);
  }
  
  public static DataPoint create(DataSource paramDataSource)
  {
    return new DataPoint(paramDataSource);
  }
  
  public static DataPoint extract(Intent paramIntent)
  {
    if (paramIntent == null) {
      return null;
    }
    return (DataPoint)zzc.zza(paramIntent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
  }
  
  private static long zza(Long paramLong, long paramLong1)
  {
    if (paramLong != null) {
      paramLong1 = paramLong.longValue();
    }
    return paramLong1;
  }
  
  private static DataSource zza(List paramList, int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < paramList.size())) {
      return (DataSource)paramList.get(paramInt);
    }
    return null;
  }
  
  private boolean zza(DataPoint paramDataPoint)
  {
    return (zzw.equal(zzavU, zzavU)) && (zzawj == zzawj) && (zzawk == zzawk) && (Arrays.equals(zzawl, zzawl)) && (zzw.equal(getOriginalDataSource(), paramDataPoint.getOriginalDataSource()));
  }
  
  private void zzeO(int paramInt)
  {
    List localList = getDataType().getFields();
    int i = localList.size();
    if (paramInt == i) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Attempting to insert %s values, but needed %s: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), localList });
      return;
    }
  }
  
  private boolean zzue()
  {
    return getDataType() == DataType.TYPE_LOCATION_SAMPLE;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataPoint)) && (zza((DataPoint)paramObject)));
  }
  
  public final DataSource getDataSource()
  {
    return zzavU;
  }
  
  public final DataType getDataType()
  {
    return zzavU.getDataType();
  }
  
  public final long getEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzawj, TimeUnit.NANOSECONDS);
  }
  
  public final DataSource getOriginalDataSource()
  {
    if (zzawm != null) {
      return zzawm;
    }
    return zzavU;
  }
  
  public final long getStartTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzawk, TimeUnit.NANOSECONDS);
  }
  
  public final long getTimestamp(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzawj, TimeUnit.NANOSECONDS);
  }
  
  public final long getTimestampNanos()
  {
    return zzawj;
  }
  
  public final Value getValue(Field paramField)
  {
    int i = getDataType().indexOf(paramField);
    return zzawl[i];
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavU, Long.valueOf(zzawj), Long.valueOf(zzawk) });
  }
  
  public final DataPoint setFloatValues(float... paramVarArgs)
  {
    zzeO(paramVarArgs.length);
    int i = 0;
    while (i < paramVarArgs.length)
    {
      zzawl[i].setFloat(paramVarArgs[i]);
      i += 1;
    }
    return this;
  }
  
  public final DataPoint setIntValues(int... paramVarArgs)
  {
    zzeO(paramVarArgs.length);
    int i = 0;
    while (i < paramVarArgs.length)
    {
      zzawl[i].setInt(paramVarArgs[i]);
      i += 1;
    }
    return this;
  }
  
  public final DataPoint setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    zzawk = paramTimeUnit.toNanos(paramLong1);
    zzawj = paramTimeUnit.toNanos(paramLong2);
    return this;
  }
  
  public final DataPoint setTimestamp(long paramLong, TimeUnit paramTimeUnit)
  {
    zzawj = paramTimeUnit.toNanos(paramLong);
    if ((zzue()) && (zzns.zza(paramTimeUnit)))
    {
      Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
      zzawj = zzns.zza(zzawj, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
    }
    return this;
  }
  
  public final String toString()
  {
    String str2 = Arrays.toString(zzawl);
    long l1 = zzawk;
    long l2 = zzawj;
    long l3 = zzawn;
    long l4 = zzawo;
    String str3 = zzavU.toDebugString();
    if (zzawm != null) {}
    for (String str1 = zzawm.toDebugString();; str1 = "N/A") {
      return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", new Object[] { str2, Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), str3, str1 });
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public final Value[] zzuf()
  {
    return zzawl;
  }
  
  public final long zzug()
  {
    return zzawn;
  }
  
  public final long zzuh()
  {
    return zzawo;
  }
  
  public final void zzui()
  {
    DataSource localDataSource = getDataSource();
    zzx.zzb(getDataType().getName().equals(localDataSource.getDataType().getName()), "Conflicting data types found %s vs %s", new Object[] { getDataType(), getDataType() });
    if (zzawj > 0L)
    {
      bool = true;
      zzx.zzb(bool, "Data point does not have the timestamp set: %s", new Object[] { this });
      if (zzawk > zzawj) {
        break label107;
      }
    }
    label107:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Data point with start time greater than end time found: %s", new Object[] { this });
      return;
      bool = false;
      break;
    }
  }
  
  public final long zzuj()
  {
    return zzawk;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.DataPoint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */