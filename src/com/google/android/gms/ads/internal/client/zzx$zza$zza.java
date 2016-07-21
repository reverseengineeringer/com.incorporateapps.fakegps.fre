package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;

class zzx$zza$zza
  implements zzx
{
  private IBinder zzoz;
  
  zzx$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public long getValue()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
      zzoz.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      long l = localParcel2.readLong();
      return l;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzx.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */