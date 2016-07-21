package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class DisableFitRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzo();
  private final int mVersionCode;
  private final zzow zzaAD;
  
  DisableFitRequest(int paramInt, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public DisableFitRequest(zzow paramzzow)
  {
    mVersionCode = 2;
    zzaAD = paramzzow;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    return zzaAD.asBinder();
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    return String.format("DisableFitRequest", new Object[0]);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DisableFitRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */