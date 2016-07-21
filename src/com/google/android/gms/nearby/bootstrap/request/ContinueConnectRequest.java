package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;

public class ContinueConnectRequest
  implements SafeParcelable
{
  public static final zzb CREATOR = new zzb();
  final int versionCode;
  private final zzqg zzbaV;
  private final String zzbaW;
  
  ContinueConnectRequest(int paramInt, String paramString, IBinder paramIBinder)
  {
    versionCode = paramInt;
    zzbaW = ((String)zzx.zzz(paramString));
    zzbaV = zzqg.zza.zzds(paramIBinder);
  }
  
  public int describeContents()
  {
    zzb localzzb = CREATOR;
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzbaV == null) {
      return null;
    }
    return zzbaV.asBinder();
  }
  
  public String getToken()
  {
    return zzbaW;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb localzzb = CREATOR;
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */