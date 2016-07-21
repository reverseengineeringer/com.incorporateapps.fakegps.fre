package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzi$zza$zza
  implements zzi
{
  private IBinder zzoz;
  
  zzi$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void onExpired()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
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
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzi.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */