package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzn
  extends zzak
{
  private static final String ID = zzad.zzbx.toString();
  private static final String VALUE = zzae.zzih.toString();
  
  public zzn()
  {
    super(ID, new String[] { VALUE });
  }
  
  public static String zzFZ()
  {
    return ID;
  }
  
  public static String zzGa()
  {
    return VALUE;
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    return (zzag.zza)paramMap.get(VALUE);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */