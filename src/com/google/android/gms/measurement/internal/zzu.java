package com.google.android.gms.measurement.internal;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqa.zza;
import com.google.android.gms.internal.zzqa.zzb;
import com.google.android.gms.internal.zzqa.zzc;
import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import java.io.IOException;
import java.util.Map;

public class zzu
  extends zzz
{
  private final Map zzaXF = new ArrayMap();
  private final Map zzaXG = new ArrayMap();
  private final Map zzaXH = new ArrayMap();
  
  zzu(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private Map zza(zzqa.zzb paramzzb)
  {
    ArrayMap localArrayMap = new ArrayMap();
    if ((paramzzb != null) && (zzaZV != null))
    {
      paramzzb = zzaZV;
      int j = paramzzb.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramzzb[i];
        if (localObject != null) {
          localArrayMap.put(key, value);
        }
        i += 1;
      }
    }
    return localArrayMap;
  }
  
  private Map zzb(zzqa.zzb paramzzb)
  {
    ArrayMap localArrayMap = new ArrayMap();
    if ((paramzzb != null) && (zzaZW != null))
    {
      paramzzb = zzaZW;
      int j = paramzzb.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramzzb[i];
        if (localObject != null) {
          localArrayMap.put(name, zzaZS);
        }
        i += 1;
      }
    }
    return localArrayMap;
  }
  
  private zzqa.zzb zzf(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return new zzqa.zzb();
    }
    paramArrayOfByte = zzsm.zzD(paramArrayOfByte);
    zzqa.zzb localzzb = new zzqa.zzb();
    try
    {
      localzzb.zzA(paramArrayOfByte);
      zzAo().zzCK().zze("Parsed config. version, gmp_app_id", zzaZT, zzaVt);
      return localzzb;
    }
    catch (IOException paramArrayOfByte)
    {
      zzAo().zzCF().zze("Unable to merge remote config", paramString, paramArrayOfByte);
    }
    return null;
  }
  
  private void zzfj(String paramString)
  {
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    if (!zzaXH.containsKey(paramString))
    {
      localObject = zzCj().zzfa(paramString);
      if (localObject == null)
      {
        zzaXF.put(paramString, null);
        zzaXG.put(paramString, null);
        zzaXH.put(paramString, null);
      }
    }
    else
    {
      return;
    }
    Object localObject = zzf(paramString, (byte[])localObject);
    zzaXF.put(paramString, zza((zzqa.zzb)localObject));
    zzaXG.put(paramString, zzb((zzqa.zzb)localObject));
    zzaXH.put(paramString, localObject);
  }
  
  String zzO(String paramString1, String paramString2)
  {
    zzjk();
    zzfj(paramString1);
    paramString1 = (Map)zzaXF.get(paramString1);
    if (paramString1 != null) {
      return (String)paramString1.get(paramString2);
    }
    return null;
  }
  
  boolean zzP(String paramString1, String paramString2)
  {
    zzjk();
    zzfj(paramString1);
    paramString1 = (Map)zzaXG.get(paramString1);
    if (paramString1 != null)
    {
      paramString1 = (Boolean)paramString1.get(paramString2);
      if (paramString1 == null) {
        return false;
      }
      return paramString1.booleanValue();
    }
    return false;
  }
  
  protected boolean zze(String paramString, byte[] paramArrayOfByte)
  {
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    zzqa.zzb localzzb = zzf(paramString, paramArrayOfByte);
    if (localzzb == null) {
      return false;
    }
    zzaXG.put(paramString, zzb(localzzb));
    zzaXH.put(paramString, localzzb);
    zzaXF.put(paramString, zza(localzzb));
    zzCe().zza(paramString, zzaZX);
    try
    {
      zzaZX = null;
      byte[] arrayOfByte = new byte[localzzb.getSerializedSize()];
      localzzb.writeTo(zzsn.zzE(arrayOfByte));
      paramArrayOfByte = arrayOfByte;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        zzAo().zzCF().zzj("Unable to serialize reduced-size config.  Storing full config instead.", localIOException);
      }
    }
    zzCj().zzd(paramString, paramArrayOfByte);
    return true;
  }
  
  protected zzqa.zzb zzfk(String paramString)
  {
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    zzfj(paramString);
    return (zzqa.zzb)zzaXH.get(paramString);
  }
  
  protected void zziJ() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */