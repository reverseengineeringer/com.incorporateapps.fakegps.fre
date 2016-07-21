package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;
import com.google.android.gms.internal.zzqi;
import com.google.android.gms.internal.zzqi.zza;

public class StartScanRequest
  implements SafeParcelable
{
  public static final zzg CREATOR = new zzg();
  final int versionCode;
  private final zzqg zzbaV;
  private final zzqi zzbaY;
  
  StartScanRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2)
  {
    versionCode = paramInt;
    zzx.zzz(paramIBinder1);
    zzbaY = zzqi.zza.zzdu(paramIBinder1);
    zzx.zzz(paramIBinder2);
    zzbaV = zzqg.zza.zzds(paramIBinder2);
  }
  
  public int describeContents()
  {
    zzg localzzg = CREATOR;
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
    zzg localzzg = CREATOR;
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public IBinder zzEi()
  {
    if (zzbaY == null) {
      return null;
    }
    return zzbaY.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.bootstrap.request.StartScanRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */