package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzcl.zza;
import java.util.List;

public class zzd
  extends zzcl.zza
  implements zzh.zza
{
  private Bundle mExtras;
  private Object zzpV = new Object();
  private String zzxW;
  private List zzxX;
  private String zzxY;
  private zzch zzxZ;
  private String zzya;
  private double zzyb;
  private String zzyc;
  private String zzyd;
  private zza zzye;
  private zzh zzyf;
  
  public zzd(String paramString1, List paramList, String paramString2, zzch paramzzch, String paramString3, double paramDouble, String paramString4, String paramString5, zza paramzza, Bundle paramBundle)
  {
    zzxW = paramString1;
    zzxX = paramList;
    zzxY = paramString2;
    zzxZ = paramzzch;
    zzya = paramString3;
    zzyb = paramDouble;
    zzyc = paramString4;
    zzyd = paramString5;
    zzye = paramzza;
    mExtras = paramBundle;
  }
  
  public void destroy()
  {
    zzxW = null;
    zzxX = null;
    zzxY = null;
    zzxZ = null;
    zzya = null;
    zzyb = 0.0D;
    zzyc = null;
    zzyd = null;
    zzye = null;
    mExtras = null;
    zzpV = null;
    zzyf = null;
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
  
  public String getPrice()
  {
    return zzyd;
  }
  
  public double getStarRating()
  {
    return zzyb;
  }
  
  public String getStore()
  {
    return zzyc;
  }
  
  public void zzb(zzh paramzzh)
  {
    synchronized (zzpV)
    {
      zzyf = paramzzh;
      return;
    }
  }
  
  public zzch zzdK()
  {
    return zzxZ;
  }
  
  public com.google.android.gms.dynamic.zzd zzdL()
  {
    return zze.zzC(zzyf);
  }
  
  public String zzdM()
  {
    return "2";
  }
  
  public zza zzdN()
  {
    return zzye;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */