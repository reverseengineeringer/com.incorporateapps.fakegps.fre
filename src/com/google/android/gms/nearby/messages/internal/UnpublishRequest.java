package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UnpublishRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzt();
  final int mVersionCode;
  public final String zzbbF;
  public final boolean zzbbH;
  public final MessageWrapper zzbcT;
  public final String zzbco;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  
  UnpublishRequest(int paramInt, MessageWrapper paramMessageWrapper, IBinder paramIBinder, String paramString1, String paramString2, boolean paramBoolean, ClientAppContext paramClientAppContext)
  {
    mVersionCode = paramInt;
    zzbcT = paramMessageWrapper;
    zzbcr = zze.zza.zzdz(paramIBinder);
    zzbbF = paramString1;
    zzbco = paramString2;
    zzbbH = paramBoolean;
    if (paramClientAppContext != null) {}
    for (;;)
    {
      zzbcs = paramClientAppContext;
      return;
      paramClientAppContext = new ClientAppContext(zzbco, zzbbF, zzbbH);
    }
  }
  
  UnpublishRequest(MessageWrapper paramMessageWrapper, IBinder paramIBinder, ClientAppContext paramClientAppContext)
  {
    this(1, paramMessageWrapper, paramIBinder, null, null, false, paramClientAppContext);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzt.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzED()
  {
    return zzbcr.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.UnpublishRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */