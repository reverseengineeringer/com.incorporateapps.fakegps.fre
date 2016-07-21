package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzqn$zza$zza
  implements zzqn
{
  private IBinder zzoz;
  
  zzqn$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public String zzEk()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zzoz.transact(1016, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void zzF(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localParcel1.writeLong(paramLong);
      zzoz.transact(1014, localParcel1, localParcel2, 0);
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
  public void zza(zzqm paramzzqm, int paramInt, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 7
    //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 8
    //   10: aload 7
    //   12: ldc 28
    //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +69 -> 87
    //   21: aload_1
    //   22: invokeinterface 58 1 0
    //   27: astore_1
    //   28: aload 7
    //   30: aload_1
    //   31: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   34: aload 7
    //   36: iload_2
    //   37: invokevirtual 65	android/os/Parcel:writeInt	(I)V
    //   40: aload 7
    //   42: lload_3
    //   43: invokevirtual 52	android/os/Parcel:writeLong	(J)V
    //   46: aload 7
    //   48: lload 5
    //   50: invokevirtual 52	android/os/Parcel:writeLong	(J)V
    //   53: aload_0
    //   54: getfield 15	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   57: sipush 1005
    //   60: aload 7
    //   62: aload 8
    //   64: iconst_0
    //   65: invokeinterface 38 5 0
    //   70: pop
    //   71: aload 8
    //   73: invokevirtual 41	android/os/Parcel:readException	()V
    //   76: aload 8
    //   78: invokevirtual 47	android/os/Parcel:recycle	()V
    //   81: aload 7
    //   83: invokevirtual 47	android/os/Parcel:recycle	()V
    //   86: return
    //   87: aconst_null
    //   88: astore_1
    //   89: goto -61 -> 28
    //   92: astore_1
    //   93: aload 8
    //   95: invokevirtual 47	android/os/Parcel:recycle	()V
    //   98: aload 7
    //   100: invokevirtual 47	android/os/Parcel:recycle	()V
    //   103: aload_1
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	zza
    //   0	105	1	paramzzqm	zzqm
    //   0	105	2	paramInt	int
    //   0	105	3	paramLong1	long
    //   0	105	5	paramLong2	long
    //   3	96	7	localParcel1	Parcel
    //   8	86	8	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	92	finally
    //   21	28	92	finally
    //   28	76	92	finally
  }
  
  /* Error */
  public void zza(zzqm paramzzqm, String paramString, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 5
    //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 6
    //   10: aload 5
    //   12: ldc 28
    //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +62 -> 80
    //   21: aload_1
    //   22: invokeinterface 58 1 0
    //   27: astore_1
    //   28: aload 5
    //   30: aload_1
    //   31: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   34: aload 5
    //   36: aload_2
    //   37: invokevirtual 69	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   40: aload 5
    //   42: lload_3
    //   43: invokevirtual 52	android/os/Parcel:writeLong	(J)V
    //   46: aload_0
    //   47: getfield 15	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   50: sipush 1009
    //   53: aload 5
    //   55: aload 6
    //   57: iconst_0
    //   58: invokeinterface 38 5 0
    //   63: pop
    //   64: aload 6
    //   66: invokevirtual 41	android/os/Parcel:readException	()V
    //   69: aload 6
    //   71: invokevirtual 47	android/os/Parcel:recycle	()V
    //   74: aload 5
    //   76: invokevirtual 47	android/os/Parcel:recycle	()V
    //   79: return
    //   80: aconst_null
    //   81: astore_1
    //   82: goto -54 -> 28
    //   85: astore_1
    //   86: aload 6
    //   88: invokevirtual 47	android/os/Parcel:recycle	()V
    //   91: aload 5
    //   93: invokevirtual 47	android/os/Parcel:recycle	()V
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	zza
    //   0	98	1	paramzzqm	zzqm
    //   0	98	2	paramString	String
    //   0	98	3	paramLong	long
    //   3	89	5	localParcel1	Parcel
    //   8	79	6	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	85	finally
    //   21	28	85	finally
    //   28	69	85	finally
  }
  
  /* Error */
  public void zza(zzqm paramzzqm, String paramString, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 7
    //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 8
    //   10: aload 7
    //   12: ldc 28
    //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +69 -> 87
    //   21: aload_1
    //   22: invokeinterface 58 1 0
    //   27: astore_1
    //   28: aload 7
    //   30: aload_1
    //   31: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   34: aload 7
    //   36: aload_2
    //   37: invokevirtual 69	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   40: aload 7
    //   42: lload_3
    //   43: invokevirtual 52	android/os/Parcel:writeLong	(J)V
    //   46: aload 7
    //   48: lload 5
    //   50: invokevirtual 52	android/os/Parcel:writeLong	(J)V
    //   53: aload_0
    //   54: getfield 15	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   57: sipush 1003
    //   60: aload 7
    //   62: aload 8
    //   64: iconst_0
    //   65: invokeinterface 38 5 0
    //   70: pop
    //   71: aload 8
    //   73: invokevirtual 41	android/os/Parcel:readException	()V
    //   76: aload 8
    //   78: invokevirtual 47	android/os/Parcel:recycle	()V
    //   81: aload 7
    //   83: invokevirtual 47	android/os/Parcel:recycle	()V
    //   86: return
    //   87: aconst_null
    //   88: astore_1
    //   89: goto -61 -> 28
    //   92: astore_1
    //   93: aload 8
    //   95: invokevirtual 47	android/os/Parcel:recycle	()V
    //   98: aload 7
    //   100: invokevirtual 47	android/os/Parcel:recycle	()V
    //   103: aload_1
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	zza
    //   0	105	1	paramzzqm	zzqm
    //   0	105	2	paramString	String
    //   0	105	3	paramLong1	long
    //   0	105	5	paramLong2	long
    //   3	96	7	localParcel1	Parcel
    //   8	86	8	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	92	finally
    //   21	28	92	finally
    //   28	76	92	finally
  }
  
  /* Error */
  public void zza(zzqm paramzzqm, String paramString, com.google.android.gms.nearby.connection.AppMetadata paramAppMetadata, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 8
    //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 9
    //   10: aload 8
    //   12: ldc 28
    //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +87 -> 105
    //   21: aload_1
    //   22: invokeinterface 58 1 0
    //   27: astore_1
    //   28: aload 8
    //   30: aload_1
    //   31: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   34: aload 8
    //   36: aload_2
    //   37: invokevirtual 69	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   40: aload_3
    //   41: ifnull +69 -> 110
    //   44: aload 8
    //   46: iconst_1
    //   47: invokevirtual 65	android/os/Parcel:writeInt	(I)V
    //   50: aload_3
    //   51: aload 8
    //   53: iconst_0
    //   54: invokevirtual 77	com/google/android/gms/nearby/connection/AppMetadata:writeToParcel	(Landroid/os/Parcel;I)V
    //   57: aload 8
    //   59: lload 4
    //   61: invokevirtual 52	android/os/Parcel:writeLong	(J)V
    //   64: aload 8
    //   66: lload 6
    //   68: invokevirtual 52	android/os/Parcel:writeLong	(J)V
    //   71: aload_0
    //   72: getfield 15	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   75: sipush 1001
    //   78: aload 8
    //   80: aload 9
    //   82: iconst_0
    //   83: invokeinterface 38 5 0
    //   88: pop
    //   89: aload 9
    //   91: invokevirtual 41	android/os/Parcel:readException	()V
    //   94: aload 9
    //   96: invokevirtual 47	android/os/Parcel:recycle	()V
    //   99: aload 8
    //   101: invokevirtual 47	android/os/Parcel:recycle	()V
    //   104: return
    //   105: aconst_null
    //   106: astore_1
    //   107: goto -79 -> 28
    //   110: aload 8
    //   112: iconst_0
    //   113: invokevirtual 65	android/os/Parcel:writeInt	(I)V
    //   116: goto -59 -> 57
    //   119: astore_1
    //   120: aload 9
    //   122: invokevirtual 47	android/os/Parcel:recycle	()V
    //   125: aload 8
    //   127: invokevirtual 47	android/os/Parcel:recycle	()V
    //   130: aload_1
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	zza
    //   0	132	1	paramzzqm	zzqm
    //   0	132	2	paramString	String
    //   0	132	3	paramAppMetadata	com.google.android.gms.nearby.connection.AppMetadata
    //   0	132	4	paramLong1	long
    //   0	132	6	paramLong2	long
    //   3	123	8	localParcel1	Parcel
    //   8	113	9	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	119	finally
    //   21	28	119	finally
    //   28	40	119	finally
    //   44	57	119	finally
    //   57	94	119	finally
    //   110	116	119	finally
  }
  
  /* Error */
  public void zza(zzqm paramzzqm, String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 7
    //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 8
    //   10: aload 7
    //   12: ldc 28
    //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +76 -> 94
    //   21: aload_1
    //   22: invokeinterface 58 1 0
    //   27: astore_1
    //   28: aload 7
    //   30: aload_1
    //   31: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   34: aload 7
    //   36: aload_2
    //   37: invokevirtual 69	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   40: aload 7
    //   42: aload_3
    //   43: invokevirtual 69	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 7
    //   48: aload 4
    //   50: invokevirtual 82	android/os/Parcel:writeByteArray	([B)V
    //   53: aload 7
    //   55: lload 5
    //   57: invokevirtual 52	android/os/Parcel:writeLong	(J)V
    //   60: aload_0
    //   61: getfield 15	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   64: sipush 1007
    //   67: aload 7
    //   69: aload 8
    //   71: iconst_0
    //   72: invokeinterface 38 5 0
    //   77: pop
    //   78: aload 8
    //   80: invokevirtual 41	android/os/Parcel:readException	()V
    //   83: aload 8
    //   85: invokevirtual 47	android/os/Parcel:recycle	()V
    //   88: aload 7
    //   90: invokevirtual 47	android/os/Parcel:recycle	()V
    //   93: return
    //   94: aconst_null
    //   95: astore_1
    //   96: goto -68 -> 28
    //   99: astore_1
    //   100: aload 8
    //   102: invokevirtual 47	android/os/Parcel:recycle	()V
    //   105: aload 7
    //   107: invokevirtual 47	android/os/Parcel:recycle	()V
    //   110: aload_1
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	zza
    //   0	112	1	paramzzqm	zzqm
    //   0	112	2	paramString1	String
    //   0	112	3	paramString2	String
    //   0	112	4	paramArrayOfByte	byte[]
    //   0	112	5	paramLong	long
    //   3	103	7	localParcel1	Parcel
    //   8	93	8	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	99	finally
    //   21	28	99	finally
    //   28	83	99	finally
  }
  
  /* Error */
  public void zza(zzqm paramzzqm, String paramString, byte[] paramArrayOfByte, long paramLong)
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
    //   18: ifnull +69 -> 87
    //   21: aload_1
    //   22: invokeinterface 58 1 0
    //   27: astore_1
    //   28: aload 6
    //   30: aload_1
    //   31: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   34: aload 6
    //   36: aload_2
    //   37: invokevirtual 69	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   40: aload 6
    //   42: aload_3
    //   43: invokevirtual 82	android/os/Parcel:writeByteArray	([B)V
    //   46: aload 6
    //   48: lload 4
    //   50: invokevirtual 52	android/os/Parcel:writeLong	(J)V
    //   53: aload_0
    //   54: getfield 15	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   57: sipush 1008
    //   60: aload 6
    //   62: aload 7
    //   64: iconst_0
    //   65: invokeinterface 38 5 0
    //   70: pop
    //   71: aload 7
    //   73: invokevirtual 41	android/os/Parcel:readException	()V
    //   76: aload 7
    //   78: invokevirtual 47	android/os/Parcel:recycle	()V
    //   81: aload 6
    //   83: invokevirtual 47	android/os/Parcel:recycle	()V
    //   86: return
    //   87: aconst_null
    //   88: astore_1
    //   89: goto -61 -> 28
    //   92: astore_1
    //   93: aload 7
    //   95: invokevirtual 47	android/os/Parcel:recycle	()V
    //   98: aload 6
    //   100: invokevirtual 47	android/os/Parcel:recycle	()V
    //   103: aload_1
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	zza
    //   0	105	1	paramzzqm	zzqm
    //   0	105	2	paramString	String
    //   0	105	3	paramArrayOfByte	byte[]
    //   0	105	4	paramLong	long
    //   3	96	6	localParcel1	Parcel
    //   8	86	7	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	92	finally
    //   21	28	92	finally
    //   28	76	92	finally
  }
  
  public void zza(String[] paramArrayOfString, byte[] paramArrayOfByte, long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localParcel1.writeStringArray(paramArrayOfString);
      localParcel1.writeByteArray(paramArrayOfByte);
      localParcel1.writeLong(paramLong);
      zzoz.transact(1010, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void zzag(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localParcel1.writeLong(paramLong);
      zzoz.transact(1002, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void zzah(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localParcel1.writeLong(paramLong);
      zzoz.transact(1006, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void zzai(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localParcel1.writeLong(paramLong);
      zzoz.transact(1013, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String zzaj(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localParcel1.writeLong(paramLong);
      zzoz.transact(1015, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void zzb(String[] paramArrayOfString, byte[] paramArrayOfByte, long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localParcel1.writeStringArray(paramArrayOfString);
      localParcel1.writeByteArray(paramArrayOfByte);
      localParcel1.writeLong(paramLong);
      zzoz.transact(1011, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void zzh(String paramString, long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localParcel1.writeString(paramString);
      localParcel1.writeLong(paramLong);
      zzoz.transact(1004, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void zzi(String paramString, long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localParcel1.writeString(paramString);
      localParcel1.writeLong(paramLong);
      zzoz.transact(1012, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.zzqn.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */