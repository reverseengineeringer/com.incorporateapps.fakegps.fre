package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class SyncInfoResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzl();
  private final int mVersionCode;
  private final Status zzUX;
  private final long zzaez;
  
  SyncInfoResult(int paramInt, Status paramStatus, long paramLong)
  {
    mVersionCode = paramInt;
    zzUX = paramStatus;
    zzaez = paramLong;
  }
  
  private boolean zzb(SyncInfoResult paramSyncInfoResult)
  {
    return (zzUX.equals(zzUX)) && (zzw.equal(Long.valueOf(zzaez), Long.valueOf(zzaez)));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SyncInfoResult)) && (zzb((SyncInfoResult)paramObject)));
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzUX, Long.valueOf(zzaez) });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("status", zzUX).zzg("timestamp", Long.valueOf(zzaez)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public long zzvq()
  {
    return zzaez;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.SyncInfoResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */