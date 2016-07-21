package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class SessionRegistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzz();
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  private final int zzaBy;
  
  SessionRegistrationRequest(int paramInt1, PendingIntent paramPendingIntent, IBinder paramIBinder, int paramInt2)
  {
    mVersionCode = paramInt1;
    mPendingIntent = paramPendingIntent;
    if (paramIBinder == null) {}
    for (paramPendingIntent = null;; paramPendingIntent = zzow.zza.zzbR(paramIBinder))
    {
      zzaAD = paramPendingIntent;
      zzaBy = paramInt2;
      return;
    }
  }
  
  public SessionRegistrationRequest(PendingIntent paramPendingIntent, zzow paramzzow, int paramInt)
  {
    mVersionCode = 6;
    mPendingIntent = paramPendingIntent;
    zzaAD = paramzzow;
    zzaBy = paramInt;
  }
  
  private boolean zzb(SessionRegistrationRequest paramSessionRegistrationRequest)
  {
    return (zzaBy == zzaBy) && (zzw.equal(mPendingIntent, mPendingIntent));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SessionRegistrationRequest)) && (zzb((SessionRegistrationRequest)paramObject)));
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAD == null) {
      return null;
    }
    return zzaAD.asBinder();
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
    return zzw.hashCode(new Object[] { mPendingIntent, Integer.valueOf(zzaBy) });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("pendingIntent", mPendingIntent).zzg("sessionRegistrationOption", Integer.valueOf(zzaBy)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzz.zza(this, paramParcel, paramInt);
  }
  
  public int zzvf()
  {
    return zzaBy;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SessionRegistrationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */