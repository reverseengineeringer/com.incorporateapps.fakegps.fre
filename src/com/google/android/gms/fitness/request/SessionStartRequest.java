package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.concurrent.TimeUnit;

public class SessionStartRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzaa();
  private final int mVersionCode;
  private final zzow zzaAD;
  private final Session zzavX;
  
  SessionStartRequest(int paramInt, Session paramSession, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzavX = paramSession;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public SessionStartRequest(Session paramSession, zzow paramzzow)
  {
    if (paramSession.getStartTime(TimeUnit.MILLISECONDS) < System.currentTimeMillis()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Cannot start a session in the future");
      zzx.zzb(paramSession.isOngoing(), "Cannot start a session which has already ended");
      mVersionCode = 3;
      zzavX = paramSession;
      zzaAD = paramzzow;
      return;
    }
  }
  
  private boolean zzb(SessionStartRequest paramSessionStartRequest)
  {
    return zzw.equal(zzavX, zzavX);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof SessionStartRequest)) && (zzb((SessionStartRequest)paramObject)));
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAD == null) {
      return null;
    }
    return zzaAD.asBinder();
  }
  
  public Session getSession()
  {
    return zzavX;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavX });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("session", zzavX).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaa.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SessionStartRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */