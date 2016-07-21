package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class DataUpdateListenerUnregistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzl();
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  
  DataUpdateListenerUnregistrationRequest(int paramInt, PendingIntent paramPendingIntent, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    mPendingIntent = paramPendingIntent;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  private boolean zzb(DataUpdateListenerUnregistrationRequest paramDataUpdateListenerUnregistrationRequest)
  {
    return zzw.equal(mPendingIntent, mPendingIntent);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataUpdateListenerUnregistrationRequest)) && (zzb((DataUpdateListenerUnregistrationRequest)paramObject)));
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
    return String.format("DataUpdateListenerUnregistrationRequest", new Object[0]);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataUpdateListenerUnregistrationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */