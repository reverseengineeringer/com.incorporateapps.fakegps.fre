package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ReceiveContentRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzg();
  public String packageName;
  final int versionCode;
  public IBinder zzbdk;
  public zzc zzbdo;
  public zza zzbdp;
  
  ReceiveContentRequest()
  {
    versionCode = 1;
  }
  
  ReceiveContentRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, String paramString, IBinder paramIBinder3)
  {
    versionCode = paramInt;
    zzbdk = paramIBinder1;
    zzbdp = zza.zza.zzdF(paramIBinder2);
    packageName = paramString;
    zzbdo = zzc.zza.zzdH(paramIBinder3);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzED()
  {
    return zzbdo.asBinder();
  }
  
  final IBinder zzEQ()
  {
    if (zzbdp == null) {
      return null;
    }
    return zzbdp.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.internal.ReceiveContentRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */