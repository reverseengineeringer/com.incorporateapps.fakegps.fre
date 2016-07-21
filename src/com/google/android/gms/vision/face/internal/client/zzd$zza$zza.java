package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;

class zzd$zza$zza
  implements zzd
{
  private IBinder zzoz;
  
  zzd$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  /* Error */
  public zzc zza(com.google.android.gms.dynamic.zzd paramzzd, FaceSettingsParcel paramFaceSettingsParcel)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 28
    //   12: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +70 -> 86
    //   19: aload_1
    //   20: invokeinterface 36 1 0
    //   25: astore_1
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   31: aload_2
    //   32: ifnull +59 -> 91
    //   35: aload_3
    //   36: iconst_1
    //   37: invokevirtual 43	android/os/Parcel:writeInt	(I)V
    //   40: aload_2
    //   41: aload_3
    //   42: iconst_0
    //   43: invokevirtual 49	com/google/android/gms/vision/face/internal/client/FaceSettingsParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   46: aload_0
    //   47: getfield 15	com/google/android/gms/vision/face/internal/client/zzd$zza$zza:zzoz	Landroid/os/IBinder;
    //   50: iconst_1
    //   51: aload_3
    //   52: aload 4
    //   54: iconst_0
    //   55: invokeinterface 55 5 0
    //   60: pop
    //   61: aload 4
    //   63: invokevirtual 58	android/os/Parcel:readException	()V
    //   66: aload 4
    //   68: invokevirtual 61	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   71: invokestatic 67	com/google/android/gms/vision/face/internal/client/zzc$zza:zzeg	(Landroid/os/IBinder;)Lcom/google/android/gms/vision/face/internal/client/zzc;
    //   74: astore_1
    //   75: aload 4
    //   77: invokevirtual 70	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 70	android/os/Parcel:recycle	()V
    //   84: aload_1
    //   85: areturn
    //   86: aconst_null
    //   87: astore_1
    //   88: goto -62 -> 26
    //   91: aload_3
    //   92: iconst_0
    //   93: invokevirtual 43	android/os/Parcel:writeInt	(I)V
    //   96: goto -50 -> 46
    //   99: astore_1
    //   100: aload 4
    //   102: invokevirtual 70	android/os/Parcel:recycle	()V
    //   105: aload_3
    //   106: invokevirtual 70	android/os/Parcel:recycle	()V
    //   109: aload_1
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	zza
    //   0	111	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	111	2	paramFaceSettingsParcel	FaceSettingsParcel
    //   3	103	3	localParcel1	android.os.Parcel
    //   7	94	4	localParcel2	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   9	15	99	finally
    //   19	26	99	finally
    //   26	31	99	finally
    //   35	46	99	finally
    //   46	75	99	finally
    //   91	96	99	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.internal.client.zzd.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */