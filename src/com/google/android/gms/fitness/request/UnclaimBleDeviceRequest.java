package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class UnclaimBleDeviceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzag();
  private final int mVersionCode;
  private final String zzaAB;
  private final zzow zzaAD;
  
  UnclaimBleDeviceRequest(int paramInt, String paramString, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzaAB = paramString;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public UnclaimBleDeviceRequest(String paramString, zzow paramzzow)
  {
    mVersionCode = 5;
    zzaAB = paramString;
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
  
  public String getDeviceAddress()
  {
    return zzaAB;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    return String.format("UnclaimBleDeviceRequest{%s}", new Object[] { zzaAB });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzag.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.UnclaimBleDeviceRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */