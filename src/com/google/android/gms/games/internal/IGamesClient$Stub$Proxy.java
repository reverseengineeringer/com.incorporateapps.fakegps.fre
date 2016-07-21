package com.google.android.gms.games.internal;

import android.os.IBinder;

class IGamesClient$Stub$Proxy
  implements IGamesClient
{
  private IBinder zzoz;
  
  IGamesClient$Stub$Proxy(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  /* Error */
  public PopupLocationInfoParcelable zzws()
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/games/internal/IGamesClient$Stub$Proxy:zzoz	Landroid/os/IBinder;
    //   18: sipush 1001
    //   21: aload_2
    //   22: aload_3
    //   23: iconst_0
    //   24: invokeinterface 38 5 0
    //   29: pop
    //   30: aload_3
    //   31: invokevirtual 41	android/os/Parcel:readException	()V
    //   34: aload_3
    //   35: invokevirtual 45	android/os/Parcel:readInt	()I
    //   38: ifeq +21 -> 59
    //   41: getstatic 51	com/google/android/gms/games/internal/PopupLocationInfoParcelable:CREATOR	Lcom/google/android/gms/games/internal/PopupLocationInfoParcelableCreator;
    //   44: aload_3
    //   45: invokevirtual 57	com/google/android/gms/games/internal/PopupLocationInfoParcelableCreator:zzem	(Landroid/os/Parcel;)Lcom/google/android/gms/games/internal/PopupLocationInfoParcelable;
    //   48: astore_1
    //   49: aload_3
    //   50: invokevirtual 60	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 60	android/os/Parcel:recycle	()V
    //   57: aload_1
    //   58: areturn
    //   59: aconst_null
    //   60: astore_1
    //   61: goto -12 -> 49
    //   64: astore_1
    //   65: aload_3
    //   66: invokevirtual 60	android/os/Parcel:recycle	()V
    //   69: aload_2
    //   70: invokevirtual 60	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	Proxy
    //   48	13	1	localPopupLocationInfoParcelable	PopupLocationInfoParcelable
    //   64	10	1	localObject	Object
    //   3	67	2	localParcel1	android.os.Parcel
    //   7	59	3	localParcel2	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   8	49	64	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.IGamesClient.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */