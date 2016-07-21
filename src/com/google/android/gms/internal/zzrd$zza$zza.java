package com.google.android.gms.internal;

import android.os.IBinder;

class zzrd$zza$zza
  implements zzrd
{
  private IBinder zzoz;
  
  zzrd$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  /* Error */
  public void zza(zzrc paramzzrc)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +42 -> 57
    //   18: aload_1
    //   19: invokeinterface 36 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/internal/zzrd$zza$zza:zzoz	Landroid/os/IBinder;
    //   34: iconst_2
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 45 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 48	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 51	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 51	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aconst_null
    //   58: astore_1
    //   59: goto -34 -> 25
    //   62: astore_1
    //   63: aload_3
    //   64: invokevirtual 51	android/os/Parcel:recycle	()V
    //   67: aload_2
    //   68: invokevirtual 51	android/os/Parcel:recycle	()V
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	zza
    //   0	73	1	paramzzrc	zzrc
    //   3	65	2	localParcel1	android.os.Parcel
    //   7	57	3	localParcel2	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	62	finally
    //   18	25	62	finally
    //   25	48	62	finally
  }
  
  /* Error */
  public void zza(zzrc paramzzrc, String paramString1, int[] paramArrayOfInt, int paramInt, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 6
    //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 7
    //   10: aload 6
    //   12: ldc 28
    //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +74 -> 92
    //   21: aload_1
    //   22: invokeinterface 36 1 0
    //   27: astore_1
    //   28: aload 6
    //   30: aload_1
    //   31: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   34: aload 6
    //   36: aload_2
    //   37: invokevirtual 55	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   40: aload 6
    //   42: aload_3
    //   43: invokevirtual 59	android/os/Parcel:writeIntArray	([I)V
    //   46: aload 6
    //   48: iload 4
    //   50: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   53: aload 6
    //   55: aload 5
    //   57: invokevirtual 55	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield 15	com/google/android/gms/internal/zzrd$zza$zza:zzoz	Landroid/os/IBinder;
    //   64: iconst_3
    //   65: aload 6
    //   67: aload 7
    //   69: iconst_0
    //   70: invokeinterface 45 5 0
    //   75: pop
    //   76: aload 7
    //   78: invokevirtual 48	android/os/Parcel:readException	()V
    //   81: aload 7
    //   83: invokevirtual 51	android/os/Parcel:recycle	()V
    //   86: aload 6
    //   88: invokevirtual 51	android/os/Parcel:recycle	()V
    //   91: return
    //   92: aconst_null
    //   93: astore_1
    //   94: goto -66 -> 28
    //   97: astore_1
    //   98: aload 7
    //   100: invokevirtual 51	android/os/Parcel:recycle	()V
    //   103: aload 6
    //   105: invokevirtual 51	android/os/Parcel:recycle	()V
    //   108: aload_1
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	zza
    //   0	110	1	paramzzrc	zzrc
    //   0	110	2	paramString1	String
    //   0	110	3	paramArrayOfInt	int[]
    //   0	110	4	paramInt	int
    //   0	110	5	paramString2	String
    //   3	101	6	localParcel1	android.os.Parcel
    //   8	91	7	localParcel2	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	97	finally
    //   21	28	97	finally
    //   28	81	97	finally
  }
  
  /* Error */
  public void zza(zzrc paramzzrc, byte[] paramArrayOfByte)
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
    //   16: ifnull +50 -> 66
    //   19: aload_1
    //   20: invokeinterface 36 1 0
    //   25: astore_1
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   31: aload_3
    //   32: aload_2
    //   33: invokevirtual 68	android/os/Parcel:writeByteArray	([B)V
    //   36: aload_0
    //   37: getfield 15	com/google/android/gms/internal/zzrd$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: iconst_1
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 45 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 48	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 51	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 51	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aconst_null
    //   67: astore_1
    //   68: goto -42 -> 26
    //   71: astore_1
    //   72: aload 4
    //   74: invokevirtual 51	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: invokevirtual 51	android/os/Parcel:recycle	()V
    //   81: aload_1
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	zza
    //   0	83	1	paramzzrc	zzrc
    //   0	83	2	paramArrayOfByte	byte[]
    //   3	75	3	localParcel1	android.os.Parcel
    //   7	66	4	localParcel2	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   9	15	71	finally
    //   19	26	71	finally
    //   26	56	71	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrd.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */