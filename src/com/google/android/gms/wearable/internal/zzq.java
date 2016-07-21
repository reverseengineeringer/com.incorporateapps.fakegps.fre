package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;

public final class zzq
  extends OutputStream
{
  private volatile zzm zzbsk;
  private final OutputStream zzbsm;
  
  public zzq(OutputStream paramOutputStream)
  {
    zzbsm = ((OutputStream)zzx.zzz(paramOutputStream));
  }
  
  private IOException zza(IOException paramIOException)
  {
    zzm localzzm = zzbsk;
    Object localObject = paramIOException;
    if (localzzm != null)
    {
      if (Log.isLoggable("ChannelOutputStream", 2)) {
        Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", paramIOException);
      }
      localObject = new ChannelIOException("Channel closed unexpectedly before stream was finished", zzbsa, zzbsb);
    }
    return (IOException)localObject;
  }
  
  public final void close()
  {
    try
    {
      zzbsm.close();
      return;
    }
    catch (IOException localIOException)
    {
      throw zza(localIOException);
    }
  }
  
  public final void flush()
  {
    try
    {
      zzbsm.flush();
      return;
    }
    catch (IOException localIOException)
    {
      throw zza(localIOException);
    }
  }
  
  public final void write(int paramInt)
  {
    try
    {
      zzbsm.write(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      throw zza(localIOException);
    }
  }
  
  public final void write(byte[] paramArrayOfByte)
  {
    try
    {
      zzbsm.write(paramArrayOfByte);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      throw zza(paramArrayOfByte);
    }
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      zzbsm.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      throw zza(paramArrayOfByte);
    }
  }
  
  final zzu zzIJ()
  {
    return new zzq.1(this);
  }
  
  final void zzc(zzm paramzzm)
  {
    zzbsk = paramzzm;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */