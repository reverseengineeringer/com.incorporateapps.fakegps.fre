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

public class SessionUnregistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzac();
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  
  SessionUnregistrationRequest(int paramInt, PendingIntent paramPendingIntent, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    mPendingIntent = paramPendingIntent;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public SessionUnregistrationRequest(PendingIntent paramPendingIntent, zzow paramzzow)
  {
    mVersionCode = 5;
    mPendingIntent = paramPendingIntent;
    zzaAD = paramzzow;
  }
  
  private boolean zzb(SessionUnregistrationRequest paramSessionUnregistrationRequest)
  {
    return zzw.equal(mPendingIntent, mPendingIntent);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SessionUnregistrationRequest)) && (zzb((SessionUnregistrationRequest)paramObject)));
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
    return zzw.hashCode(new Object[] { mPendingIntent });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("pendingIntent", mPendingIntent).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzac.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SessionUnregistrationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */