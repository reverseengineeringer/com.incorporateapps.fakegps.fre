package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public abstract class zzc
{
  protected final DataHolder zzahi;
  protected int zzaje;
  private int zzajf;
  
  public zzc(DataHolder paramDataHolder, int paramInt)
  {
    zzahi = ((DataHolder)zzx.zzz(paramDataHolder));
    zzbF(paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof zzc))
    {
      paramObject = (zzc)paramObject;
      bool1 = bool2;
      if (zzw.equal(Integer.valueOf(zzaje), Integer.valueOf(zzaje)))
      {
        bool1 = bool2;
        if (zzw.equal(Integer.valueOf(zzajf), Integer.valueOf(zzajf)))
        {
          bool1 = bool2;
          if (zzahi == zzahi) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  protected boolean getBoolean(String paramString)
  {
    return zzahi.zze(paramString, zzaje, zzajf);
  }
  
  protected byte[] getByteArray(String paramString)
  {
    return zzahi.zzg(paramString, zzaje, zzajf);
  }
  
  protected float getFloat(String paramString)
  {
    return zzahi.zzf(paramString, zzaje, zzajf);
  }
  
  protected int getInteger(String paramString)
  {
    return zzahi.zzc(paramString, zzaje, zzajf);
  }
  
  protected long getLong(String paramString)
  {
    return zzahi.zzb(paramString, zzaje, zzajf);
  }
  
  protected String getString(String paramString)
  {
    return zzahi.zzd(paramString, zzaje, zzajf);
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzaje), Integer.valueOf(zzajf), zzahi });
  }
  
  public boolean isDataValid()
  {
    return !zzahi.isClosed();
  }
  
  protected void zza(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    zzahi.zza(paramString, zzaje, zzajf, paramCharArrayBuffer);
  }
  
  protected void zzbF(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzahi.getCount())) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzab(bool);
      zzaje = paramInt;
      zzajf = zzahi.zzbH(zzaje);
      return;
    }
  }
  
  protected Uri zzcA(String paramString)
  {
    return zzahi.zzh(paramString, zzaje, zzajf);
  }
  
  protected boolean zzcB(String paramString)
  {
    return zzahi.zzi(paramString, zzaje, zzajf);
  }
  
  public boolean zzcz(String paramString)
  {
    return zzahi.zzcz(paramString);
  }
  
  protected int zzqc()
  {
    return zzaje;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.data.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */