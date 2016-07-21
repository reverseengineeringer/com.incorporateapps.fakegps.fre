package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.InputStream;

public final class zzp
  extends InputStream
{
  private final InputStream zzbsj;
  private volatile zzm zzbsk;
  
  public zzp(InputStream paramInputStream)
  {
    zzbsj = ((InputStream)zzx.zzz(paramInputStream));
  }
  
  private int zzlK(int paramInt)
  {
    if (paramInt == -1)
    {
      zzm localzzm = zzbsk;
      if (localzzm != null) {
        throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzbsa, zzbsb);
      }
    }
    return paramInt;
  }
  
  public final int available()
  {
    return zzbsj.available();
  }
  
  public final void close()
  {
    zzbsj.close();
  }
  
  public final void mark(int paramInt)
  {
    zzbsj.mark(paramInt);
  }
  
  public final boolean markSupported()
  {
    return zzbsj.markSupported();
  }
  
  public final int read()
  {
    return zzlK(zzbsj.read());
  }
  
  public final int read(byte[] paramArrayOfByte)
  {
    return zzlK(zzbsj.read(paramArrayOfByte));
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zzlK(zzbsj.read(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public final void reset()
  {
    zzbsj.reset();
  }
  
  public final long skip(long paramLong)
  {
    return zzbsj.skip(paramLong);
  }
  
  final zzu zzIJ()
  {
    return new zzp.1(this);
  }
  
  final void zza(zzm paramzzm)
  {
    zzbsk = ((zzm)zzx.zzz(paramzzm));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */