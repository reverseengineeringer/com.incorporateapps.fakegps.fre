package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class zzcf
  extends zzcz
{
  private static final String ID = zzad.zzcy.toString();
  private static final String zzbkc = zzae.zzfO.toString();
  
  public zzcf()
  {
    super(ID);
  }
  
  protected boolean zza(String paramString1, String paramString2, Map paramMap)
  {
    if (zzdf.zzk((zzag.zza)paramMap.get(zzbkc)).booleanValue()) {}
    for (int i = 66;; i = 64) {
      try
      {
        boolean bool = Pattern.compile(paramString2, i).matcher(paramString1).find();
        return bool;
      }
      catch (PatternSyntaxException paramString1)
      {
        return false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */