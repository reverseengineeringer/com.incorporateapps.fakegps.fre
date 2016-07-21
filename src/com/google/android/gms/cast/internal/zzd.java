package com.google.android.gms.cast.internal;

import android.text.TextUtils;

public abstract class zzd
{
  protected final zzl zzadu;
  private final String zzadv;
  private zzn zzadw;
  
  protected zzd(String paramString1, String paramString2, String paramString3)
  {
    zzf.zzch(paramString1);
    zzadv = paramString1;
    zzadu = new zzl(paramString2);
    setSessionLabel(paramString3);
  }
  
  public final String getNamespace()
  {
    return zzadv;
  }
  
  public void setSessionLabel(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      zzadu.zzcn(paramString);
    }
  }
  
  public final void zza(zzn paramzzn)
  {
    zzadw = paramzzn;
    if (zzadw == null) {
      zzof();
    }
  }
  
  protected final void zza(String paramString1, long paramLong, String paramString2)
  {
    zzadu.zza("Sending text message: %s to: %s", new Object[] { paramString1, paramString2 });
    zzadw.zza(zzadv, paramString1, paramLong, paramString2);
  }
  
  public void zzb(long paramLong, int paramInt) {}
  
  public void zzcf(String paramString) {}
  
  public void zzof() {}
  
  protected final long zzog()
  {
    return zzadw.zznQ();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */