package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

public class Session
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzq();
  public static final String EXTRA_SESSION = "vnd.google.fitness.session";
  public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
  private final String mName;
  private final int mVersionCode;
  private final long zzRD;
  private final long zzavV;
  private final int zzawf;
  private final Application zzaws;
  private final String zzaxk;
  private final String zzaxl;
  private final Long zzaxm;
  
  Session(int paramInt1, long paramLong1, long paramLong2, String paramString1, String paramString2, String paramString3, int paramInt2, Application paramApplication, Long paramLong)
  {
    mVersionCode = paramInt1;
    zzRD = paramLong1;
    zzavV = paramLong2;
    mName = paramString1;
    zzaxk = paramString2;
    zzaxl = paramString3;
    zzawf = paramInt2;
    zzaws = paramApplication;
    zzaxm = paramLong;
  }
  
  public Session(long paramLong1, long paramLong2, String paramString1, String paramString2, String paramString3, int paramInt, Application paramApplication, Long paramLong)
  {
    this(3, paramLong1, paramLong2, paramString1, paramString2, paramString3, paramInt, paramApplication, paramLong);
  }
  
  private Session(Session.Builder paramBuilder)
  {
    this(Session.Builder.zza(paramBuilder), Session.Builder.zzb(paramBuilder), Session.Builder.zzc(paramBuilder), Session.Builder.zzd(paramBuilder), Session.Builder.zze(paramBuilder), Session.Builder.zzf(paramBuilder), Session.Builder.zzg(paramBuilder), Session.Builder.zzh(paramBuilder));
  }
  
  public static Session extract(Intent paramIntent)
  {
    if (paramIntent == null) {
      return null;
    }
    return (Session)zzc.zza(paramIntent, "vnd.google.fitness.session", CREATOR);
  }
  
  public static String getMimeType(String paramString)
  {
    return "vnd.google.fitness.session/" + paramString;
  }
  
  private boolean zza(Session paramSession)
  {
    return (zzRD == zzRD) && (zzavV == zzavV) && (zzw.equal(mName, mName)) && (zzw.equal(zzaxk, zzaxk)) && (zzw.equal(zzaxl, zzaxl)) && (zzw.equal(zzaws, zzaws)) && (zzawf == zzawf);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof Session)) && (zza((Session)paramObject)));
  }
  
  public long getActiveTime(TimeUnit paramTimeUnit)
  {
    if (zzaxm != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Active time is not set");
      return paramTimeUnit.convert(zzaxm.longValue(), TimeUnit.MILLISECONDS);
    }
  }
  
  public String getActivity()
  {
    return FitnessActivities.getName(zzawf);
  }
  
  public String getAppPackageName()
  {
    if (zzaws == null) {
      return null;
    }
    return zzaws.getPackageName();
  }
  
  public String getDescription()
  {
    return zzaxl;
  }
  
  public long getEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzavV, TimeUnit.MILLISECONDS);
  }
  
  public String getIdentifier()
  {
    return zzaxk;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public long getStartTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzRD, TimeUnit.MILLISECONDS);
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public boolean hasActiveTime()
  {
    return zzaxm != null;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Long.valueOf(zzRD), Long.valueOf(zzavV), zzaxk });
  }
  
  public boolean isOngoing()
  {
    return zzavV == 0L;
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("startTime", Long.valueOf(zzRD)).zzg("endTime", Long.valueOf(zzavV)).zzg("name", mName).zzg("identifier", zzaxk).zzg("description", zzaxl).zzg("activity", Integer.valueOf(zzawf)).zzg("application", zzaws).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzq.zza(this, paramParcel, paramInt);
  }
  
  public long zzlO()
  {
    return zzRD;
  }
  
  public int zzub()
  {
    return zzawf;
  }
  
  public long zzud()
  {
    return zzavV;
  }
  
  public Application zzum()
  {
    return zzaws;
  }
  
  public Long zzuw()
  {
    return zzaxm;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.Session
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */