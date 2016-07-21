package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.UUID;

public class zzd
{
  private final zze zzbca;
  
  public zzd(byte[] paramArrayOfByte)
  {
    zzbca = new zze(zzu(paramArrayOfByte));
  }
  
  private static byte[] zzu(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 20) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
      return paramArrayOfByte;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzd)) {
      return false;
    }
    paramObject = (zzd)paramObject;
    return zzw.equal(zzbca, zzbca);
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzbca });
  }
  
  public String toString()
  {
    return "IBeaconId{proximityUuid=" + zzEu() + ", major=" + zzEv() + ", minor=" + zzEw() + '}';
  }
  
  public UUID zzEu()
  {
    return zzbca.zzEu();
  }
  
  public short zzEv()
  {
    return zzbca.zzEx().shortValue();
  }
  
  public short zzEw()
  {
    return zzbca.zzEy().shortValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.devices.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */