package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzlu$zza$zza
  implements zzlu
{
  private IBinder zzoz;
  
  zzlu$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void zzbp(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
      localParcel.writeInt(paramInt);
      zzoz.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlu.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */