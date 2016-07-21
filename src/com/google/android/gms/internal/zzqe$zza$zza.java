package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzqe$zza$zza
  implements zzqe
{
  private IBinder zzoz;
  
  zzqe$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void onDisconnected()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      zzoz.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onError(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      localParcel.writeInt(paramInt);
      zzoz.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzEc()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      zzoz.transact(5, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void zza(com.google.android.gms.nearby.bootstrap.Device paramDevice, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: aload_3
    //   5: ldc 27
    //   7: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   10: aload_1
    //   11: ifnull +38 -> 49
    //   14: aload_3
    //   15: iconst_1
    //   16: invokevirtual 45	android/os/Parcel:writeInt	(I)V
    //   19: aload_1
    //   20: aload_3
    //   21: iconst_0
    //   22: invokevirtual 54	com/google/android/gms/nearby/bootstrap/Device:writeToParcel	(Landroid/os/Parcel;I)V
    //   25: aload_3
    //   26: aload_2
    //   27: invokevirtual 58	android/os/Parcel:writeByteArray	([B)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/internal/zzqe$zza$zza:zzoz	Landroid/os/IBinder;
    //   34: iconst_1
    //   35: aload_3
    //   36: aconst_null
    //   37: iconst_1
    //   38: invokeinterface 37 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 40	android/os/Parcel:recycle	()V
    //   48: return
    //   49: aload_3
    //   50: iconst_0
    //   51: invokevirtual 45	android/os/Parcel:writeInt	(I)V
    //   54: goto -29 -> 25
    //   57: astore_1
    //   58: aload_3
    //   59: invokevirtual 40	android/os/Parcel:recycle	()V
    //   62: aload_1
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	zza
    //   0	64	1	paramDevice	com.google.android.gms.nearby.bootstrap.Device
    //   0	64	2	paramArrayOfByte	byte[]
    //   3	56	3	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   4	10	57	finally
    //   14	25	57	finally
    //   25	44	57	finally
    //   49	54	57	finally
  }
  
  public void zzfw(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      localParcel.writeString(paramString);
      zzoz.transact(4, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzfx(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      localParcel.writeString(paramString);
      zzoz.transact(6, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqe.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */