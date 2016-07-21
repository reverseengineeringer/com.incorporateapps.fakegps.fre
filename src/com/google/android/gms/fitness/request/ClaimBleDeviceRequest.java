package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class ClaimBleDeviceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final int mVersionCode;
  private final String zzaAB;
  private final BleDevice zzaAC;
  private final zzow zzaAD;
  
  ClaimBleDeviceRequest(int paramInt, String paramString, BleDevice paramBleDevice, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzaAB = paramString;
    zzaAC = paramBleDevice;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public ClaimBleDeviceRequest(String paramString, BleDevice paramBleDevice, zzow paramzzow)
  {
    mVersionCode = 4;
    zzaAB = paramString;
    zzaAC = paramBleDevice;
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
    return String.format("ClaimBleDeviceRequest{%s %s}", new Object[] { zzaAB, zzaAC });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public BleDevice zzuK()
  {
    return zzaAC;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.ClaimBleDeviceRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */