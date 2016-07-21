package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;

public class StopScanRequest
  implements SafeParcelable
{
  public static final zzh CREATOR = new zzh();
  final int versionCode;
  private final zzqg zzbaV;
  
  StopScanRequest(int paramInt, IBinder paramIBinder)
  {
    versionCode = paramInt;
    zzx.zzz(paramIBinder);
    zzbaV = zzqg.zza.zzds(paramIBinder);
  }
  
  public int describeContents()
  {
    zzh localzzh = CREATOR;
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzbaV == null) {
      return null;
    }
    return zzbaV.asBinder();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh localzzh = CREATOR;
    zzh.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.bootstrap.request.StopScanRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */