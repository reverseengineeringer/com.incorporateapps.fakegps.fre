package com.google.android.gms.internal;

import android.os.IBinder;

class zzly$zza$zza
  implements zzly
{
  private IBinder zzoz;
  
  zzly$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  /* Error */
  public void zza(zzlx paramzzlx, com.google.android.gms.clearcut.LogEventParcelable paramLogEventParcelable)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore 4
    //   7: aload 4
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +10 -> 25
    //   18: aload_1
    //   19: invokeinterface 36 1 0
    //   24: astore_3
    //   25: aload 4
    //   27: aload_3
    //   28: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   31: aload_2
    //   32: ifnull +37 -> 69
    //   35: aload 4
    //   37: iconst_1
    //   38: invokevirtual 43	android/os/Parcel:writeInt	(I)V
    //   41: aload_2
    //   42: aload 4
    //   44: iconst_0
    //   45: invokevirtual 49	com/google/android/gms/clearcut/LogEventParcelable:writeToParcel	(Landroid/os/Parcel;I)V
    //   48: aload_0
    //   49: getfield 15	com/google/android/gms/internal/zzly$zza$zza:zzoz	Landroid/os/IBinder;
    //   52: iconst_1
    //   53: aload 4
    //   55: aconst_null
    //   56: iconst_1
    //   57: invokeinterface 55 5 0
    //   62: pop
    //   63: aload 4
    //   65: invokevirtual 58	android/os/Parcel:recycle	()V
    //   68: return
    //   69: aload 4
    //   71: iconst_0
    //   72: invokevirtual 43	android/os/Parcel:writeInt	(I)V
    //   75: goto -27 -> 48
    //   78: astore_1
    //   79: aload 4
    //   81: invokevirtual 58	android/os/Parcel:recycle	()V
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	zza
    //   0	86	1	paramzzlx	zzlx
    //   0	86	2	paramLogEventParcelable	com.google.android.gms.clearcut.LogEventParcelable
    //   1	27	3	localIBinder	IBinder
    //   5	75	4	localParcel	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   7	14	78	finally
    //   18	25	78	finally
    //   25	31	78	finally
    //   35	48	78	finally
    //   48	63	78	finally
    //   69	75	78	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzly.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */