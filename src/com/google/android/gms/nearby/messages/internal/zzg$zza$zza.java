package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzg$zza$zza
  implements zzg
{
  private IBinder zzoz;
  
  zzg$zza$zza(IBinder paramIBinder)
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
      localParcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IPublishCallback");
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
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzg.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */