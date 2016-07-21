package com.google.android.gms.vision.face.internal.client;

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
  
  public void zzIh()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
      zzoz.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public FaceParcel[] zzc(com.google.android.gms.dynamic.zzd paramzzd, com.google.android.gms.vision.internal.client.FrameMetadataParcel paramFrameMetadataParcel)
  {
    // Byte code:
    //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 27
    //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +73 -> 89
    //   19: aload_1
    //   20: invokeinterface 49 1 0
    //   25: astore_1
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual 52	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   31: aload_2
    //   32: ifnull +62 -> 94
    //   35: aload_3
    //   36: iconst_1
    //   37: invokevirtual 56	android/os/Parcel:writeInt	(I)V
    //   40: aload_2
    //   41: aload_3
    //   42: iconst_0
    //   43: invokevirtual 62	com/google/android/gms/vision/internal/client/FrameMetadataParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   46: aload_0
    //   47: getfield 15	com/google/android/gms/vision/face/internal/client/zzc$zza$zza:zzoz	Landroid/os/IBinder;
    //   50: iconst_1
    //   51: aload_3
    //   52: aload 4
    //   54: iconst_0
    //   55: invokeinterface 37 5 0
    //   60: pop
    //   61: aload 4
    //   63: invokevirtual 40	android/os/Parcel:readException	()V
    //   66: aload 4
    //   68: getstatic 68	com/google/android/gms/vision/face/internal/client/FaceParcel:CREATOR	Lcom/google/android/gms/vision/face/internal/client/zza;
    //   71: invokevirtual 72	android/os/Parcel:createTypedArray	(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;
    //   74: checkcast 74	[Lcom/google/android/gms/vision/face/internal/client/FaceParcel;
    //   77: astore_1
    //   78: aload 4
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: aload_1
    //   88: areturn
    //   89: aconst_null
    //   90: astore_1
    //   91: goto -65 -> 26
    //   94: aload_3
    //   95: iconst_0
    //   96: invokevirtual 56	android/os/Parcel:writeInt	(I)V
    //   99: goto -53 -> 46
    //   102: astore_1
    //   103: aload 4
    //   105: invokevirtual 43	android/os/Parcel:recycle	()V
    //   108: aload_3
    //   109: invokevirtual 43	android/os/Parcel:recycle	()V
    //   112: aload_1
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	zza
    //   0	114	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	114	2	paramFrameMetadataParcel	com.google.android.gms.vision.internal.client.FrameMetadataParcel
    //   3	106	3	localParcel1	Parcel
    //   7	97	4	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   9	15	102	finally
    //   19	26	102	finally
    //   26	31	102	finally
    //   35	46	102	finally
    //   46	78	102	finally
    //   94	99	102	finally
  }
  
  public boolean zzkJ(int paramInt)
  {
    boolean bool = false;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
      localParcel1.writeInt(paramInt);
      zzoz.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      if (paramInt != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.internal.client.zzc.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */