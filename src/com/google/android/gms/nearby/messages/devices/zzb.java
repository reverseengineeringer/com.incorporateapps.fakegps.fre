package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public class zzb
{
  private final zzc zzbbZ;
  
  public zzb(byte[] paramArrayOfByte)
  {
    zzbbZ = new zzc(zzu(paramArrayOfByte));
  }
  
  private static byte[] zzu(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 16) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Bytes must be a namespace plus instance (16 bytes).");
      return paramArrayOfByte;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzb)) {
      return false;
    }
    paramObject = (zzb)paramObject;
    return zzw.equal(zzbbZ, zzbbZ);
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzbbZ });
  }
  
  public String toString()
  {
    return "EddystoneUid{id=" + zzEt() + '}';
  }
  
  public String zzEt()
  {
    return zzbbZ.zzEt();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.devices.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */