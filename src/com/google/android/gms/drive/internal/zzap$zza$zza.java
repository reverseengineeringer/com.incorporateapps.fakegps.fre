package com.google.android.gms.drive.internal;

import android.os.IBinder;

class zzap$zza$zza
  implements zzap
{
  private IBinder zzoz;
  
  zzap$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  /* Error */
  public void zzv(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: aload_3
    //   7: ldc 28
    //   9: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: iload_1
    //   13: ifeq +27 -> 40
    //   16: aload_3
    //   17: iload_2
    //   18: invokevirtual 36	android/os/Parcel:writeInt	(I)V
    //   21: aload_0
    //   22: getfield 15	com/google/android/gms/drive/internal/zzap$zza$zza:zzoz	Landroid/os/IBinder;
    //   25: iconst_1
    //   26: aload_3
    //   27: aconst_null
    //   28: iconst_1
    //   29: invokeinterface 42 5 0
    //   34: pop
    //   35: aload_3
    //   36: invokevirtual 45	android/os/Parcel:recycle	()V
    //   39: return
    //   40: iconst_0
    //   41: istore_2
    //   42: goto -26 -> 16
    //   45: astore 4
    //   47: aload_3
    //   48: invokevirtual 45	android/os/Parcel:recycle	()V
    //   51: aload 4
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	zza
    //   0	54	1	paramBoolean	boolean
    //   1	41	2	i	int
    //   5	43	3	localParcel	android.os.Parcel
    //   45	7	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   6	12	45	finally
    //   16	35	45	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzap.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */