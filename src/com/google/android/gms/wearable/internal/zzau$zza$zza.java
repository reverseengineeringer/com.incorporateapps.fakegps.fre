package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzau$zza$zza
  implements zzau
{
  private IBinder zzoz;
  
  zzau$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void zzy(int paramInt1, int paramInt2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      zzoz.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzau.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */