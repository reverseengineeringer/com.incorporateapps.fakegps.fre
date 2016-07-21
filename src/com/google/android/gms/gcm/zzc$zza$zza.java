package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;

class zzc$zza$zza
  implements zzc
{
  private IBinder zzoz;
  
  zzc$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void zzhe(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
      localParcel1.writeInt(paramInt);
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
 * Qualified Name:     com.google.android.gms.gcm.zzc.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */