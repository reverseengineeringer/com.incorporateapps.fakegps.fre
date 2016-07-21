package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class zzna
{
  public static long zza(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean)
  {
    return zza(paramInputStream, paramOutputStream, paramBoolean, 1024);
  }
  
  public static long zza(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    long l = 0L;
    try
    {
      for (;;)
      {
        paramInt = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
        if (paramInt == -1) {
          break;
        }
        l += paramInt;
        paramOutputStream.write(arrayOfByte, 0, paramInt);
      }
      if (!paramBoolean) {
        break label71;
      }
    }
    finally
    {
      if (paramBoolean)
      {
        zzb(paramInputStream);
        zzb(paramOutputStream);
      }
    }
    zzb(paramInputStream);
    zzb(paramOutputStream);
    label71:
    return l;
  }
  
  public static void zza(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    if (paramParcelFileDescriptor != null) {}
    try
    {
      paramParcelFileDescriptor.close();
      return;
    }
    catch (IOException paramParcelFileDescriptor) {}
  }
  
  public static byte[] zza(InputStream paramInputStream, boolean paramBoolean)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    zza(paramInputStream, localByteArrayOutputStream, paramBoolean);
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static void zzb(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  public static byte[] zzk(InputStream paramInputStream)
  {
    return zza(paramInputStream, true);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzna
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */