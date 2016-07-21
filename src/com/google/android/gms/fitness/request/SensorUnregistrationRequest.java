package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzk.zza;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class SensorUnregistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzw();
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  private final zzk zzaBh;
  
  SensorUnregistrationRequest(int paramInt, IBinder paramIBinder1, PendingIntent paramPendingIntent, IBinder paramIBinder2)
  {
    mVersionCode = paramInt;
    if (paramIBinder1 == null) {}
    for (paramIBinder1 = null;; paramIBinder1 = zzk.zza.zzbt(paramIBinder1))
    {
      zzaBh = paramIBinder1;
      mPendingIntent = paramPendingIntent;
      zzaAD = zzow.zza.zzbR(paramIBinder2);
      return;
    }
  }
  
  public SensorUnregistrationRequest(zzk paramzzk, PendingIntent paramPendingIntent, zzow paramzzow)
  {
    mVersionCode = 4;
    zzaBh = paramzzk;
    mPendingIntent = paramPendingIntent;
    zzaAD = paramzzow;
  }
  
  public int describeContents()
  {
    return 0;
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
  
  public String toString()
  {
    return String.format("SensorUnregistrationRequest{%s}", new Object[] { zzaBh });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzw.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzvb()
  {
    if (zzaBh == null) {
      return null;
    }
    return zzaBh.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SensorUnregistrationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */