package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class zzz
  implements zzar
{
  private static final Object zzbhz = new Object();
  private static zzz zzbiM;
  private String zzbiN;
  private String zzbiO;
  private zzas zzbiP;
  private zzcd zzbic;
  
  private zzz(Context paramContext)
  {
    this(zzat.zzaZ(paramContext), new zzcs());
  }
  
  zzz(zzas paramzzas, zzcd paramzzcd)
  {
    zzbiP = paramzzas;
    zzbic = paramzzcd;
  }
  
  public static zzar zzaX(Context paramContext)
  {
    synchronized (zzbhz)
    {
      if (zzbiM == null) {
        zzbiM = new zzz(paramContext);
      }
      paramContext = zzbiM;
      return paramContext;
    }
  }
  
  public boolean zzgc(String paramString)
  {
    if (!zzbic.zzlw())
    {
      zzbg.zzaK("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
      return false;
    }
    String str = paramString;
    if (zzbiN != null)
    {
      str = paramString;
      if (zzbiO == null) {}
    }
    try
    {
      str = zzbiN + "?" + zzbiO + "=" + URLEncoder.encode(paramString, "UTF-8");
      zzbg.v("Sending wrapped url hit: " + str);
      zzbiP.zzgg(str);
      return true;
    }
    catch (UnsupportedEncodingException paramString)
    {
      zzbg.zzd("Error wrapping URL for testing.", paramString);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */