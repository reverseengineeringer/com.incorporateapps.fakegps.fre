package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class TrustedDevicesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzk();
  final int versionCode;
  public zzc zzbdo;
  public String zzbdq;
  public byte[] zzbdr;
  
  TrustedDevicesRequest(int paramInt, String paramString, byte[] paramArrayOfByte, IBinder paramIBinder)
  {
    versionCode = paramInt;
    zzbdq = ((String)zzx.zzz(paramString));
    zzbdr = ((byte[])zzx.zzz(paramArrayOfByte));
    zzbdo = zzc.zza.zzdH(paramIBinder);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzED()
  {
    return zzbdo.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.internal.TrustedDevicesRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */