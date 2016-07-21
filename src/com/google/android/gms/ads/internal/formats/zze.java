package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzcn.zza;
import java.util.List;

public class zze
  extends zzcn.zza
  implements zzh.zza
{
  private Bundle mExtras;
  private Object zzpV = new Object();
  private String zzxW;
  private List zzxX;
  private String zzxY;
  private String zzya;
  private zza zzye;
  private zzh zzyf;
  private zzch zzyg;
  private String zzyh;
  
  public zze(String paramString1, List paramList, String paramString2, zzch paramzzch, String paramString3, String paramString4, zza paramzza, Bundle paramBundle)
  {
    zzxW = paramString1;
    zzxX = paramList;
    zzxY = paramString2;
    zzyg = paramzzch;
    zzya = paramString3;
    zzyh = paramString4;
    zzye = paramzza;
    mExtras = paramBundle;
  }
  
  public void destroy()
  {
    zzxW = null;
    zzxX = null;
    zzxY = null;
    zzyg = null;
    zzya = null;
    zzyh = null;
    zzye = null;
    mExtras = null;
    zzpV = null;
    zzyf = null;
  }
  
  public String getAdvertiser()
  {
    return zzyh;
  }
  
  public String getBody()
  {
    return zzxY;
  }
  
  public String getCallToAction()
  {
    return zzya;
  }
  
  public String getCustomTemplateId()
  {
    return "";
  }
  
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  public String getHeadline()
  {
    return zzxW;
  }
  
  public List getImages()
  {
    return zzxX;
  }
  
  public void zzb(zzh paramzzh)
  {
    synchronized (zzpV)
    {
      zzyf = paramzzh;
      return;
    }
  }
  
  public zzd zzdL()
  {
    return com.google.android.gms.dynamic.zze.zzC(zzyf);
  }
  
  public String zzdM()
  {
    return "1";
  }
  
  public zza zzdN()
  {
    return zzye;
  }
  
  public zzch zzdO()
  {
    return zzyg;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */