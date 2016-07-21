package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.nearby.bootstrap.Device;

public abstract interface zzqe
  extends IInterface
{
  public abstract void onDisconnected();
  
  public abstract void onError(int paramInt);
  
  public abstract void zzEc();
  
  public abstract void zza(Device paramDevice, byte[] paramArrayOfByte);
  
  public abstract void zzfw(String paramString);
  
  public abstract void zzfx(String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */