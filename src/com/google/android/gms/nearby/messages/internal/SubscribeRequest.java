package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

public final class SubscribeRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzs();
  final int mVersionCode;
  public final String zzbbF;
  public final boolean zzbbG;
  public final boolean zzbbH;
  public final Strategy zzbcU;
  public final zzd zzbcY;
  public final MessageFilter zzbcZ;
  public final String zzbco;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  public final PendingIntent zzbda;
  public final int zzbdb;
  public final byte[] zzbdc;
  public final zzi zzbdd;
  
  SubscribeRequest(int paramInt1, IBinder paramIBinder1, Strategy paramStrategy, IBinder paramIBinder2, MessageFilter paramMessageFilter, PendingIntent paramPendingIntent, int paramInt2, String paramString1, String paramString2, byte[] paramArrayOfByte, boolean paramBoolean1, IBinder paramIBinder3, boolean paramBoolean2, ClientAppContext paramClientAppContext)
  {
    mVersionCode = paramInt1;
    zzbcY = zzd.zza.zzdy(paramIBinder1);
    zzbcU = paramStrategy;
    zzbcr = zze.zza.zzdz(paramIBinder2);
    zzbcZ = paramMessageFilter;
    zzbda = paramPendingIntent;
    zzbdb = paramInt2;
    zzbbF = paramString1;
    zzbco = paramString2;
    zzbdc = paramArrayOfByte;
    zzbbG = paramBoolean1;
    if (paramIBinder3 == null)
    {
      paramIBinder1 = null;
      zzbdd = paramIBinder1;
      zzbbH = paramBoolean2;
      if (paramClientAppContext == null) {
        break label112;
      }
    }
    for (;;)
    {
      zzbcs = paramClientAppContext;
      return;
      paramIBinder1 = zzi.zza.zzdD(paramIBinder3);
      break;
      label112:
      paramClientAppContext = new ClientAppContext(zzbco, zzbbF, zzbbH);
    }
  }
  
  public SubscribeRequest(IBinder paramIBinder1, Strategy paramStrategy, IBinder paramIBinder2, MessageFilter paramMessageFilter, PendingIntent paramPendingIntent, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean, IBinder paramIBinder3, ClientAppContext paramClientAppContext)
  {
    this(3, paramIBinder1, paramStrategy, paramIBinder2, paramMessageFilter, paramPendingIntent, paramInt, null, null, paramArrayOfByte, paramBoolean, paramIBinder3, false, paramClientAppContext);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzs.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzED()
  {
    if (zzbcr == null) {
      return null;
    }
    return zzbcr.asBinder();
  }
  
  final IBinder zzEH()
  {
    if (zzbcY == null) {
      return null;
    }
    return zzbcY.asBinder();
  }
  
  final IBinder zzEI()
  {
    if (zzbdd == null) {
      return null;
    }
    return zzbdd.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.SubscribeRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */