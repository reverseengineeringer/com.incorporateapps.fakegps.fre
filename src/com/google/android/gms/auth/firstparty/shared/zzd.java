package com.google.android.gms.auth.firstparty.shared;

public enum zzd
{
  private final String zzZA;
  
  private zzd(String paramString1)
  {
    zzZA = paramString1;
  }
  
  public static boolean zza(zzd paramzzd)
  {
    return (zzYK.equals(paramzzd)) || (zzYT.equals(paramzzd)) || (zzYW.equals(paramzzd)) || (zzYO.equals(paramzzd)) || (zzYY.equals(paramzzd)) || (zzZa.equals(paramzzd)) || (zzb(paramzzd));
  }
  
  public static boolean zzb(zzd paramzzd)
  {
    return (zzYD.equals(paramzzd)) || (zzZb.equals(paramzzd)) || (zzZc.equals(paramzzd)) || (zzZd.equals(paramzzd)) || (zzZe.equals(paramzzd)) || (zzZf.equals(paramzzd)) || (zzZg.equals(paramzzd)) || (zzZh.equals(paramzzd));
  }
  
  public static final zzd zzbY(String paramString)
  {
    Object localObject = null;
    zzd[] arrayOfzzd = values();
    int j = arrayOfzzd.length;
    int i = 0;
    if (i < j)
    {
      zzd localzzd = arrayOfzzd[i];
      if (!zzZA.equals(paramString)) {
        break label48;
      }
      localObject = localzzd;
    }
    label48:
    for (;;)
    {
      i += 1;
      break;
      return (zzd)localObject;
    }
  }
  
  public static boolean zzc(zzd paramzzd)
  {
    return (zzYH.equals(paramzzd)) || (zzYI.equals(paramzzd));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.firstparty.shared.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */