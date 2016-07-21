package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzou.zza;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzy();
  private final int mVersionCode;
  private final String zzLq;
  private final long zzRD;
  private final List zzaAF;
  private final boolean zzaAQ;
  private final String zzaBu;
  private boolean zzaBv;
  private final List zzaBw;
  private final zzou zzaBx;
  private final long zzavV;
  private final List zzawe;
  
  SessionReadRequest(int paramInt, String paramString1, String paramString2, long paramLong1, long paramLong2, List paramList1, List paramList2, boolean paramBoolean1, boolean paramBoolean2, List paramList3, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzaBu = paramString1;
    zzLq = paramString2;
    zzRD = paramLong1;
    zzavV = paramLong2;
    zzawe = paramList1;
    zzaAF = paramList2;
    zzaBv = paramBoolean1;
    zzaAQ = paramBoolean2;
    zzaBw = paramList3;
    zzaBx = zzou.zza.zzbP(paramIBinder);
  }
  
  private SessionReadRequest(SessionReadRequest.Builder paramBuilder)
  {
    this(SessionReadRequest.Builder.zza(paramBuilder), SessionReadRequest.Builder.zzb(paramBuilder), SessionReadRequest.Builder.zzc(paramBuilder), SessionReadRequest.Builder.zzd(paramBuilder), SessionReadRequest.Builder.zze(paramBuilder), SessionReadRequest.Builder.zzf(paramBuilder), SessionReadRequest.Builder.zzg(paramBuilder), SessionReadRequest.Builder.zzh(paramBuilder), SessionReadRequest.Builder.zzi(paramBuilder), null);
  }
  
  public SessionReadRequest(SessionReadRequest paramSessionReadRequest, zzou paramzzou)
  {
    this(zzaBu, zzLq, zzRD, zzavV, zzawe, zzaAF, zzaBv, zzaAQ, zzaBw, paramzzou);
  }
  
  public SessionReadRequest(String paramString1, String paramString2, long paramLong1, long paramLong2, List paramList1, List paramList2, boolean paramBoolean1, boolean paramBoolean2, List paramList3, zzou paramzzou) {}
  
  private boolean zzb(SessionReadRequest paramSessionReadRequest)
  {
    return (zzw.equal(zzaBu, zzaBu)) && (zzLq.equals(zzLq)) && (zzRD == zzRD) && (zzavV == zzavV) && (zzw.equal(zzawe, zzawe)) && (zzw.equal(zzaAF, zzaAF)) && (zzaBv == zzaBv) && (zzaBw.equals(zzaBw)) && (zzaAQ == zzaAQ);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SessionReadRequest)) && (zzb((SessionReadRequest)paramObject)));
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaBx == null) {
      return null;
    }
    return zzaBx.asBinder();
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
  
  public List getExcludedPackages()
  {
    return zzaBw;
  }
  
  public String getSessionId()
  {
    return zzLq;
  }
  
  public String getSessionName()
  {
    return zzaBu;
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
    return zzw.hashCode(new Object[] { zzaBu, zzLq, Long.valueOf(zzRD), Long.valueOf(zzavV) });
  }
  
  public boolean includeSessionsFromAllApps()
  {
    return zzaBv;
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("sessionName", zzaBu).zzg("sessionId", zzLq).zzg("startTimeMillis", Long.valueOf(zzRD)).zzg("endTimeMillis", Long.valueOf(zzavV)).zzg("dataTypes", zzawe).zzg("dataSources", zzaAF).zzg("sessionsFromAllApps", Boolean.valueOf(zzaBv)).zzg("excludedPackages", zzaBw).zzg("useServer", Boolean.valueOf(zzaAQ)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzy.zza(this, paramParcel, paramInt);
  }
  
  public long zzlO()
  {
    return zzRD;
  }
  
  public boolean zzuP()
  {
    return zzaAQ;
  }
  
  public long zzud()
  {
    return zzavV;
  }
  
  public boolean zzve()
  {
    return zzaBv;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SessionReadRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */