package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDeleteRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzd();
  private final int mVersionCode;
  private final long zzRD;
  private final zzow zzaAD;
  private final List zzaAF;
  private final List zzaAG;
  private final boolean zzaAH;
  private final boolean zzaAI;
  private final long zzavV;
  private final List zzawe;
  
  DataDeleteRequest(int paramInt, long paramLong1, long paramLong2, List paramList1, List paramList2, List paramList3, boolean paramBoolean1, boolean paramBoolean2, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzRD = paramLong1;
    zzavV = paramLong2;
    zzaAF = Collections.unmodifiableList(paramList1);
    zzawe = Collections.unmodifiableList(paramList2);
    zzaAG = paramList3;
    zzaAH = paramBoolean1;
    zzaAI = paramBoolean2;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public DataDeleteRequest(long paramLong1, long paramLong2, List paramList1, List paramList2, List paramList3, boolean paramBoolean1, boolean paramBoolean2, zzow paramzzow)
  {
    mVersionCode = 3;
    zzRD = paramLong1;
    zzavV = paramLong2;
    zzaAF = Collections.unmodifiableList(paramList1);
    zzawe = Collections.unmodifiableList(paramList2);
    zzaAG = paramList3;
    zzaAH = paramBoolean1;
    zzaAI = paramBoolean2;
    zzaAD = paramzzow;
  }
  
  private DataDeleteRequest(DataDeleteRequest.Builder paramBuilder)
  {
    this(DataDeleteRequest.Builder.zza(paramBuilder), DataDeleteRequest.Builder.zzb(paramBuilder), DataDeleteRequest.Builder.zzc(paramBuilder), DataDeleteRequest.Builder.zzd(paramBuilder), DataDeleteRequest.Builder.zze(paramBuilder), DataDeleteRequest.Builder.zzf(paramBuilder), DataDeleteRequest.Builder.zzg(paramBuilder), null);
  }
  
  public DataDeleteRequest(DataDeleteRequest paramDataDeleteRequest, zzow paramzzow)
  {
    this(zzRD, zzavV, zzaAF, zzawe, zzaAG, zzaAH, zzaAI, paramzzow);
  }
  
  private boolean zzb(DataDeleteRequest paramDataDeleteRequest)
  {
    return (zzRD == zzRD) && (zzavV == zzavV) && (zzw.equal(zzaAF, zzaAF)) && (zzw.equal(zzawe, zzawe)) && (zzw.equal(zzaAG, zzaAG)) && (zzaAH == zzaAH) && (zzaAI == zzaAI);
  }
  
  public boolean deleteAllData()
  {
    return zzaAH;
  }
  
  public boolean deleteAllSessions()
  {
    return zzaAI;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataDeleteRequest)) && (zzb((DataDeleteRequest)paramObject)));
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAD == null) {
      return null;
    }
    return zzaAD.asBinder();
  }
  
  public List getDataSources()
  {
    return zzaAF;
  }
  
  public List getDataTypes()
  {
    return zzawe;
  }
  
  public long getEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzavV, TimeUnit.MILLISECONDS);
  }
  
  public List getSessions()
  {
    return zzaAG;
  }
  
  public long getStartTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzRD, TimeUnit.MILLISECONDS);
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Long.valueOf(zzRD), Long.valueOf(zzavV) });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("startTimeMillis", Long.valueOf(zzRD)).zzg("endTimeMillis", Long.valueOf(zzavV)).zzg("dataSources", zzaAF).zzg("dateTypes", zzawe).zzg("sessions", zzaAG).zzg("deleteAllData", Boolean.valueOf(zzaAH)).zzg("deleteAllSessions", Boolean.valueOf(zzaAI)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public long zzlO()
  {
    return zzRD;
  }
  
  public boolean zzuL()
  {
    return zzaAH;
  }
  
  public boolean zzuM()
  {
    return zzaAI;
  }
  
  public long zzud()
  {
    return zzavV;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataDeleteRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */