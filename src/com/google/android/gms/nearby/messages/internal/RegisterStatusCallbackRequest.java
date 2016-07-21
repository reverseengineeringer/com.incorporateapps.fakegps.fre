package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class RegisterStatusCallbackRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzr();
  final int versionCode;
  public String zzbbF;
  public final zzh zzbcW;
  public boolean zzbcX;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  
  RegisterStatusCallbackRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, boolean paramBoolean, String paramString, ClientAppContext paramClientAppContext)
  {
    versionCode = paramInt;
    zzbcr = zze.zza.zzdz(paramIBinder1);
    zzbcW = zzh.zza.zzdC(paramIBinder2);
    zzbcX = paramBoolean;
    zzbbF = paramString;
    if (paramClientAppContext != null) {}
    for (;;)
    {
      zzbcs = paramClientAppContext;
      return;
      paramClientAppContext = new ClientAppContext(null, zzbbF);
    }
  }
  
  RegisterStatusCallbackRequest(IBinder paramIBinder1, IBinder paramIBinder2, ClientAppContext paramClientAppContext)
  {
    this(1, paramIBinder1, paramIBinder2, false, null, paramClientAppContext);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzED()
  {
    return zzbcr.asBinder();
  }
  
  final IBinder zzEG()
  {
    return zzbcW.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */