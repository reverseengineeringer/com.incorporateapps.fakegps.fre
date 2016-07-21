package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzlt$zza$zza
  implements zzlt
{
  private IBinder zzoz;
  
  zzlt$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void destroy()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      zzoz.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void disconnect()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      zzoz.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zza(zzls paramzzls)
  {
    IBinder localIBinder = null;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      if (paramzzls != null) {
        localIBinder = paramzzls.asBinder();
      }
      localParcel.writeStrongBinder(localIBinder);
      zzoz.transact(6, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zza(zzls paramzzls, int paramInt)
  {
    IBinder localIBinder = null;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      if (paramzzls != null) {
        localIBinder = paramzzls.asBinder();
      }
      localParcel.writeStrongBinder(localIBinder);
      localParcel.writeInt(paramInt);
      zzoz.transact(5, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void zza(zzls paramzzls, zzlu paramzzlu, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 6
    //   8: aload 6
    //   10: ldc 27
    //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +70 -> 86
    //   19: aload_1
    //   20: invokeinterface 47 1 0
    //   25: astore_1
    //   26: aload 6
    //   28: aload_1
    //   29: invokevirtual 50	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload 5
    //   34: astore_1
    //   35: aload_2
    //   36: ifnull +10 -> 46
    //   39: aload_2
    //   40: invokeinterface 59 1 0
    //   45: astore_1
    //   46: aload 6
    //   48: aload_1
    //   49: invokevirtual 50	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   52: aload 6
    //   54: aload_3
    //   55: invokevirtual 62	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   58: aload 6
    //   60: aload 4
    //   62: invokevirtual 62	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   65: aload_0
    //   66: getfield 15	com/google/android/gms/internal/zzlt$zza$zza:zzoz	Landroid/os/IBinder;
    //   69: iconst_4
    //   70: aload 6
    //   72: aconst_null
    //   73: iconst_1
    //   74: invokeinterface 37 5 0
    //   79: pop
    //   80: aload 6
    //   82: invokevirtual 40	android/os/Parcel:recycle	()V
    //   85: return
    //   86: aconst_null
    //   87: astore_1
    //   88: goto -62 -> 26
    //   91: astore_1
    //   92: aload 6
    //   94: invokevirtual 40	android/os/Parcel:recycle	()V
    //   97: aload_1
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	zza
    //   0	99	1	paramzzls	zzls
    //   0	99	2	paramzzlu	zzlu
    //   0	99	3	paramString1	String
    //   0	99	4	paramString2	String
    //   1	32	5	localObject	Object
    //   6	87	6	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	15	91	finally
    //   19	26	91	finally
    //   26	32	91	finally
    //   39	46	91	finally
    //   46	80	91	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlt.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */