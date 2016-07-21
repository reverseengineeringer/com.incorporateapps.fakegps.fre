package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class zzah$zza
{
  private int zzTe;
  private ByteArrayOutputStream zzTf = new ByteArrayOutputStream();
  
  public zzah$zza(zzah paramzzah) {}
  
  public byte[] getPayload()
  {
    return zzTf.toByteArray();
  }
  
  public boolean zzj(zzab paramzzab)
  {
    zzx.zzz(paramzzab);
    if (zzTe + 1 > zzTg.zzjn().zzkD()) {
      return false;
    }
    Object localObject = zzTg.zza(paramzzab, false);
    if (localObject == null)
    {
      zzTg.zzjm().zza(paramzzab, "Error formatting hit");
      return true;
    }
    localObject = ((String)localObject).getBytes();
    int j = localObject.length;
    if (j > zzTg.zzjn().zzkv())
    {
      zzTg.zzjm().zza(paramzzab, "Hit size exceeds the maximum size limit");
      return true;
    }
    int i = j;
    if (zzTf.size() > 0) {
      i = j + 1;
    }
    if (i + zzTf.size() > zzTg.zzjn().zzkx()) {
      return false;
    }
    try
    {
      if (zzTf.size() > 0) {
        zzTf.write(zzah.zzlD());
      }
      zzTf.write((byte[])localObject);
      zzTe += 1;
      return true;
    }
    catch (IOException paramzzab)
    {
      zzTg.zze("Failed to write payload when batching hits", paramzzab);
    }
    return true;
  }
  
  public int zzlE()
  {
    return zzTe;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzah.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */