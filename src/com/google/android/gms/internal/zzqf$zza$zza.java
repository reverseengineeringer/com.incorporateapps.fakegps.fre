package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzqf$zza$zza
  implements zzqf
{
  private IBinder zzoz;
  
  zzqf$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void onError(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
      localParcel.writeInt(paramInt);
      zzoz.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzs(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
      localParcel.writeByteArray(paramArrayOfByte);
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
 * Qualified Name:     com.google.android.gms.internal.zzqf.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */