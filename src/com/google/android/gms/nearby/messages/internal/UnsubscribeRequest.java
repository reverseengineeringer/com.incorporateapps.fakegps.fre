package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UnsubscribeRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzu();
  final int mVersionCode;
  public final String zzbbF;
  public final boolean zzbbH;
  public final zzd zzbcY;
  public final String zzbco;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  public final PendingIntent zzbda;
  public final int zzbdb;
  
  UnsubscribeRequest(int paramInt1, IBinder paramIBinder1, IBinder paramIBinder2, PendingIntent paramPendingIntent, int paramInt2, String paramString1, String paramString2, boolean paramBoolean, ClientAppContext paramClientAppContext)
  {
    mVersionCode = paramInt1;
    zzbcY = zzd.zza.zzdy(paramIBinder1);
    zzbcr = zze.zza.zzdz(paramIBinder2);
    zzbda = paramPendingIntent;
    zzbdb = paramInt2;
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
  
  UnsubscribeRequest(IBinder paramIBinder1, IBinder paramIBinder2, PendingIntent paramPendingIntent, int paramInt, ClientAppContext paramClientAppContext)
  {
    this(1, paramIBinder1, paramIBinder2, paramPendingIntent, paramInt, null, null, false, paramClientAppContext);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzu.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzED()
  {
    return zzbcr.asBinder();
  }
  
  final IBinder zzEH()
  {
    if (zzbcY == null) {
      return null;
    }
    return zzbcY.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.UnsubscribeRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */