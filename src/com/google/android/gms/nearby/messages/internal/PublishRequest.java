package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

public final class PublishRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzq();
  final int mVersionCode;
  public final String zzbbF;
  public final boolean zzbbG;
  public final boolean zzbbH;
  public final MessageWrapper zzbcT;
  public final Strategy zzbcU;
  public final zzg zzbcV;
  public final String zzbco;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  
  PublishRequest(int paramInt, MessageWrapper paramMessageWrapper, Strategy paramStrategy, IBinder paramIBinder1, String paramString1, String paramString2, boolean paramBoolean1, IBinder paramIBinder2, boolean paramBoolean2, ClientAppContext paramClientAppContext)
  {
    mVersionCode = paramInt;
    zzbcT = paramMessageWrapper;
    zzbcU = paramStrategy;
    zzbcr = zze.zza.zzdz(paramIBinder1);
    zzbbF = paramString1;
    zzbco = paramString2;
    zzbbG = paramBoolean1;
    if (paramIBinder2 == null)
    {
      paramMessageWrapper = null;
      zzbcV = paramMessageWrapper;
      zzbbH = paramBoolean2;
      if (paramClientAppContext == null) {
        break label85;
      }
    }
    for (;;)
    {
      zzbcs = paramClientAppContext;
      return;
      paramMessageWrapper = zzg.zza.zzdB(paramIBinder2);
      break;
      label85:
      paramClientAppContext = new ClientAppContext(zzbco, zzbbF, zzbbH);
    }
  }
  
  PublishRequest(MessageWrapper paramMessageWrapper, Strategy paramStrategy, IBinder paramIBinder1, boolean paramBoolean, IBinder paramIBinder2, ClientAppContext paramClientAppContext)
  {
    this(2, paramMessageWrapper, paramStrategy, paramIBinder1, null, null, paramBoolean, paramIBinder2, false, paramClientAppContext);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzq.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzED()
  {
    return zzbcr.asBinder();
  }
  
  final IBinder zzEF()
  {
    if (zzbcV == null) {
      return null;
    }
    return zzbcV.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.PublishRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */