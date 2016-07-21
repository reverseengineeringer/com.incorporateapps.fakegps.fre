package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Collections;
import java.util.List;

public class SessionStopResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzk();
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaAG;
  
  SessionStopResult(int paramInt, Status paramStatus, List paramList)
  {
    mVersionCode = paramInt;
    zzUX = paramStatus;
    zzaAG = Collections.unmodifiableList(paramList);
  }
  
  public SessionStopResult(Status paramStatus, List paramList)
  {
    mVersionCode = 3;
    zzUX = paramStatus;
    zzaAG = Collections.unmodifiableList(paramList);
  }
  
  public static SessionStopResult zzV(Status paramStatus)
  {
    return new SessionStopResult(paramStatus, Collections.emptyList());
  }
  
  private boolean zzb(SessionStopResult paramSessionStopResult)
  {
    return (zzUX.equals(zzUX)) && (zzw.equal(zzaAG, zzaAG));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SessionStopResult)) && (zzb((SessionStopResult)paramObject)));
  }
  
  public List getSessions()
  {
    return zzaAG;
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
    return zzw.hashCode(new Object[] { zzUX, zzaAG });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("status", zzUX).zzg("sessions", zzaAG).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.SessionStopResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */