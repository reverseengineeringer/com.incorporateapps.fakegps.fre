package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzab
  extends zzak
{
  private static final String ID = zzad.zzbC.toString();
  
  public zzab()
  {
    super(ID, new String[0]);
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    String str2 = Build.MANUFACTURER;
    String str1 = Build.MODEL;
    paramMap = str1;
    if (!str1.startsWith(str2))
    {
      paramMap = str1;
      if (!str2.equals("unknown")) {
        paramMap = str2 + " " + str1;
      }
    }
    return zzdf.zzR(paramMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */