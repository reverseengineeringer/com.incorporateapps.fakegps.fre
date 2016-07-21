package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzqm$zza$zza
  implements zzqm
{
  private IBinder zzoz;
  
  zzqm$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void onConnectionRequest(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeString(paramString3);
      localParcel1.writeByteArray(paramArrayOfByte);
      zzoz.transact(1001, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void onDisconnected(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeString(paramString);
      zzoz.transact(1008, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void onEndpointFound(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeString(paramString3);
      localParcel1.writeString(paramString4);
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
  
  public void onEndpointLost(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeString(paramString);
      zzoz.transact(1003, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void onMessageReceived(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i = 0;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeString(paramString);
      localParcel1.writeByteArray(paramArrayOfByte);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      zzoz.transact(1007, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void zza(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeString(paramString);
      localParcel1.writeInt(paramInt);
      localParcel1.writeByteArray(paramArrayOfByte);
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
  
  /* Error */
  public void zza(String paramString1, String paramString2, String paramString3, String paramString4, com.google.android.gms.nearby.connection.AppMetadata paramAppMetadata)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 6
    //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 7
    //   10: aload 6
    //   12: ldc 28
    //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload 6
    //   19: aload_1
    //   20: invokevirtual 35	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   23: aload 6
    //   25: aload_2
    //   26: invokevirtual 35	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   29: aload 6
    //   31: aload_3
    //   32: invokevirtual 35	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   35: aload 6
    //   37: aload 4
    //   39: invokevirtual 35	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   42: aload 5
    //   44: ifnull +51 -> 95
    //   47: aload 6
    //   49: iconst_1
    //   50: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   53: aload 5
    //   55: aload 6
    //   57: iconst_0
    //   58: invokevirtual 70	com/google/android/gms/nearby/connection/AppMetadata:writeToParcel	(Landroid/os/Parcel;I)V
    //   61: aload_0
    //   62: getfield 15	com/google/android/gms/internal/zzqm$zza$zza:zzoz	Landroid/os/IBinder;
    //   65: sipush 1004
    //   68: aload 6
    //   70: aload 7
    //   72: iconst_0
    //   73: invokeinterface 45 5 0
    //   78: pop
    //   79: aload 7
    //   81: invokevirtual 48	android/os/Parcel:readException	()V
    //   84: aload 7
    //   86: invokevirtual 51	android/os/Parcel:recycle	()V
    //   89: aload 6
    //   91: invokevirtual 51	android/os/Parcel:recycle	()V
    //   94: return
    //   95: aload 6
    //   97: iconst_0
    //   98: invokevirtual 61	android/os/Parcel:writeInt	(I)V
    //   101: goto -40 -> 61
    //   104: astore_1
    //   105: aload 7
    //   107: invokevirtual 51	android/os/Parcel:recycle	()V
    //   110: aload 6
    //   112: invokevirtual 51	android/os/Parcel:recycle	()V
    //   115: aload_1
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	zza
    //   0	117	1	paramString1	String
    //   0	117	2	paramString2	String
    //   0	117	3	paramString3	String
    //   0	117	4	paramString4	String
    //   0	117	5	paramAppMetadata	com.google.android.gms.nearby.connection.AppMetadata
    //   3	108	6	localParcel1	Parcel
    //   8	98	7	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   10	42	104	finally
    //   47	61	104	finally
    //   61	84	104	finally
    //   95	101	104	finally
  }
  
  public void zzfy(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeString(paramString);
      zzoz.transact(1005, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void zziW(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeInt(paramInt);
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
  
  public void zziX(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeInt(paramInt);
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
  
  public void zziY(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeInt(paramInt);
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
  
  public void zziZ(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeInt(paramInt);
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
  
  public void zzja(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeInt(paramInt);
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
  
  public void zzm(int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString);
      zzoz.transact(1009, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.zzqm.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */