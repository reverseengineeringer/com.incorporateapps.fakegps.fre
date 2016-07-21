package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetPermissionStatusRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  final int mVersionCode;
  public final String zzbbF;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  
  GetPermissionStatusRequest(int paramInt, IBinder paramIBinder, String paramString, ClientAppContext paramClientAppContext)
  {
    mVersionCode = paramInt;
    zzbcr = zze.zza.zzdz(paramIBinder);
    zzbbF = paramString;
    if (paramClientAppContext != null) {}
    for (;;)
    {
      zzbcs = paramClientAppContext;
      return;
      paramClientAppContext = new ClientAppContext(null, zzbbF);
    }
  }
  
  GetPermissionStatusRequest(IBinder paramIBinder, ClientAppContext paramClientAppContext)
  {
    this(1, paramIBinder, null, paramClientAppContext);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    return zzbcr.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */